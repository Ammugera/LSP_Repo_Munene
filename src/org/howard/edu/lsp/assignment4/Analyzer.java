package org.howard.edu.lsp.assignment4;

import java.util.List;

public class Analyzer {
    public void analyze(List<Aircraft> aircraftList) {
        // Simple analysis for dangerous situations
        for (Aircraft aircraft : aircraftList) {
            if (aircraft.getAltitude() < 1000) {
                System.out.println("Warning: Low altitude for " + aircraft.getFlightNumber());
            }
        }
    }
}
