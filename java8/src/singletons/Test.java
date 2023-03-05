package singletons;

public class Test {

	public static void main(String[] args) {
		
		
		Singletoneclass t1 = Singletoneclass.getsingle();
		Singletoneclass t2 = Singletoneclass.getsingle();
		System.out.println(t1);
		System.out.println(t2);

	}

}
