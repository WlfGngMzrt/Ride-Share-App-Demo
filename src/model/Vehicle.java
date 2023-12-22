package model;

public class Vehicle {
    private int id;
    private String color;
    private String model;
    private String regNo;
    private VehicleType vehicleType;
    private int capacity;
    private int driverId;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", regNo='" + regNo + '\'' +
                ", vehicleType=" + vehicleType +
                ", capacity=" + capacity +
                ", driverId=" + driverId +
                '}';
    }
}
