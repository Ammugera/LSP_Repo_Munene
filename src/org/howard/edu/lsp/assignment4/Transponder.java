package org.howard.edu.lsp.assignment4;

public class Transponder {
    private Aircraft aircraft;

    public Transponder(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public String transmitData() {
        // Simulate high-density packet format
        return "TYPE:" + aircraft.getType() + ";FLIGHT:" + aircraft.getFlightNumber() + 
               ";LAT:" + aircraft.getLatitude() + ";LON:" + aircraft.getLongitude() + 
               ";ALT:" + aircraft.getAltitude();
    }
}