package Codedecodejava8;

import java.util.function.Predicate;

public class PredicateFunctionDemo {

	public static void main(String[] args) {
		Predicate<String> checklength=s->s.length()>=9;
		System.out.println("length gre than 9 : " +checklength.test("hifjhfjf"));

	}

}
