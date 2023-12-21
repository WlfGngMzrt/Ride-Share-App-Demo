package repository;

import exception.VehicleNotFoundException;
import model.Vehicle;

import java.util.HashMap;

public class VehicleRepository {

    private HashMap<Integer, Vehicle> vehicleMap;
    private static int idCounter = 0;
    public VehicleRepository() {
        this.vehicleMap = new HashMap<>();
    }

    public Vehicle saveVehicle(Vehicle vehicle)
    {
        if(vehicle.getId() == 0)
        {
            vehicle.setId(++idCounter);
        }
        return vehicleMap.put(vehicle.getId(), vehicle);
    }

    public Vehicle getVehicle(int id) throws VehicleNotFoundException {
        Vehicle vehicle = vehicleMap.get(id);
        if(vehicle == null)
        {
            throw new VehicleNotFoundException("Vehicle not found with the id : " + id);
        }
        return vehicle;
    }
}
