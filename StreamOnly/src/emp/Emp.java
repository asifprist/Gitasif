package emp;

public class Emp {
	private String name;
	private long salary;
	private int age;
	private String city;
	
	



	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Emp(String name, long salary, int age, String city) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.city = city;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + ", age=" + age + ", city=" + city + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
