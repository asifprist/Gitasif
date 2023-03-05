package Codedecodejava8;

import java.util.function.Function;

public class Functionchaining {

	public static void main(String[] args) {
		
		Function<Integer, Integer>doubleit=i->2*i;
		System.out.println("double function "+ doubleit.apply(2));
		
		Function<Integer, Integer>cubeit=i->i*i*i;
		System.out.println("cube function "+cubeit.apply(2));
		
		System.out.println("first doubling using apply "+doubleit.andThen(cubeit).apply(2));
		
		System.out.println("first cubing using apply "+doubleit.compose(cubeit).apply(2));
		

	}

}
