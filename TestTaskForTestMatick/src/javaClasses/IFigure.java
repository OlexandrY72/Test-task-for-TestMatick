package javaClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface IFigure {
	void draw();

	int getArea();

	default int getPerimeter() {
		return 0;
	}

	default int getSideLength() {
		return 0;
	}

	default int getRadius() {
		return 0;
	}

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
