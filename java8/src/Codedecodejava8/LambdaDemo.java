package Codedecodejava8;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class LambdaDemo {

	public static void main(String[] args) {
		//BiConsumer<Integer, Integer> biconsumer=(a,b)->System.out.println(a+b);
		//biconsumer.accept(23, 6);
		
		Comparator<String> c=(s1,s2)->s1.compareTo(s2);

	}

}
