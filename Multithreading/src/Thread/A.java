package Thread;

public class A extends Thread{
	
	public void fun()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Asif");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
  class B
{
public static void main(String[] args) {
	
	A t=new A();
	t.fun();
	for(int i=1;i<=5;i++)
	{
		System.out.println("Afsar");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
}

