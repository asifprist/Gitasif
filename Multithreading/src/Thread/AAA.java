package Thread;
// There are 4 thread in this program one extra thread is main thread
//thread scheduler
public class AAA extends Thread{
	
	
	public void run()
	{
	String n=Thread.currentThread().getName();	
	for(int i=1;i<=3;i++)
	{
		System.out.println(n);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 }
}

class BBB
{
	public static void main(String[] args) {
		AAA t1=new AAA();
		AAA t2=new AAA();
		AAA t3=new AAA();
		
		t1.setName("Pehla");
		t2.setName("Dusra");
		t3.setName("Tisra");
		
	
		
		
//		t3.start();
//		try {
//			t3.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t1.start();
		t2.start();
		
		t2.suspend();
		t3.start();
		t2.resume();
		
		
	}
}