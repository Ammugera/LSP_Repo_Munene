package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class IntegerSetTest {

    @Test
    @DisplayName("Test case for clear and isEmpty methods")
    void testClearAndIsEmpty() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for length method")
    void testLength() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals(2, set.length());
    }

    @Test
    @DisplayName("Test case for equals method")
    void testEquals() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2));
    }

    @Test
    @DisplayName("Test case for contains method")
    void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test case for largest and smallest methods")
    void testLargestAndSmallest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(3);
        set.add(1);
        set.add(5);
        assertEquals(5, set.largest());
        assertEquals(1, set.smallest());
    }

    @Test
    @DisplayName("Test exception handling for largest and smallest methods")
    void testExceptionHandling() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, set::largest);
        assertThrows(IntegerSetException.class, set::smallest);
    }

    @Test
    @DisplayName("Test case for add method")
    void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(1);
        assertEquals(1, set.length());
    }

    @Test
    @DisplayName("Test case for remove method")
    void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.remove(1);
        assertFalse(set.contains(1));
    }

    @Test
    @DisplayName("Test case for union method")
    void testUnion() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set2.add(2);
        set1.union(set2);
        assertTrue(set1.contains(1) && set1.contains(2));
    }

    @Test
    @DisplayName("Test case for intersect method")
    void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set2.add(1);
        set2.add(2);
        set1.intersect(set2);
        assertEquals(1, set1.length());
    }

    @Test
    @DisplayName("Test case for diff method")
    void testDiff() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set1.diff(set2);
        assertTrue(set1.contains(1) && !set1.contains(2));
    }
}