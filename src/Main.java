import controller.DriverController;
import controller.PassengerController;
import controller.TripController;
import controller.VehicleController;
import dto.TripProposalRequestDTO;
import dto.UserRegistrationRequestDTO;
import dto.VehicleRegistrationRequestDTO;
import exception.DriverNotFoundException;
import exception.PassengerNotFoundException;
import exception.VehicleNotFoundException;
import model.*;
import repository.DriverRepository;
import repository.PassengerRepository;
import repository.TripRepository;
import repository.VehicleRepository;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws DriverNotFoundException, PassengerNotFoundException, VehicleNotFoundException {
        //first always create your repos - As these repos only will be passed to
        //various services and controllers

        DriverRepository driverRepository = new DriverRepository();
        PassengerRepository passengerRepository = new PassengerRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TripRepository tripRepository = new TripRepository();

        //created the controllers for the entities
        DriverController driverController = new DriverController(driverRepository);
        PassengerController passengerController = new PassengerController(passengerRepository);
        VehicleController vehicleController = new VehicleController(vehicleRepository,driverRepository);
        TripController tripController = new TripController(tripRepository,driverRepository);
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

        System.out.println(savedUser);


        //proposing a trip
        TripProposalRequestDTO tripDTO = new TripProposalRequestDTO("Bangalore","Guntur",vehicleController.getVehicle(1), TripStatus.NEW,4);
        Trip proposedTrip = tripController.proposeTrip(tripDTO);
        System.out.println(proposedTrip);






    }

}