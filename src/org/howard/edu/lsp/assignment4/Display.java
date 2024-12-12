package org.howard.edu.lsp.assignment4;

import java.util.List;

public class Display {
    public void updateDisplay(List<Aircraft> aircraftList) {
        System.out.println("Updated Display:");
        for (Aircraft aircraft : aircraftList) {
            System.out.println(aircraft);
        }
    }
}
