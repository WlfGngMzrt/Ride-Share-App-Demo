package dto;

import model.VehicleType;

public class VehicleRegistrationRequestDTO {

    private String color;
    private String model;
    private String regNo;
    private VehicleType vehicleType;
    private int capacity;

    public VehicleRegistrationRequestDTO(String color, String model, String regNo, VehicleType vehicleType, int capacity) {
        this.color = color;
        this.model = model;
        this.regNo = regNo;
        this.vehicleType = vehicleType;
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
}
