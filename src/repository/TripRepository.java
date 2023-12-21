package repository;

import exception.TripNotFoundException;
import model.Trip;

import java.util.HashMap;

public class TripRepository {

    private HashMap<Integer, Trip> tripMap;
    private static int idCounter = 0;
    public TripRepository() {
        this.tripMap = new HashMap<>();
    }

    public Trip saveTrip(Trip trip)
    {
        if(trip.getId() == 0)
        {
            trip.setId(++idCounter);
        }
        return tripMap.put(trip.getId(), trip);
    }

    public Trip getTrip(int id) throws TripNotFoundException {
        Trip trip = tripMap.get(id);
        if(trip == null)
        {
            throw new TripNotFoundException("Trip not found with the id : " + id);
        }
        return trip;
    }
}
