package Program;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		//1 using algorithm
		/*int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("reverse Number is      "   + rev);
		
		//2using stringbufffer class
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		System.out.println("reverse Number is      "   + rev);
		*/
		//3 string builder
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		 StringBuilder rev = sb1.reverse();
		System.out.println("reverse number is "+rev);

	}

}
