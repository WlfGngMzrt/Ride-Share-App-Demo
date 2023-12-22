package service;

import model.Trip;
import model.TripStrategy;
import repository.TripRepository;

public class TripServiceImpl implements TripService{

    private TripRepository tripRepository;

    public TripServiceImpl(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @Override
    public Trip proposeTrip(Trip trip) {
        return null;
    }

    @Override
    public Trip chooseTrip(String startLocation, String endLocation, int seatCount, TripStrategy tripStrategy) {
        return null;
    }
}
