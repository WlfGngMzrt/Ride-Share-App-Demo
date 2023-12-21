package model;

import java.util.List;

public class Passenger extends User {

    private List<Trip> tripList;

    public List<Trip> getTripList() {
        return tripList;
    }

    public void setTripList(List<Trip> tripList) {
        this.tripList = tripList;
    }
    public String toString() {
        return "Passenger{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", gender=" + super.getGender() +
                ", rating=" + super.getRating()+
                ", reviews=" + super.getReviews() +
                ", mobileNumber='" + super.getMobileNumber() + '\'' +
                ", tripList=" + tripList +
                '}';
    }
}
