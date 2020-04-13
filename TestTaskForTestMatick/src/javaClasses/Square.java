package javaClasses;

import java.util.Random;

public class Square implements IFigure {

	private int sideA;

	public Square() {
		this.sideA = new Random().nextInt(30) + 1;
	}

	@Override
	public void draw() {
		System.out.println("Here we draw Square");
	}

	@Override
	public int getArea() {
		return sideA * sideA;
	}

	public int getSideLength() {
		return sideA;
	}

	@Override
	public int getPerimeter() {
		return sideA * 4;
	}

	@Override
	public String toString() {
		return "Фигура: " + this.getClass().getSimpleName() + ", площадь: " + this.getArea() + " кв.ед., периметр: "
				+ this.getPerimeter() + "ед., цвет: " + Colors.getRandomColor();
	}
}
