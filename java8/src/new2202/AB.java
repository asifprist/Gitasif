package new2202;

public class AB {
	
	private int age;
	private String name;
	private long salary;
	private String city;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "AB [age=" + age + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}
	public AB(int age, String name, long salary, String city) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}
	public AB() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
