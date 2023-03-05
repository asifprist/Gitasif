package java8;

public class AB {
	
	 static AB ob;

	public void m1()
	
	{
		System.out.println("m1111");
	}
	public void finalize()
	{
		System.out.println("finalize");
	}
	
	public static void main(String[] args) {
		AB.ob=new AB();
		ob.m1();
		ob=null;
		//System.gc();
	}
	

}
