package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.demo.service.TravellingMode;

@Controller
public class Travelling_controller {
	
	@Autowired
	public final TravellingMode travelingmode;

	public Travelling_controller(TravellingMode travelingmode) {
		super();
		this.travelingmode = travelingmode;
	}
	
	public String travelby()
	{
		return travelingmode.travelmode();
	}
	
	

}
