package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.ApartDataInterface;
import com.example.demo.data.ApartDataService;


@RestController
public class SampleController {
	@Autowired
	ApartDataService service;
	
	@GetMapping("/apartment")
	@CrossOrigin
	public List<? extends ApartDataInterface> Apart() {
		System.out.println("apartment/index");
		return service.getAll();
	}

}
