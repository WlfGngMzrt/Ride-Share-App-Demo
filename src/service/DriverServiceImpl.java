package service;

import exception.DriverNotFoundException;
import model.Driver;
import model.Trip;
import model.User;
import model.Vehicle;
import repository.DriverRepository;

public class DriverServiceImpl implements DriverService {

    private DriverRepository driverRepository;

    public DriverServiceImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public Driver registerUser(Driver driver) {
            return driverRepository.saveDriver(driver);
    }

    @Override
    public User getUser(int id) throws DriverNotFoundException {
        Driver driver = driverRepository.getDriver(id);
        if(driver == null)
        {
            throw new DriverNotFoundException("Driver not found with the id : " + id);
        }
        return driver;
    }

    @Override
    public Vehicle registerVehicle(Vehicle vehicle, int driverId) throws DriverNotFoundException {
        Driver driver = driverRepository.getDriver(driverId);
        driver.getVehicleList().add(vehicle);
        return vehicle;
    }

    @Override
    public Trip registerTrip(Trip trip, int driverId) throws DriverNotFoundException {
        Driver driver = driverRepository.getDriver(driverId);
        driver.getTripList().add(trip);
        return trip;
    }
}
