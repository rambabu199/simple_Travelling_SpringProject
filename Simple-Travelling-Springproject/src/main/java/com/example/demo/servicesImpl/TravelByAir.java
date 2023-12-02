package com.example.demo.servicesImpl;

import org.springframework.stereotype.Service;

import com.example.demo.service.TravellingMode;
@Service
public class TravelByAir implements TravellingMode{

	@Override
	public String travelmode() {
		return "I want to travel by Air";
	}

}
