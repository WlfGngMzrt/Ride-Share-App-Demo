package controller;

import dto.UserRegistrationRequestDTO;
import exception.PassengerNotFoundException;
import model.Passenger;
import model.User;
import repository.PassengerRepository;
import service.PassengerService;
import service.PassengerServiceImpl;

public class PassengerController {
    private PassengerService passengerService;

    public PassengerController(PassengerRepository passengerRepository) {
        this.passengerService = new PassengerServiceImpl(passengerRepository);
    }

    public Passenger registerPassenger(UserRegistrationRequestDTO userDTO) {
        Passenger passenger = new Passenger();
        passenger.setName(userDTO.getName());
        passenger.setAge(userDTO.getAge());
        passenger.setGender(userDTO.getGender());
        passenger.setMobileNumber(userDTO.getMobileNumber());
        return passengerService.registerUser(passenger);
    }

    public User getPassenger(int id) throws PassengerNotFoundException {
        return passengerService.getUser(id);
    }
}
