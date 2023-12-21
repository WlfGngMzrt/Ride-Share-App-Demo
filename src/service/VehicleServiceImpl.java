package service;

import exception.VehicleNotFoundException;
import model.Vehicle;
import repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService{

    private VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle registerVehicle(Vehicle vehicle) {
        return vehicleRepository.saveVehicle(vehicle);
    }

    @Override
    public Vehicle getVehicle(int id) throws VehicleNotFoundException {
        Vehicle vehicle = vehicleRepository.getVehicle(id);
        if(vehicle == null)
        {
            throw new VehicleNotFoundException("Vehicle not found with the id : " + id);
        }
        return vehicle;
    }
}
