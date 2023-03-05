package logexception;

public class A extends Exception{
	A(){}
	
	A(String s){
		super(s);
	}
	
	
	public String mul(int a,int b)throws A,B {
		if(a==0 && b!=0) 
		{
			throw new A(ProUtility.getValue("a"));
		}
		else if(a!=0 && b==0)
		{
			throw new B(ProUtility.getValue("b"));
		}
		else if(a==0 && b==0) {
			throw new A(ProUtility.getValue("ab"));
		}
		else
		{
			int c=a*b;
			return "mull is "+c;
		}
	}
}
