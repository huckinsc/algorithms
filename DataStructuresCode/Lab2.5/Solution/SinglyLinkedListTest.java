package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {
    SinglyLinkedList<Customer> custList = null;
    @Before
    public void setup(){
        //SinglyLinkedList<Customer> custList1;
        custList = new SinglyLinkedList<>();
        custList.addFront(new Customer(12345, "Andrew Smith", 255));
        custList.addFront(new Customer(23456, "Betty Smith", 355));
        custList.addFront(new Customer(34567, "Charlie Smith", 455));
        custList.addFront(new Customer(45678, "Dora Smith", 555));
        custList.addFront(new Customer(56789, "Edward Smith", 655));
        custList.addFront(new Customer(67890, "Francie Smith", 755));
        custList.addFront(new Customer(78901, "Gregory Smith", 855));
    }
    @Test
    public void addFront() {

    }

    @Test
    public void deleteFront() {
        custList.deleteFront();
        int expectedCustNo = 67890;
        LinkedListNode<Customer> head = custList.getHead();
        int actualCustNo = head.getValue().getCustNo();
        assertEquals(expectedCustNo, actualCustNo);
    }

    @Test
    public void sizePositive() {
        int expectedSize = 7;
        int actual = custList.traverseList(false);
        assertEquals(expectedSize, actual);
    }

    @Test
    public void getHead() {
        int expectedCustNo = 78901;
        LinkedListNode<Customer> head = custList.getHead();
        int actualCustNo = head.getValue().getCustNo();
        assertEquals(expectedCustNo, actualCustNo);
    }

    @Test
    public void reverseRecursivelyPositive() {
        custList.reverseRecursively();
    }

    @Test
    public void traverseListPositive() {
        int expectedSize = 7;
        int actualSize = custList.traverseList(true);
        assertEquals(expectedSize, actualSize);
    }
    @Test
    public void toStringPositive() {

    }

    @Test
    public void reverse() {
    }
}