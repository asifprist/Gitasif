package Codedecodejava8;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<Integer>squareme=i->System.out.println("taking input and performing operation"+i*i);
		squareme.accept(5);
		
		Consumer<Integer>doubleme=i->System.out.println("taking input and performing operation"+2*i);
		doubleme.accept(6);
		
		squareme.andThen(doubleme).accept(6);
		
		//compose not exit
		//squareme.compose(doubleme).accept(2);

	}

}
