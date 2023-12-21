package service;

import exception.VehicleNotFoundException;
import model.Vehicle;

public interface VehicleService {
    Vehicle registerVehicle(Vehicle vehicle);

    Vehicle getVehicle(int id) throws VehicleNotFoundException;

}
