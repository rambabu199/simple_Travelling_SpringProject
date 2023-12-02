package com.example.demo.servicesImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.service.TravellingMode;
@Service
@Primary
public class TravelByBus implements TravellingMode{

	@Override
	public String travelmode() {
		return "i want to travel by bus";
	}

}
