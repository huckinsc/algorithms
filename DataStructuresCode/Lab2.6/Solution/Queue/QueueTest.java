package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    Queue<Customer> queue = null;
    @Before
    public void setUp() throws Exception {
        queue = new Queue<>();
        queue.enqueue(new Customer(12345, "Andrew Smith", 255));
    }

    @Test
    public void enqueueToNonEmptyQueuePositive() {
        String expected1 = "Andrew Smith";
        String expected2 = "Jane Smith";
        Customer cust = new Customer(23456, expected2, 300);
        queue.enqueue(cust);
        String actual = queue.dequeue().getName();
        assertEquals(expected1, actual);
        actual = queue.dequeue().getName();
        assertEquals(expected2, actual);
    }

    @Test
    public void dequeueExistingSingleElementPositive() {
        String expected = new Customer(12345, "Andrew Smith", 255).toString();
        String actual = queue.dequeue().toString();
        assertEquals(expected.toString(), actual);
    }

    @Test
    public void dequeueExistingTwoElementPositive() {
        String expected = new Customer(12345, "Andrew Smith", 255).toString();
        String expected2 = "Jane Smith";
        Customer cust = new Customer(23456, expected2, 300);
        queue.enqueue(cust);
        String actual = queue.dequeue().toString();
        assertEquals(expected.toString(), actual);
    }

    @Test
    public void dequeueEmptyQueueNegative() {
        queue = new Queue<>();
        assertNull(queue.dequeue());
    }

    @Test
    public void enqueueNullNegative() {
        queue.enqueue(null);
        String expected = new Customer(12345, "Andrew Smith", 255).toString();
        String actual = queue.dequeue().toString();
        assertEquals(expected.toString(), actual);
    }
}