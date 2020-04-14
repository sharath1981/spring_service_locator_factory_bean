package com.poc.model;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {

	@Override
	public String draw() {
		return "Drawing Square...";
	}

}
