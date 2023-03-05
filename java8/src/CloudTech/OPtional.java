package CloudTech;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OPtional {

	public static void main(String[] args) {
		
		List<Integer> numb=Arrays.asList(1,2,3,4,5,6,7,9,33);
		List<Integer> r = numb.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(r);

	}

}
