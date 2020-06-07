package com.tasmidur.showroom;

import com.tasmidur.engine.DieselEngine;
import com.tasmidur.engine.GasEngine;
import com.tasmidur.engine.OilEngine;
import com.tasmidur.vehicle.HeavyVehicle;
import com.tasmidur.vehicle.NormalVehicle;
import com.tasmidur.vehicle.SportsVehicle;
import com.tasmidur.vehicle.Vehicle;

public class Customer {
    public static void main(String[] args) {


        VehicleShowRoom vehicleShowRoom=new VehicleShowRoom();

        Vehicle sportsVehicle1=new SportsVehicle();
        sportsVehicle1.setVehicleModelNumber("sp-3000");
        sportsVehicle1.setVehicleEnginePower(3000);
        sportsVehicle1.setVehicleTireSize(50);

        Vehicle sportsVehicle2 = new SportsVehicle();
        sportsVehicle2.setVehicleModelNumber("sp-4000");
        sportsVehicle2.setVehicleEnginePower(4000);
        sportsVehicle2.setVehicleTireSize(60);

        Vehicle sportsVehicle3 = new SportsVehicle();
        sportsVehicle3.setVehicleModelNumber("sp-5000");
        sportsVehicle3.setVehicleEnginePower(5000);
        sportsVehicle3.setVehicleTireSize(70);

        Vehicle heavyVehicle1 = new HeavyVehicle();
        heavyVehicle1.setVehicleModelNumber("HV-3000");
        heavyVehicle1.setVehicleEnginePower(4000);
        heavyVehicle1.setVehicleTireSize(80);

        Vehicle heavyVehicle2 = new HeavyVehicle();
        heavyVehicle2.setVehicleModelNumber("HV-3000");
        heavyVehicle2.setVehicleEnginePower(5000);
        heavyVehicle2.setVehicleTireSize(70);

        Vehicle normalVehicle1 = new NormalVehicle();
        normalVehicle1.setVehicleModelNumber("NM-3000");
        normalVehicle1.setVehicleEnginePower(1500);
        normalVehicle1.setVehicleTireSize(90);

        Vehicle normalVehicle2 = new NormalVehicle(new GasEngine());
        normalVehicle2.setVehicleModelNumber("NM-3000");
        normalVehicle2.setVehicleEnginePower(1700);
        normalVehicle2.setVehicleTireSize(95);


        //Add new Vehicle in Showroom
        vehicleShowRoom.addVehicle(normalVehicle1);
        vehicleShowRoom.addVehicle(normalVehicle2);
        vehicleShowRoom.addVehicle(heavyVehicle1);
        vehicleShowRoom.addVehicle(heavyVehicle2);
        vehicleShowRoom.addVehicle(sportsVehicle1);
        vehicleShowRoom.addVehicle(sportsVehicle2);
        vehicleShowRoom.addVehicle(sportsVehicle3);
        vehicleShowRoom.showVehicleListWithVisitors("adding new Sports Vehicle in Showroom");

        //Remove Vehicle from the Showroom

        vehicleShowRoom.removeVehicle(sportsVehicle1);
        vehicleShowRoom.showVehicleListWithVisitors("removing Sports Vehicle from Showroom");
        vehicleShowRoom.removeVehicle(heavyVehicle2);
        vehicleShowRoom.addVehicle(sportsVehicle1);//add vehicle
        vehicleShowRoom.showVehicleListWithVisitors("adding new Sports Vehicle in Showroom");
        vehicleShowRoom.showVehicleListWithDetails();


    }

}
