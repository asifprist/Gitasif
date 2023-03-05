package EmpsortBydec$inc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8EmoDemo {
	public static void main(String[] args) {
		
	List<Employee> emplist=new ArrayList<Employee>();
	
	emplist.add(new Employee(1,500));
	emplist.add(new Employee(2,800));
	emplist.add(new Employee(3,700));
	emplist.add(new Employee(4,400));
	emplist.add(new Employee(5,900));
	emplist.add(new Employee(6,200));
	emplist.add(new Employee(7,100));
	
	List<Employee> emplist2=emplist.stream().sorted((a1,a2)->(int)(a2.getSalary()-a1.getSalary()))
			//.limit(3)
			.skip(3)
			.collect(Collectors.toList());
	System.out.println(emplist2);
	
	}
}
