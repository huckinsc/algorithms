import java.util.Optional;

public class SinglyLinkedList<V> {
    private LinkedListNode<V> head;
    public SinglyLinkedList() {

        head = null;
    }

    public void addFront(V item) {

        this.head = new LinkedListNode<>(item, head);
    }

    public void deleteFront() {
        LinkedListNode<V> firstNode = this.head;

//        this.head = firstNode.flatMap(LinkedListNode::getNext).
//                orElse(null);
        // if firstNode's value is not null, use it to get the next node and
        // assign it to head.  If it is null, assign null to head
        if (firstNode!=null){
            LinkedListNode<V> node = head.getNext();
            if (node!=null){
                LinkedListNode<V> tempNode = node;
                this.head.setNext(null);
                this.head = node;
            }
            else{
                this.head = null;
            }
        }//       firstNode.ifPresent(n -> n.setNext(null));
    }

    public LinkedListNode<V> getHead(){
        return head;
    }

    public void reverseRecursively(){
        System.out.println("Hello World!");
        reverse(this.head);
    }

    private void reverse(LinkedListNode<V> node){
        if(node != null){
            LinkedListNode<V> next = node.getNext();
            if(next != null){
                reverse(next);
            }
            System.out.println(node.getValue().toString());
        }
    }

    public int traverseList(boolean print){
        int count = 0;
        LinkedListNode<V> curNode = getHead();
        while(curNode!=null){
            if(print) {
                System.out.println(curNode.toString());
            }
            curNode = curNode.getNext();
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        LinkedListNode<V> cur = head;
        while(cur != null){
            builder.append(cur);
            builder.append("\n");
            LinkedListNode<V> next = cur.getNext();
            if(next!=null){
                cur = next;
            }
            else{
                cur = null;
            }
        }
        return builder.toString();
    }
}
