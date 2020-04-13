package javaClasses;

import java.util.Random;

public class Trapeze implements IFigure {
	private int sideA;
	private int sideB;
	private int sideC;
	private int sideD;
	private int heightH;

	
	public Trapeze() {
		//setting random values within [0,30] to each variable
		this.sideA = new Random().nextInt(30) + 1;
		this.sideB = new Random().nextInt(30) + 1;
		this.sideC = new Random().nextInt(30) + 1;
		this.sideD = new Random().nextInt(30) + 1;
		this.heightH = new Random().nextInt(30) + 1;
	}

	// Overriding method draw()
	@Override
	public void draw() {
		System.out.println("Here we draw Trapeze");
	}

	// Overriding method getArea()
	@Override
	public int getArea() {
		return 1 / 2 * (sideA + sideB) * heightH;
	}

	// Overriding method getSideLength()
	@Override
	public int getSideLength() {
		return sideC;
	}

	// Overriding method getPerimeter()
	@Override
	public int getPerimeter() {
		return sideA + sideB + sideC + sideD;
	}

	// Overriding method toString()
	@Override
	public String toString() {
		return "Фигура: " + this.getClass().getSimpleName() + ", площадь: " + this.getArea() + " кв.ед., периметр: "
				+ this.getPerimeter() + "ед., цвет: " + Colors.getRandomColor();
	}
}
