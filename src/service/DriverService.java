package service;

import dto.UserRegistrationRequestDTO;
import exception.DriverNotFoundException;
import model.Driver;
import model.User;
import model.Vehicle;

public interface DriverService {

    Driver registerUser(Driver driver);

    User getUser(int id) throws DriverNotFoundException;
    Vehicle registerVehicle(Vehicle vehicle, int driverId) throws DriverNotFoundException;


}
