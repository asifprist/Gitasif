package Program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfChar {

	public static void main(String[] args) {
     /*
		List<String> list= Arrays.asList("aa","bb","cc","aa","dd","dd");
		
		Set<String> se = new HashSet<>(list);
		System.out.println(se);
		Set<String> set = new HashSet<>();
		
		
		
		System.out.println("________________________________________________");
		
	list.stream().filter(n->!set.add(n)).collect(Collectors.toList()).
	forEach(p->System.out.println(p));
	
	
		Map<String, Long> m= list.stream().
		collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		m.entrySet().stream().forEach(x->{
			
			System.out.println(x.getKey()+"   "+x.getValue());
			
		});
		*/
		
		List<String> list = Arrays.asList("Afsar","Ali","Asif","Moazzam","Ali","Moazzam","Ali","Moazzam");
		
		
		list.stream().distinct().collect(Collectors.toList()).forEach(r->System.out.println(r));
		//Set<String> s1= new HashSet<String>(list);
		//s1.stream().forEach(a->System.out.println(a));
		System.out.println("______________________");
		Set<String> s= new HashSet<String>();
		
		
		
		
	list.stream().filter(m->!s.add(m)).collect(Collectors.toSet()).
	forEach(n->System.out.println(n));	
		System.out.println("___________________");
	Map<String,Long> m=list.stream().collect(Collectors.groupingBy
			(Function.identity(),Collectors.counting()));
		m.entrySet().forEach(x->{
			System.out.println(x.getKey()+" "+x.getValue());
			
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
