package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * IntegerSet class provides functionality for working with a set of integers.
 * The class lets you perform basic operations like union, intersect, and difference.
 */
public class IntegerSet {
    private List<Integer> set = new ArrayList<>();

    /**
     * Default constructor - just initializes an empty set.
     */
    public IntegerSet() {
    }

    /**
     * Constructor to initialize the set with a list of integers.
     * 
     * @param set A list of integers to start with.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>(set);
    }

    /**
     * Clears all elements from the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Finds how many elements are in the set.
     * 
     * @return The number of elements in the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Compares this set with another one for equality.
     * Two sets are equal if they have the exact same values, in any order.
     * 
     * @param o The object to compare with.
     * @return Returns true if the sets are equal; otherwise, false.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof IntegerSet) {
            IntegerSet otherSet = (IntegerSet) o;
            return set.containsAll(otherSet.set) && otherSet.set.containsAll(set);
        }
        return false;
    }

    /**
     * Checks if a value is in the set.
     * 
     * @param value The value to search for.
     * @return Returns true if the value is in the set; false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Finds the largest value in the set.
     * 
     * @return The largest value.
     * @throws IllegalStateException if the set is empty.
     */
    public int largest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Can't find largest in an empty set");
        }
        return Collections.max(set);
    }

    /**
     * Finds the smallest value in the set.
     * 
     * @return The smallest value.
     * @throws IllegalStateException if the set is empty.
     */
    public int smallest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Can't find smallest in an empty set");
        }
        return Collections.min(set);
    }

    /**
     * Adds a value to the set. Does nothing if the value already exists.
     * 
     * @param item The value to add.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes a value from the set. If the value doesn't exist, no action is taken.
     * 
     * @param item The value to remove.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Combines this set with another set (union operation).
     * 
     * @param intSetb The other set.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Keeps only the elements that are common in both sets (intersection).
     * 
     * @param intSetb The other set.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Removes elements from this set that are in another set (difference operation).
     * 
     * @param intSetb The other set.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Checks whether the set is empty.
     * 
     * @return true if the set has no elements; otherwise, false.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string that represents the set.
     * 
     * @return A string in the format [a, b, c].
     */
    @Override
    public String toString() {
        return set.toString();
    }
}