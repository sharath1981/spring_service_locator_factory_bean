package com.poc.model;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	@Override
	public String draw() {
		return "Drawing Circle...";
	}

}
