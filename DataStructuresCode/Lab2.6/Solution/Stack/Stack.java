package com.algorithms;

public class Stack<V> {
    private LinkedListNode<V> head = null;

    public void push(V item) {
        if (item!=null) {
            LinkedListNode<V> node = new LinkedListNode<V>(item, head);
            head = node;
        }
    }

    public V pop() {
        if (head!=null) {
            LinkedListNode<V> node = head;
            head = node.getNext();
            return node.getValue();
        }
        return null;
    }
}
