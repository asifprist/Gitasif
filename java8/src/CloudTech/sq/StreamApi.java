package CloudTech.sq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		
		
		List<Integer> num=Arrays.asList(8,6,1,2,3,4,4,3,5);
		num.stream().map(x->x*x*x).forEach(System.out::println);
		num.stream().filter(x->x>2).forEach(System.out::println);
		List<Integer> sl=num.stream().sorted().collect(Collectors.toList());
		System.out.println(sl);
		
		Integer min = num.stream().min((x,y)->x-y).get();
		System.out.println(min);
		
		 long m = num.stream().count();
		System.out.println(m);
		

	}

}
