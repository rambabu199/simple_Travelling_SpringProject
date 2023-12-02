package com.example.demo.servicesImpl;

import org.springframework.stereotype.Service;

import com.example.demo.service.TravellingMode;
@Service
public class TravelByTrain implements TravellingMode{

	@Override
	public String travelmode() {
		return "i want to travel by train";
	}

}
