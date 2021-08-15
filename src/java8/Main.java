package java8;

import java.util.function.Consumer;

public class Main {
	static void perform(Animal animal) {
		animal.run();

	}

	public static void main(String[] args) {
		/*
		 * perform(new Dog());
		 * 
		 * perform(() -> System.out.println("lamda dag")); perform(() ->
		 * System.out.println("lamda dog 2"));
		 */
		stringOpration((s) -> System.out.println(s.toLowerCase()));
		stringOpration((s) -> System.out.println(s.toUpperCase()));

	}

	public static void stringOpration(Consumer<String> consumer) {
		String name="NIThish";
		consumer.accept(name);

	}
}
