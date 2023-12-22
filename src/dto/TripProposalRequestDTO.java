package dto;

import model.TripStatus;
import model.Vehicle;

public class TripProposalRequestDTO {
    private String origin;
    private String destination;
    private Vehicle vehicle;
    private TripStatus tripStatus;
    private int availableSeats;

    public TripProposalRequestDTO(String origin, String destination, Vehicle vehicle, TripStatus tripStatus, int availableSeats) {
        this.origin = origin;
        this.destination = destination;
        this.vehicle = vehicle;
        this.tripStatus = tripStatus;
        this.availableSeats = availableSeats;
    }
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
