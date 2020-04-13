package javaClasses;

import java.util.Random;

public class Triangle implements IFigure {
	private int sideA;
	private int sideB;
	private int sideC;

	public Triangle() {
		//setting random values within [0,30] to each variable
		this.sideA = new Random().nextInt(30) + 1;
		this.sideB = new Random().nextInt(30) + 1;
		this.sideC = new Random().nextInt(30) + 1;
	}

	// Overriding method draw()
	@Override
	public void draw() {
		System.out.println("Here we draw Triangle");
	}

	// Overriding method getArea()
	@Override
	public int getArea() {
		return sideA * sideB * 1 / 2;
	}

	// Overriding method getSideLength()
	public int getSideLength() {
		return sideC;
	}

	// Overriding method getPerimeter()
	@Override
	public int getPerimeter() {
		return sideA + sideB + sideC;
	}

	// Overriding method toString()
	@Override
	public String toString() {
		return "Figure: " + this.getClass().getSimpleName() + ", area: " + this.getArea() + " square units., perimeter: "
				+ this.getPerimeter() + " units., color: " + Colors.getRandomColor();
	}
}
