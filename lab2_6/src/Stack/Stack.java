package Stack;

//import com.packt.datastructuresandalg.lesson2.linkedlist.LinkedListNode;
import java.util.Optional;

public class Stack<V> {
    private LinkedListNode<V> head;

    public void push(V item) {
//        pseudo-code
//        if (item != null)
//            node = new LinkedListNode(item, head)
//            head = node
        if (item != null){
            LinkedListNode<V> node = new LinkedListNode<V>(item,head);
            head = node;
        }

    }

    public Optional<V> pop() {
//      pseudo-code
//        if (head != null)
              
//             node = head
//             head = node.next
//             return node.valuez
//        return null
        if (head != null){
            LinkedListNode<V> node = head;
            head = node.getNext();
            return Optional.of(node.getValue());
        }
        return null;
    }
}
