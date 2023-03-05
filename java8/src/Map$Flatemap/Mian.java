package Map$Flatemap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Mian {
	
	public static void main(String[] args) {
		
		List<String> citiesWorkedIn1=new ArrayList<String>();
		citiesWorkedIn1.add("patna");
		citiesWorkedIn1.add("delhi");
		citiesWorkedIn1.add("mumbai");
		citiesWorkedIn1.add("chennai");
		Employee e1=new Employee(1,"afsar",citiesWorkedIn1);
		
		
		
		
		List<String> b2=new ArrayList<String>();
		b2.add("trichy");
		b2.add("thanjavour");
		b2.add("pondichery");
		b2.add("tambaram");
		Employee e2=new Employee(2,"asif",b2);
		
		
		
		List<String> b3=new ArrayList<String>();
		b3.add("pak");
		b3.add("bangladeh");
		b3.add("nepal");
		b3.add("srilanka");
		Employee e3=new Employee(3,"mister",b3);
		
		List<Employee> emplist=new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		System.out.println(emplist);
		
		
//		List<Integer> ides=new ArrayList<Integer>();
//		for(Employee employee : emplist)
//		ides.add(employee.getId());
//		
//		System.out.println(ides);
		
		
	List<Integer> ides=emplist.stream().map(emp->emp.getId()).collect(Collectors.toList());
		System.out.println(ides);
		System.out.println(emplist);
		
		Set<String> cityfltmap=emplist.stream().flatMap(emp->emp.getCitiesWorkedIn().stream()).collect(Collectors.toSet());
		
		System.out.println(cityfltmap);
		
		
		
		
		
	}

}
