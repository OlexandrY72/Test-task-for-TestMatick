package javaClasses;

import java.util.Random;

public class Circle implements IFigure {
	private int radius;

	public Circle() {
		//setting random values within [0,30] to a variable
		this.radius = new Random().nextInt(30) + 1;
	}

	// Overriding method draw()
	@Override
	public void draw() {
		System.out.println("Here we draw Circle");
	}

	// Overriding method getArea()
	@Override
	public int getArea() {
		return (int) 3.14 * radius * radius;
	}

	// Overriding method getRadius()
	@Override
	public int getRadius() {
		return radius;
	}

	// Overriding method toString()
	@Override
	public String toString() {
		return "Фигура: " + this.getClass().getSimpleName() + ", радиус: " + this.getRadius() + ", площадь: "
				+ this.getArea() + " кв.ед., цвет: " + Colors.getRandomColor();
	}
}
