package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

public class AircraftDatabase {
    private List<Aircraft> aircraftList;

    public AircraftDatabase() {
        this.aircraftList = new ArrayList<>();
    }

    public void addAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

    public List<Aircraft> getAircraftList() {
        return new ArrayList<>(aircraftList);
    }
}