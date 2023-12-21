package controller;

import dto.VehicleRegistrationRequestDTO;
import exception.DriverNotFoundException;
import exception.VehicleNotFoundException;
import model.Driver;
import model.User;
import model.Vehicle;
import repository.DriverRepository;
import repository.VehicleRepository;
import service.DriverService;
import service.DriverServiceImpl;
import service.VehicleService;
import service.VehicleServiceImpl;

import java.util.List;

public class VehicleController {
    private VehicleService vehicleService;
    private DriverService driverService;

    public VehicleController(VehicleRepository vehicleRepository, DriverRepository driverRepository) {
        this.vehicleService = new VehicleServiceImpl(vehicleRepository);
        this.driverService = new DriverServiceImpl(driverRepository);
    }

    public Vehicle registerVehicle(int driverId, VehicleRegistrationRequestDTO vehicleDTO) throws DriverNotFoundException {
        Vehicle vehicle = new Vehicle();
        vehicle.setModel(vehicleDTO.getModel());
        vehicle.setColor(vehicleDTO.getColor());
        vehicle.setRegNo(vehicleDTO.getRegNo());
        vehicle.setVehicleType(vehicleDTO.getVehicleType());
        vehicle.setCapacity(vehicleDTO.getCapacity());
        vehicle.setDriverId(driverId);
        driverService.registerVehicle(vehicle,driverId);
        return vehicleService.registerVehicle(vehicle);
    }

    public Vehicle getVehicle(int vehicleId) throws VehicleNotFoundException {
        return vehicleService.getVehicle(vehicleId);
    }
}
