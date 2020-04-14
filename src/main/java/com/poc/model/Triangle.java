package com.poc.model;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

	@Override
	public String draw() {
		return "Drawing Triangle...";
	}

}
