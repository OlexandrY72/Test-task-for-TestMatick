package javaClasses;

import java.util.Random;

public enum Colors {
	Black, White, Orange, Purple, Green;

	public static Colors getRandomColor() {
		Random random = new Random();
		return values()[random.nextInt(values().length)];
	}
}
