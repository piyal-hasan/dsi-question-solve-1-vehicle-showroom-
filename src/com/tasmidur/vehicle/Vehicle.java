package com.tasmidur.vehicle;

import com.tasmidur.engine.Engine;

public abstract class Vehicle {
    private String vehicleModelNumber;
    private int vehicleEnginePower;
    private int vehicleTireSize;
    private Engine engine;

    public abstract void showVehicleDetails();

    public String getVehicleModelNumber() {
        return vehicleModelNumber;
    }

    public void setVehicleModelNumber(String vehicleModelNumber) {
        this.vehicleModelNumber = vehicleModelNumber;
    }

    public int getVehicleEnginePower(int i) {
        return vehicleEnginePower;
    }

    public void setVehicleEnginePower(int vehicleEnginePower) {
        this.vehicleEnginePower = vehicleEnginePower;
    }

    public int getVehicleTireSize() {
        return vehicleTireSize;
    }

    public void setVehicleTireSize(int vehicleTireSize) {
        this.vehicleTireSize = vehicleTireSize;
    }
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
