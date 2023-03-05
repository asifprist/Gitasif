package java8;

import java.util.concurrent.Callable;

public interface Myfunctional extends Callable
{
	public default Object call() {
		return null;
		

		
	}

}
