package com.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.factory.ShapeFactory;

@RestController
@RequestMapping("shape")
public class ShapeController {
	
	@Autowired
	private ShapeFactory shapeFactory;
	
	@GetMapping("{name}")
	public String getShape(@PathVariable String name) {
		return shapeFactory.getShape(name).draw();
	}


}
