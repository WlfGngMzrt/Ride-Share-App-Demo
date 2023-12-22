package controller;

import dto.TripProposalRequestDTO;
import exception.DriverNotFoundException;
import exception.TripNotFoundException;
import model.Trip;
import model.User;
import repository.DriverRepository;
import repository.TripRepository;
import service.DriverService;
import service.DriverServiceImpl;
import service.TripService;
import service.TripServiceImpl;

public class TripController {

    private TripService tripService;
    private DriverService driverService;

    public TripController(TripRepository tripRepository, DriverRepository driverRepository) {
        this.tripService = new TripServiceImpl(tripRepository);
        this.driverService = new DriverServiceImpl(driverRepository);
    }

    public Trip proposeTrip(TripProposalRequestDTO tripDTO) throws DriverNotFoundException {
        Trip trip = new Trip();
        trip.setOrigin(tripDTO.getOrigin());
        trip.setDestination(tripDTO.getDestination());
        trip.setTripStatus(tripDTO.getTripStatus());
        trip.setAvailableSeats(tripDTO.getAvailableSeats());
        trip.setVehicle(tripDTO.getVehicle());
        User proposer = driverService.getUser(trip.getVehicle().getDriverId());
        driverService.registerTrip(trip, proposer.getId());
        return tripService.proposeTrip(trip);
    }

    public Trip getTrip(int id) throws TripNotFoundException {
        return tripService.getTrip(id);
    }
}
