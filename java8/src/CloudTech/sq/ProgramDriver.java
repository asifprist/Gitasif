package CloudTech.sq;

public class ProgramDriver {
	public static void main(String[] args) {
		
		
		Square square=(int x)-> x*x;
		int value=square.calculate(5);
		System.out.println(value);
	}

}
