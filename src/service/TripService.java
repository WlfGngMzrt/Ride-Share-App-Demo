package service;

import model.Trip;
import model.TripStrategy;

public interface TripService {

    Trip proposeTrip(Trip trip);

    Trip chooseTrip(String startLocation, String endLocation, int seatCount, TripStrategy tripStrategy);
}
