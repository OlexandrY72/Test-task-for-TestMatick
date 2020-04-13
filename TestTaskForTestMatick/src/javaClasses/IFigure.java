package javaClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface IFigure {

	// method that should be overridden
	void draw();

	// method that should be overridden
	int getArea();

	// a default method that does not necessarily to override
	default int getPerimeter() {
		return 0;
	}

	// a default method that does not necessarily to override
	default int getSideLength() {
		return 0;
	}

	// a default method that does not necessarily to override
	default int getRadius() {
		return 0;
	}

	// static method that prints as many random figures as I specify in a parameter numberOfFigures
	public static void getRandomFigure(int numberOfFigures) {
		List<IFigure> list = new ArrayList<>();
		Random rand = new Random();

		for (int i = 0; i < numberOfFigures; i++) {
			list.add(new Square());
			list.add(new Triangle());
			list.add(new Trapeze());
			list.add(new Circle());
			System.out.println(list.get(rand.nextInt(list.size())));
		}
	}
}
