package com.poc.factory;

import com.poc.model.Shape;

public interface ShapeFactory {
	Shape getShape(String name);
}
