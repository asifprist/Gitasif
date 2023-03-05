package emp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
	
	public static void main(String[] args) {
		
	Emp e1=new Emp("Bala",1000,18,"Delhi");
	Emp e2=new Emp("kala",2000,28,"Haryana");
	Emp e3=new Emp("lala",4000,23,"Bihar");
	Emp e4=new Emp("dala",9000,18,"punjab");
	Emp e5=new Emp("nala",4000,55,"china");
	List<Emp> list=new CopyOnWriteArrayList<>();
	      list.add(e1);
	      list.add(e2);
	      list.add(e3);
	      list.add(e4);
	      list.add(e5);
	  
   list.stream().filter(e->e.getAge()>25).map(e->{
	e.getSalary(e.setSalary()*1.10);
	return e;
         }).forEach(m->System.out.println(m));

		
		
		
		
		
		
		
	}

}
