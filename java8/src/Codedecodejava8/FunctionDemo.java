package Codedecodejava8;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		
	Function<Integer, Integer>squareme =i->i*i;
	System.out.println("square is " +squareme.apply(5));

	}

}
