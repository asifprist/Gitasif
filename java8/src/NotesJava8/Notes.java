package NotesJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Notes {
	public static void main(String[] args) {
		
		
		List<Employee> list =createEmployeeList();
		List<String> list1 = list.stream().filter(e->e.getAge()>32).map(Employee::getName).collect(Collectors.toList());
		list1.forEach((name)->System.out.println(name));
		System.out.println("---------------");
		
		List<String> list2 = list.stream().filter(e->e.getAge()>2).map(Employee::getName).collect(Collectors.toList());
		list2.forEach((age)->System.out.println(age));
		
		long list3 = list.stream().filter(e->e.getAge()>4).count();
		System.out.println(list3);
		
		Optional<Employee> list4 = list.stream().filter(e->e.getName().equalsIgnoreCase("as")).findAny();
		System.out.println(list4);
		OptionalInt list5 = list.stream().mapToInt(Employee::getAge).max();
		System.out.println(list5);
		
		list.sort((e1,e2)->e2.getAge()-e1.getAge());
		list.forEach(System.out::println);
		
		
		
		List<String> list7 = list.stream().map(Employee::getName).collect(Collectors.toList());
	String dr = String.join(",", list7);
		
		
		System.out.println(dr);
		
		
		Map<String, List<Employee>> uid = list.stream().collect(Collectors.groupingBy(Employee::getName));
		System.out.println("name " +uid);
		
		
		
		
		
		
		
		
		
}

	public static List<Employee> createEmployeeList() {
		
		List<Employee> list = new ArrayList<>();
		Employee e1=new Employee("as",6);
		Employee e2=new Employee("b",76);
		Employee e3=new Employee("as",96);
		Employee e4=new Employee("d",62);
		Employee e5=new Employee("as",26);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		return list;
	}
}
