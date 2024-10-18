package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;


public class VotingMachine {
    private Map<String, Integer> candidates;

    /**
     * Initializes a new VotingMachine with an empty list of candidates.
     */
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Adds a new candidate to the list with 0 votes.
     * If the candidate already exists, it prints a message.
     * 
     */
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0);  // Initialize with 0 votes
        } else {
            System.out.println(name + " is already a candidate.");
        }
    }

    /**
     * Casts a vote for the specified candidate.
     * If the candidate is not found, it prints a message.
     * 
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        } else {
            System.out.println("No such candidate: " + name);
        }
    }

    /**
     * Returns a string representation of all candidates and their votes.
     * 
     */
    public String toStringRepresentation() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }

    /**
     * Demonstrates the usage of the VotingMachine class.
     * 
     */
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");
        System.out.println(vm.toStringRepresentation());
    }
}