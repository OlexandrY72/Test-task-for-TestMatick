package javaClasses;

import java.util.Random;

public class Square implements IFigure {

	private int sideA;

	public Square() {
		//setting random values within [0,30] to a variable
		this.sideA = new Random().nextInt(30) + 1;
	}

	// Overriding method draw()
	@Override
	public void draw() {
		System.out.println("Here we draw Square");
	}

	// Overriding method getArea()
	@Override
	public int getArea() {
		return sideA * sideA;
	}

	// Overriding method getSideLength()
	@Override
	public int getSideLength() {
		return sideA;
	}
	
	// Overriding method getPerimeter()
	@Override
	public int getPerimeter() {
		return sideA * 4;
	}

	// Overriding method toString()
	@Override
	public String toString() {
		return "Figure: " + this.getClass().getSimpleName() + ", area: " + this.getArea() + " square units., perimeter: "
				+ this.getPerimeter() + " units., color: " + Colors.getRandomColor();
	}
}
