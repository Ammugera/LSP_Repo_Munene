package org.howard.edu.lsp.assignment4;

public class Aircraft {
    private String type;
    private String flightNumber;
    private double latitude;
    private double longitude;
    private double altitude;

    public Aircraft(String type, String flightNumber, double latitude, double longitude, double altitude) {
        this.type = type;
        this.flightNumber = flightNumber;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public String getType() {
        return type;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    @Override
    public String toString() {
        return "Aircraft [type=" + type + ", flightNumber=" + flightNumber + 
               ", latitude=" + latitude + ", longitude=" + longitude + 
               ", altitude=" + altitude + "]";
    }
}
