package javaClasses;

import java.util.Random;

public class Circle implements IFigure {
	private int radius;

	public Circle() {
		this.radius = new Random().nextInt(30) + 1;
	}

	@Override
	public void draw() {
		System.out.println("Here we draw Circle");
	}

	@Override
	public int getArea() {
		return (int) 3.14 * radius * radius;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return "������: " + this.getClass().getSimpleName() + ", ������: " + this.getRadius() + ", �������: "
				+ this.getArea() + " ��.��., ����: " + Colors.getRandomColor();
	}
}
