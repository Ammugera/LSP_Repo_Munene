package org.howard.edu.lsp.assignment6;

import java.util.ArrayList;
import java.util.List;

/**
 * The IntegerSet class represents a mathematical set of integers
 * and provides methods to perform various operations such as union,
 * intersection, difference, and basic set operations.
 */
public class IntegerSet {
    private List<Integer> set = new ArrayList<>();

    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the length of the set.
     * 
     * @return the size of the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if two sets are equal.
     * 
     * @param b another IntegerSet to compare.
     * @return true if the sets are equal, false otherwise.
     */
    public boolean equals(IntegerSet b) {
        return set.containsAll(b.set) && b.set.containsAll(set);
    }

    /**
     * Checks if the set contains a specific value.
     * 
     * @param value the value to check.
     * @return true if the value is in the set, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest value in the set.
     * 
     * @return the largest integer in the set.
     * @throws IntegerSetException if the set is empty.
     */
    public int largest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        return set.stream().max(Integer::compare).get();
    }

    /**
     * Returns the smallest value in the set.
     * 
     * @return the smallest integer in the set.
     * @throws IntegerSetException if the set is empty.
     */
    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        return set.stream().min(Integer::compare).get();
    }

    /**
     * Adds an item to the set or does nothing if it already exists.
     * 
     * @param item the item to add.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set or does nothing if it doesn't exist.
     * 
     * @param item the item to remove.
     */
    public void remove(int item) {
        set.remove((Integer) item);
    }

    /**
     * Performs the union of this set with another set.
     * 
     * @param intSetb the other set.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Performs the intersection of this set with another set.
     * 
     * @param intSetb the other set.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Performs the difference of this set with another set.
     * 
     * @param intSetb the other set.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Checks if the set is empty.
     * 
     * @return true if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns the string representation of the set.
     * 
     * @return a string representing the set.
     */
    public String toString() {
        return set.toString();
    }
}

/**
 * Custom exception for IntegerSet operations.
 */
class IntegerSetException extends Exception {
    public IntegerSetException(String message) {
        super(message);
    }
}