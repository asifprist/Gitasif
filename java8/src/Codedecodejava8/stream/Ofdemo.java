package Codedecodejava8.stream;

import java.util.stream.Stream;

public class Ofdemo {

	public static void main(String[] args) {
		Stream.of(89,1,11,111,1111).forEach(x->System.out.println(x));

	}

}
