package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public String findFlight (Flight flight) throws RouteNotFoundException{
        Map<String,Boolean> destinations = new HashMap<>();

        String homeAirport = "Home Airport";
        Flight flight1 = new Flight(homeAirport,"Airport1");
        Flight flight2 = new Flight(homeAirport,"Airport2");
        Flight flight3 = new Flight(homeAirport,"Airport3");
        Flight flight4 = new Flight(homeAirport,"Airport4");

        destinations.put(flight1.getArrivalAirport(), true);
        destinations.put(flight2.getArrivalAirport(), true);
        destinations.put(flight3.getArrivalAirport(), true);
        destinations.put(flight4.getArrivalAirport(), true);
        destinations.put("Airport5", false);
        destinations.put("Airport6", false);

        if (destinations.containsKey(flight.getArrivalAirport())){
            return "Flight to " + flight.getArrivalAirport() + " found.";
        } else {
            throw new RouteNotFoundException();
        }
    }
    public static void main(String[] args){
        FlightFinder flightFinder = new FlightFinder();
        Flight testFlight = new Flight("S Airport", "F Airport");
        try {
            System.out.println(flightFinder.findFlight(testFlight));
        } catch (RouteNotFoundException e) {
            System.out.println("Destination not found");
        } finally {
            System.out.println("Thanks for cooperation");
        }

        try {
            System.out.println(flightFinder.findFlight(new Flight("S1 Airport", "Airport1")));
        } catch (RouteNotFoundException e) {
            System.out.println("Destination not found");
        } finally {
            System.out.println("Thanks for cooperation");
        }
    }
}
