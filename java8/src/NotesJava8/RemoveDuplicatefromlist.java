package NotesJava8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatefromlist {
	public static void main(String[] args) {
		
		List<Integer> withdup = Arrays.asList(6,8,5,9,5,3);
		System.out.println(withdup);
		Set<Integer> without = withdup.stream().collect(Collectors.toSet());
		without.forEach((i)->System.out.println("" +i));
		
		
		OptionalDouble be = withdup.stream().mapToInt(b->b*b).filter(b->b>80).average();
		System.out.println(be);
		
	}

}
