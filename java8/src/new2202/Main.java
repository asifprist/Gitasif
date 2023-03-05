package new2202;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
	
		AB a1=new AB(9,"ala",12000,"patna");
		AB a2=new AB(23,"bala",78000,"patna");
		AB a3=new AB(76,"kaa",92000,"ranchi");
		AB a4=new AB(45,"mala",92000,"chennai");
		AB a5=new AB(32,"akla",32000,"patna");
		
		List<AB> l = Arrays.asList(a1,a2,a3,a4,a5);
		List<Integer> list = l.stream().filter(x->x.getAge()>20).map(AB::getAge).collect(Collectors.toList());
		List<Long> c = l.stream().map(AB::getSalary).collect(Collectors.toList());
		List<Long> k = l.stream().filter(x->x.getSalary()>50000).map(AB::getSalary).collect(Collectors.toList());
		List<AB> n = l.stream().filter(r->r.getAge()>4).distinct().collect(Collectors.toList());
		System.out.println(n);
		
		
		
		
		
		
		
		
		
		
		
		
		//l.stream().map(AB::getCity).distinct().forEach(System.out::println);
		Map<String, Long> count = l.stream().collect(Collectors.groupingBy(AB::getCity,Collectors.counting()));
		//System.out.println(count);
		
	Map<String, Double> collect = l.stream().collect(Collectors.groupingBy(AB::getCity,Collectors.averagingInt(AB::getAge)));
		//System.out.println(collect);
		//Map<String, List<AB>> d = l.stream().collect(Collectors.groupingBy(AB::getCity));
		//List<String> c= l.stream().map(AB::getName).collect(Collectors.toList());
		//String a = String.join(",",c);
		//List<Integer> collect = l.stream().filter(e->e.getAge()>30).map(AB::getAge).collect(Collectors.toList());
		//System.out.println(collect);
		List<String> collect2 = l.stream().filter(e->e.getCity()!="patna").map(AB::getCity).collect(Collectors.toList());
		//System.out.println(collect2);
		//List<String> collect3 = l.stream().filter(x->x.getName()!="ala").map(AB::getName).collect(Collectors.toList());
		//System.out.println(collect3);
		//long m = l.stream().filter(x->x.getSalary()>50000).count();
		//System.out.println(m);
		//List<Integer> b = Arrays.asList(11,12);
		//OptionalDouble average = b.stream().mapToInt(n->n*n).filter(n->n>1000).average();
		//System.out.println(average);
		 //System.out.println(c);
		 //System.out.println(a);
		//System.out.println(collect2);
		

		
		
		/*List<Integer> b = Arrays.asList(87,33,64,31,98);
		List<Integer> k = b.stream().filter(x->x%2==0).collect(Collectors.toList());
		
		System.out.println(k);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
