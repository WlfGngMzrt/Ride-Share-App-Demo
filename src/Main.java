import controller.DriverController;
import controller.PassengerController;
import controller.VehicleController;
import dto.UserRegistrationRequestDTO;
import dto.VehicleRegistrationRequestDTO;
import exception.DriverNotFoundException;
import exception.PassengerNotFoundException;
import model.User;
import model.UserType;
import model.Vehicle;
import model.VehicleType;
import repository.DriverRepository;
import repository.PassengerRepository;
import repository.VehicleRepository;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws DriverNotFoundException, PassengerNotFoundException {
        //first always create your repos - As these repos only will be passed to
        //various services and controllers

        DriverRepository driverRepository = new DriverRepository();
        PassengerRepository passengerRepository = new PassengerRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        //created the controllers for the entities
        DriverController driverController = new DriverController(driverRepository);
        PassengerController passengerController = new PassengerController(passengerRepository);
        VehicleController vehicleController = new VehicleController(vehicleRepository,driverRepository);

        //registering the user
        UserRegistrationRequestDTO userDTO1 = new UserRegistrationRequestDTO("Syandan",25,'M',"123456", UserType.DRIVER);

        User savedUser;

        driverController.registerDriver(userDTO1);
        savedUser = driverController.getDriver(1);
        System.out.println(savedUser);

        UserRegistrationRequestDTO userDTO2 = new UserRegistrationRequestDTO("Ram",45,'M',"123785", UserType.PASSENGER);

        User savedUser2;
        passengerController.registerPassenger(userDTO2);
        savedUser2 = passengerController.getPassenger(1);
        System.out.println(savedUser2);


        //registering a vehicle;
        VehicleRegistrationRequestDTO vehicleDTO = new VehicleRegistrationRequestDTO("Black","Kia Sonet","KA 03 9867", VehicleType.SUV,4);
        Vehicle savedVehicle = vehicleController.registerVehicle(1,vehicleDTO);
        System.out.println(savedVehicle);

        System.out.println(savedUser);



    }

}