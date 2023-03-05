package Program;

public class Swap {
	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("Before swapping values are.."+a+" "+b);
		//logic 1
//		int t=a;
//		a=b;
//		b=t;
		//logic 2 
//		 
		//third
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
		//fouth
//		a=a^b;
//		b=a^b;
//		a=a^b;
		//five
		b=a+b-(a=b);
		System.out.println("After swapping values are.."+a+"  "+b);
		
		
		
	}

}
