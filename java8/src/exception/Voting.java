package exception;

public class Voting {
	public static void main(String[] args)throws Custumex{
		int age=17;
		if(age<18) {
			throw new Custumex("not eligible");
			
		}
		else {
			System.out.println("eligible");
		}
	}

}
