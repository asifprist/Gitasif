package Codedecodejava8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunction {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> checksumoftwo=(a,b)->(a+b)>=5;
		System.out.println(checksumoftwo.test(3, 1));
		
		
		BiFunction<Integer, Integer, Integer> multiboth=(a,b)->a*b;
		System.out.println(multiboth.apply(9, 5));

	}

}
