package Codedecodejava8;

public class MethodRefrence {

	public static void main(String[] args) {
		
		FunInterface f= Test :: lalu;
		f.singlelaunda();
		
		//FunInterface f=()->System.out.println("known");
		//f.singlelaunda();

	}
//
}
class Test{
	public static void lalu() {
		System.out.println("h");
	}
}
