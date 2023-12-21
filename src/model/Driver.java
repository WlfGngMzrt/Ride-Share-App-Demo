package model;

import java.util.ArrayList;
import java.util.List;

public class Driver extends User {

   private List<Vehicle> vehicleList;
   private List<Trip> tripList;

   public Driver() {
      this.vehicleList = new ArrayList<Vehicle>();
      this.tripList = new ArrayList<Trip>();
   }

   public List<Vehicle> getVehicleList() {
      return vehicleList;
   }
   public void setVehicleList(List<Vehicle> vehicleList) {
      this.vehicleList = vehicleList;
   }

   public List<Trip> getTripList() {
      return tripList;
   }

   public void setTripList(List<Trip> tripList) {
      this.tripList = tripList;
   }

   @Override
   public String toString() {
      return "Driver{" +
              "id=" + super.getId() +
              ", name='" + super.getName() + '\'' +
              ", age='" + super.getAge() + '\'' +
              ", gender=" + super.getGender() +
              ", rating=" + super.getRating()+
              ", reviews=" + super.getReviews() +
              ", mobileNumber='" + super.getMobileNumber() + '\'' +
              "vehicleList=" + vehicleList +
              ", tripList=" + tripList +
              '}';
   }
}
