package controller;

import dto.TripProposalRequestDTO;
import model.Trip;
import repository.DriverRepository;
import repository.TripRepository;
import service.DriverService;
import service.TripService;
import service.TripServiceImpl;

public class TripController {

    private TripService tripService;

    public TripController(TripRepository tripRepository) {
        this.tripService = new TripServiceImpl(tripRepository);
    }

    public Trip proposeTrip(TripProposalRequestDTO tripDTO)
    {
        Trip trip = new Trip();
        trip.setOrigin(tripDTO.getOrigin());
        trip.setDestination(tripDTO.getDestination());
        trip.setTripStatus(tripDTO.getTripStatus());
        trip.setAvailableSeats(tripDTO.getAvailableSeats());
        return tripService.proposeTrip(trip);
    }
}
