package javaClasses;

import java.util.Random;

public class Trapeze implements IFigure {
	private int sideA;
	private int sideB;
	private int sideC;
	private int sideD;
	private int heightH;

	public Trapeze() {
		this.sideA = new Random().nextInt(30) + 1;
		this.sideB = new Random().nextInt(30) + 1;
		this.sideC = new Random().nextInt(30) + 1;
		this.sideD = new Random().nextInt(30) + 1;
		this.heightH = new Random().nextInt(30) + 1;
	}

	@Override
	public void draw() {
		System.out.println("Here we draw Trapeze");
	}

	@Override
	public int getArea() {
		return 1 / 2 * (sideA + sideB) * heightH;
	}

	public int getSideLength() {
		return sideC;
	}

	@Override
	public int getPerimeter() {
		return sideA + sideB + sideC + sideD;
	}

	@Override
	public String toString() {
		return "Фигура: " + this.getClass().getSimpleName() + ", площадь: " + this.getArea() + " кв.ед., периметр: "
				+ this.getPerimeter() + "ед., цвет: " + Colors.getRandomColor();
	}
}
