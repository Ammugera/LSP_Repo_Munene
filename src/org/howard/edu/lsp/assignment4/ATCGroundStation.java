package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

public class ATCGroundStation {
    private AircraftDatabase database;
    private Display display;
    private Analyzer analyzer;

    public ATCGroundStation(AircraftDatabase database, Display display, Analyzer analyzer) {
        this.database = database;
        this.display = display;
        this.analyzer = analyzer;
    }

    public void receiveData(String packet) {
        // Parse the packet and create an Aircraft object
        String[] data = packet.split(";");
        String type = data[0].split(":")[1];
        String flight = data[1].split(":")[1];
        double lat = Double.parseDouble(data[2].split(":")[1]);
        double lon = Double.parseDouble(data[3].split(":")[1]);
        double alt = Double.parseDouble(data[4].split(":")[1]);

        Aircraft aircraft = new Aircraft(type, flight, lat, lon, alt);
        database.addAircraft(aircraft);
        display.updateDisplay(database.getAircraftList());
        analyzer.analyze(database.getAircraftList());
    }
}
