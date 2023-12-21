package repository;

import exception.PassengerNotFoundException;
import model.Passenger;

import java.util.HashMap;

public class PassengerRepository {

    private HashMap<Integer, Passenger> passengerMap;
    private static int idCounter = 0;
    public PassengerRepository() {
        this.passengerMap = new HashMap<>();
    }

    public Passenger savePassenger(Passenger passenger)
    {
        if(passenger.getId() == 0)
        {
            passenger.setId(++idCounter);
        }
        return passengerMap.put(passenger.getId(), passenger);
    }

    public Passenger getPassenger(int id) throws PassengerNotFoundException {
        Passenger passenger = passengerMap.get(id);
        if(passenger == null)
        {
            throw new PassengerNotFoundException("Passenger not found with the id : " + id);
        }
        return passenger;
    }
}
