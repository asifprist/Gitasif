package Codedecodejava8;

import java.util.function.Predicate;

public class Predicatejoining {

	public static void main(String[] args) {
		
		Predicate<String> checklength=s->s.length()>=5;
		System.out.println("length gre than 9 : " +checklength.test("wazirabad"));
		
		Predicate<String> checkEvenlength=s->s.length()%2==0;
		System.out.println("length gre than is : " +checkEvenlength.test("wazirabad"));
		
		
		System.out.println("after merging with and "+checklength.and(checkEvenlength).test("wazirabd"));
		
		System.out.println("after merging with or "+checklength.or(checkEvenlength).test("wazirabad"));
		
		System.out.println("after merging with negate "+checklength.negate().test("wazirabad"));
		

	}

}
