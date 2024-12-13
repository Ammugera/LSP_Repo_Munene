package org.howard.edu.lsp.assignment5;

/**
 * Driver class to test the IntegerSet implementation.
 */
public class Driver {
    public static void main(String[] args) {
        // Create a new IntegerSet and add elements
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Set1: " + set1.toString());
        System.out.println("Smallest value in Set1: " + set1.smallest());
        System.out.println("Largest value in Set1: " + set1.largest());

        // Create another IntegerSet
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Set2: " + set2.toString());

        // Perform union operation and print results
        System.out.println("Union of Set1 and Set2:");
        set1.union(set2);
        System.out.println("Set1 after union: " + set1.toString());

        // Perform intersection operation and print results
        System.out.println("Intersection of Set1 and Set2:");
        set1.intersect(set2);
        System.out.println("Set1 after intersection: " + set1.toString());

        
        System.out.println("Difference of Set1 and Set2:");
        set1.diff(set2);
        System.out.println("Set1 after difference: " + set1.toString());

        // Check if the set is empty, then clear it
        System.out.println("Is Set1 empty? " + set1.isEmpty());
        set1.clear();
        System.out.println("Set1 after clearing: " + set1.toString());

        // Add a few more elements and retest
        set1.add(10);
        set1.add(20);
        set1.add(30);
        System.out.println("New Set1: " + set1.toString());

   
        set1.remove(20);
        System.out.println("Set1 after removing 20: " + set1.toString());

 
        System.out.println("Does Set1 contain 10? " + set1.contains(10));
        System.out.println("Does Set1 contain 40? " + set1.contains(40));
    }
}