package com.tasmidur.showroom;

import com.tasmidur.vehicle.SportsVehicle;
import com.tasmidur.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleShowRoom {

    private int expectedVisitor;
    private List<Vehicle> vehicles;

    public VehicleShowRoom() {
        expectedVisitor = 30;
        vehicles = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        if (vehicle instanceof SportsVehicle)
            expectedVisitor += 20;
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
        if (vehicle instanceof SportsVehicle)
            expectedVisitor -= 20;

    }

    public int getExpectedVisitor() {
        return expectedVisitor;
    }

    public void setExpectedVisitor(int expectedVisitor) {
        this.expectedVisitor = expectedVisitor;
    }

    public void showVehicleListWithDetails() {
        System.out.println("Vehicles List With Details Feature");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (Vehicle vehicle : vehicles) {
            vehicle.showVehicleDetails();
        }
    }

    public void showVehicleListWithVisitors(String statusmsg) {
        System.out.println("Expected Current  Visitors after "+statusmsg+": " + getExpectedVisitor());
        System.out.println("Vehicle List:");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (Vehicle vehicle : vehicles) {
            System.out.println("Model: "+vehicle.getVehicleModelNumber());

        }
    }
}
