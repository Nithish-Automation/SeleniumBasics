package java81;

import java.util.Arrays;
import java.util.List;

public class Add {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,2,32,3,5);
		int add = numbers.stream().mapToInt(n->n).sum();
		System.out.println(add);
	}

}
