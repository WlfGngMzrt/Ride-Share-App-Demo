package repository;

import exception.DriverNotFoundException;
import model.Driver;

import java.util.HashMap;

public class DriverRepository {

    private HashMap<Integer, Driver> driverMap;
    private static int idCounter = 0;
    public DriverRepository() {
        this.driverMap = new HashMap<>();
    }

    public Driver saveDriver(Driver driver)
    {
        if(driver.getId() == 0)
        {
            driver.setId(++idCounter);
        }
        return driverMap.put(driver.getId(), driver);
    }

    public Driver getDriver(int id) throws DriverNotFoundException {
        Driver driver = driverMap.get(id);
        if(driver == null)
        {
            throw new DriverNotFoundException("Driver not found with the id : " + id);
        }
        return driver;
    }
}
