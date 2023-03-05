package Thread;

public class AA implements Runnable {

	@Override
	public void run() {
      
		for(int i=1;i<=5;i++)
		{
			System.out.println("My Child Method..");
		}
	}

}
 class BB{
	  public static void main(String[] args) {
		AA r=new AA();
		Thread t=new Thread(r);
		t.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Thread...");
		}
	}
 }