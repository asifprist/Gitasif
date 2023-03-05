package new2202;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ABC {

	public static void main(String[] args) {
		//Integer[] arr=new Integer[] {1,4,3,2,6,47,2,2,3,1};
		//List<Integer> l = Arrays.asList(arr);
		List<Integer> l= Arrays.asList(1,4,3,2,6,47,2,2,3,1);
		List<Integer> set = l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(set);

	}

}
