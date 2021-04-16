import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class SimpleBinaryTree<K, V> implements BinaryTree<K, V> {
    protected BinaryTreeNode<K, V> root;

    public void put(K key, V value) {
        if (root == null)
            root = new BinaryTreeNode<>(key, value);
        else
            put(key, value, root);
    }

    private void put(K key, V value, BinaryTreeNode<K, V> node) {
        if (((Comparable) key).compareTo(node.getKey()) == 0) {
            node.setKey(key);
            node.setValue(value);
        } else if (((Comparable) key).compareTo(node.getKey()) < 0) {
            if (node.getLeft().isPresent())
                put(key, value, node.getLeft().get());
            else
                node.setLeft(new BinaryTreeNode<>(key, value));
        } else {
            if (node.getRight().isPresent())
                put(key, value, node.getRight().get());
            else
                node.setRight(new BinaryTreeNode<>(key, value));
        }
    }

    public Optional<V> get(K key) {
        return Optional.ofNullable(root).flatMap(n -> get(key, n));
    }

    private Optional<V> get(K key, BinaryTreeNode<K, V> node) {
        if (((Comparable) key).compareTo(node.getKey()) == 0)
            return Optional.of(node.getValue());
        else if (((Comparable) key).compareTo(node.getKey()) < 0)
            return node.getLeft().flatMap(n -> get(key, n));
        else
            return node.getRight().flatMap(n -> get(key, n));
    }

    public void leftRotate(BinaryTreeNode<K, V> nodeX,
                           BinaryTreeNode<K, V> parent) {
        BinaryTreeNode<K, V> nodeY = nodeX.getRight().get();
        nodeX.setRight(nodeY.getLeft().orElse(null));
        if (parent == null)
            this.root = nodeY;
        else if (parent.getLeft().filter(n -> n == nodeX).isPresent())
            parent.setLeft(nodeY);
        else
            parent.setRight(nodeY);
        nodeY.setLeft(nodeX);
    }

    public void rightRotate(BinaryTreeNode<K, V> nodeX,
                            BinaryTreeNode<K, V> parent) {
        BinaryTreeNode<K, V> nodeY = nodeX.getLeft().get();
        nodeX.setLeft(nodeY.getRight().orElse(null));
        if (parent == null)
            this.root = nodeY;
        else if (parent.getRight().filter(n -> n == nodeX).isPresent())
            parent.setRight(nodeY);
        else
            parent.setLeft(nodeY);
        nodeY.setRight(nodeX);
    }


    public Optional<K> minKey() {
        return Optional.ofNullable(root).map(this::minKey);
    }

    protected K minKey(BinaryTreeNode<K, V> node) {
        return node.getLeft().map(this::minKey).orElse(node.getKey());
    }

    public void printBfs() {
        Optional.ofNullable(root).ifPresent(r -> {
            Queue<BinaryTreeNode<K, V>> queue = new LinkedList<>();
            queue.add(r);
            while (!queue.isEmpty()) {
                BinaryTreeNode<K, V> node = queue.remove();
                System.out.println(node.getKey());
                node.getLeft().ifPresent(queue::add);
                node.getRight().ifPresent(queue::add);
            }
        });
    }

    public void calculateHeights(){
        calculateHeight(this.root);
    }

    public void balanceTree(){
        balanceTree(this.root,null);
    }

    private void balanceTree(BinaryTreeNode<K, V> node,BinaryTreeNode<K, V> parent){
        int leftHeight = 0;
        if (node.getLeft().isPresent()){
            balanceTree(node.getLeft().get(),node);
            leftHeight = calculateHeight(node.getLeft().get());
        }
        int rightHeight = 0;
        if (node.getRight().isPresent()) {
            balanceTree(node.getRight().get(),node);
            rightHeight = calculateHeight(node.getRight().get());
        }
        int balanceFactor = leftHeight - rightHeight;
        if (balanceFactor > 1)
            rightRotate(node,parent);
        else if (balanceFactor < -1)
            rightRotate(node, parent);
    }

    private int calculateHeight(BinaryTreeNode<K, V> node) {
        if (node != null){
            int leftHeight = 0;
            if (node.getLeft().isPresent()){
                leftHeight = calculateHeight(node.getLeft().get());
            }
            int rightHeight = 0;
            if (node.getRight().isPresent()) {
                rightHeight = calculateHeight(node.getRight().get());
            }
            System.out.println(String.format("Node %,d - Left Height: %,d, Right Height: %,d, Balance Factor: %,d",node.getKey(),leftHeight,rightHeight, leftHeight - rightHeight));
            return (leftHeight > rightHeight) ? leftHeight + 1 : rightHeight + 1;
        }
        return 0;
    }


    public void printDfs() {
        Optional.ofNullable(root).ifPresent(this::printDfs);
    }

    private void printDfs(BinaryTreeNode<K, V> node) {
        //System.out.println("PREORDER " + node.getKey());
        node.getLeft().ifPresent(this::printDfs);
        System.out.println("INORDER " + node.getKey());
        node.getRight().ifPresent(this::printDfs);
        //System.out.println("POSTORDER " + node.getKey());
    }


    public static void main(String[] args) {
        SimpleBinaryTree<Integer, String> binaryTree = new SimpleBinaryTree<Integer, String>();
        System.out.println(binaryTree.minKey());

        binaryTree.put(4, "Isabel");
        binaryTree.put(3, "John");
        binaryTree.put(6, "Ruth");
        binaryTree.put(2, "Sarah");
        binaryTree.put(1, "Peter");
        binaryTree.put(7, "Tom");

    /*
        System.out.println(binaryTree.get(4));
        System.out.println(binaryTree.get(3));
        System.out.println(binaryTree.get(6));
        System.out.println(binaryTree.get(2));
        System.out.println(binaryTree.get(1));
        System.out.println(binaryTree.get(7));
*/
        binaryTree.put(5, "Sam");

/*
        System.out.println(binaryTree.get(5));
        System.out.println(binaryTree.get(9));
        System.out.println(binaryTree.minKey());
*/
        //binaryTree.printDfs();
        //System.out.println("Before rotation.");
        //binaryTree.printBfs();
        System.out.println("Before rotation");
        binaryTree.calculateHeights();
        System.out.println("perform rotation");
        binaryTree.balanceTree();
        System.out.println("After rotation");
        binaryTree.calculateHeights();
        binaryTree.printBfs();
    }
}
