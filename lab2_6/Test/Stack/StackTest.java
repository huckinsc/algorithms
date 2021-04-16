package Stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void testStack_pushOnePopOne(){
        Stack<String> s = new Stack<String>();
        s.push("One");
        assertEquals("One",s.pop().get());
    }

    @Test
    public void testStack_pushOnePopPopTwo(){
        Stack<String> s = new Stack<String>();
        s.push("One");
        assertEquals("One",s.pop().get());
        assertNull(s.pop());
    }

    @Test
    public void testStack_pushTwoPopPopTwo(){
        Stack<String> s = new Stack<String>();
        s.push("One");
        s.push("Two");
        assertEquals("Two",s.pop().get());
        assertEquals("One",s.pop().get());
        assertNull(s.pop());
    }
    @Test
    public void testStack_pushTwoPopOnePushOnePopTwo(){
        Stack<String> s = new Stack<String>();
        s.push("One");
        s.push("Two");
        assertEquals("Two",s.pop().get());
        s.push("Three");
        assertEquals("Three",s.pop().get());
        assertEquals("One",s.pop().get());
        assertNull(s.pop());
    }
}