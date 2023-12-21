package service;

import dto.UserRegistrationRequestDTO;
import exception.PassengerNotFoundException;
import model.Driver;
import model.Passenger;
import model.User;
import repository.PassengerRepository;

public class PassengerServiceImpl implements PassengerService{

    private PassengerRepository passengerRepository;

    public PassengerServiceImpl(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public Passenger registerUser(Passenger passenger) {
        return passengerRepository.savePassenger(passenger);
    }

    @Override
    public User getUser(int id) throws PassengerNotFoundException {
        User passenger = passengerRepository.getPassenger(id);
        if(passenger == null)
        {
            throw new PassengerNotFoundException("Passenger not found with the id : " + id);
        }
        return passenger;
    }
}
