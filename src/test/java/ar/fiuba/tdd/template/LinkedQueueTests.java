package ar.fiuba.tdd.template;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedQueueTests {

    LinkedQueue<Integer> linkedQueue;

    @Before
    public void setUp() {
        linkedQueue = new LinkedQueue<Integer>();
    }

    @After
    public void tearDown() {
        linkedQueue = null;
    }

    @Test
    public void testAdd() {
        linkedQueue.add(1);
        linkedQueue.add(2);
        assertEquals(linkedQueue.size(), 2);
    }

    @Test
    public void testTop() {
        int data = 3;
        linkedQueue.add(data);
        assertEquals((int) linkedQueue.top(), data);
    }

    @Test
    public void testRemove() {
        linkedQueue.add(2);
        assertEquals(linkedQueue.size(), 1);
        linkedQueue.remove();
        assertEquals(linkedQueue.size(), 0);
    }

    @Test
    public void testIsEmpty() {
        assertEquals(linkedQueue.isEmpty(), true);
        linkedQueue.add(1);
        assertEquals(linkedQueue.isEmpty(), false);
    }

    @Test(expected = AssertionError.class)
    public void testRemoveEmpty() {
        linkedQueue.remove();
    }

    @Test(expected = AssertionError.class)
    public void testTopEmpty() {
        linkedQueue.top();
    }

    @Test
    public void testRemoveMany() {
        linkedQueue.add(1);
        linkedQueue.add(2);
        linkedQueue.add(3);
        assertEquals(linkedQueue.size(), 3);
        linkedQueue.remove();
        assertEquals(linkedQueue.size(), 2);
        linkedQueue.remove();
        assertEquals(linkedQueue.size(), 1);
        linkedQueue.remove();
        assertEquals(linkedQueue.size(), 0);
    }

    @Test
    public void testTopMany() {
        linkedQueue.add(1);
        linkedQueue.add(2);
        linkedQueue.add(3);
        assertEquals((int) linkedQueue.top(), 1);
        linkedQueue.remove();
        assertEquals((int) linkedQueue.top(), 2);
        linkedQueue.remove();
        assertEquals((int) linkedQueue.top(), 3);
    }
}
