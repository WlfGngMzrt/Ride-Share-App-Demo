package controller;

import dto.UserRegistrationRequestDTO;
import exception.DriverNotFoundException;
import model.Driver;
import model.User;
import repository.DriverRepository;
import service.DriverService;
import service.DriverServiceImpl;

public class DriverController {

    private DriverService driverService;

    public DriverController(DriverRepository driverRepository) {
        this.driverService = new DriverServiceImpl(driverRepository);

    }

    public Driver registerDriver(UserRegistrationRequestDTO userDTO) {
        Driver driver = new Driver();
        driver.setName(userDTO.getName());
        driver.setAge(userDTO.getAge());
        driver.setGender(userDTO.getGender());
        driver.setMobileNumber(userDTO.getMobileNumber());
        return driverService.registerUser(driver);
    }

    public User getDriver(int id) throws DriverNotFoundException {
        return driverService.getUser(id);
    }
}
