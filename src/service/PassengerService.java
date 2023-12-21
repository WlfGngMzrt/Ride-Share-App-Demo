package service;

import dto.UserRegistrationRequestDTO;
import exception.PassengerNotFoundException;
import model.Passenger;
import model.User;

public interface PassengerService {
    Passenger registerUser(Passenger passenger);

    User getUser(int id) throws PassengerNotFoundException;
}
