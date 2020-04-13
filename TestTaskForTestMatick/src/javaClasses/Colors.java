package javaClasses;

import java.util.Random;

public enum Colors {
	Black, White, Orange, Purple, Green;

	//creating getRandomColor() method that returns a random color from the enum
	public static Colors getRandomColor() {
		Random random = new Random();
		return values()[random.nextInt(values().length)];
	}
}
