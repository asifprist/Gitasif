package logexception;

public class CL {

	public static void main(String[] args) {
		A ob=new A();
		try {
			String t = ob.mul(0, 0);
		} catch (A | B e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
