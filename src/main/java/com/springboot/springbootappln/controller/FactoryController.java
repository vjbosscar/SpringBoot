package com.springboot.springbootappln.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootappln.service.Vehicle;
import com.springboot.springbootappln.service.VehicleFac;

@RestController
public class FactoryController {
	
	@Autowired
	VehicleFac vehicleFac;
	
	
	@GetMapping("/get/vehicle")
	public String getVehicleType(@RequestParam String Vehicle) {
     Vehicle veh = vehicleFac.getInstance(Vehicle)	;
	return veh.typeVeh();
	}

}
