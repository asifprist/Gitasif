package Singleton;

public class Mian {

	public static void main(String[] args) {
		
		Single s=Single.getSingle();
		System.out.println(s);
		
		Single s2=Single.getSingle();
		System.out.println(s2);

	}

}
