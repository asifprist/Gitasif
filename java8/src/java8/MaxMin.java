package java8;

import java.util.Arrays;
import java.util.List;

public class MaxMin {
	public static void main(String[] args) {
		
		
		List<Integer> a = Arrays.asList(3,2,2,3,7,9,5);
		Integer max = a.stream().max((i,j)->i.compareTo(j)).get();
		System.out.println(max);
		Integer s=a.stream().min((j,o)->j.compareTo(o)).get();
		System.out.println(s);
		
		
	}

}
