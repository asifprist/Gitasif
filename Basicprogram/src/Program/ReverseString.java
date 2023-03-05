package Program;

public class ReverseString {

	public static void main(String[] args) {
		String str="ABCDe";
	String rev="";
	//1)using concatenation operation
		/*int len=str.length();
		
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string: "+ rev);
	//2 using charactor array
	char a[]=str.toCharArray();
	int len=a.length;
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+a[i];
	}
        System.out.println(rev);*/
        
        //3 using stringbuilder
	StringBuffer sb=new StringBuffer(str);
	System.out.println(sb.reverse());
	
        
        
        
	}

}
