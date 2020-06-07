package com.tasmidur.vehicle;

import com.tasmidur.engine.DieselEngine;
import com.tasmidur.engine.Engine;
import com.tasmidur.engine.GasEngine;

public class NormalVehicle extends Vehicle {

    private final String vehicleTypeName="Normal";

    public NormalVehicle() {
        super.setEngine(new DieselEngine());
    }

    public NormalVehicle(Engine engine) {
        super.setEngine(engine);
    }

    @Override
    public void showVehicleDetails() {
        System.out.println("Vehicle Type Name: " + vehicleTypeName);
        System.out.println("Model Number: " + super.getVehicleModelNumber());
        System.out.println("Features of the Vehicle:");
        System.out.println("1. Engine Power: " + super.getVehicleModelNumber());
        System.out.println("2. Tire Size: " + super.getVehicleTireSize());
        System.out.println("3. Engine Type: " + super.getEngine().getEngineName());
        System.out.println("4. It's a Normal Vehicle.\n\n");
    }
}
