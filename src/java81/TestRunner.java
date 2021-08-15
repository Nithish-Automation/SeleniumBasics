package java81;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestRunner {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("NITHISH, automation, TESTing");

		Consumer<String> name = (s) -> System.out.println(s);
		Consumer<String> name1 = (s) -> System.out.println(s.toUpperCase());
		list.forEach(name.andThen(name1));
	}
	List<Integer> list = Arrays.asList(1,2,2,2,3,1);

}


