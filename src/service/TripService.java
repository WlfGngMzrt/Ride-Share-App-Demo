package service;

import exception.TripNotFoundException;
import model.Trip;
import model.TripStrategy;

public interface TripService {

    Trip proposeTrip(Trip trip);

    Trip chooseTrip(String startLocation, String endLocation, int seatCount, TripStrategy tripStrategy);

    Trip getTrip(int tripId) throws TripNotFoundException;
}
