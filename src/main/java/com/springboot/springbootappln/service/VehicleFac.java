package com.springboot.springbootappln.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class VehicleFac {
		
	public Vehicle getInstance(String str) {
		if(str.equals("Bus")) {
			return new Bus();
		}
		else{
			return new Car();
		}
	}
}
