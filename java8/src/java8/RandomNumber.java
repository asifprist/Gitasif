package java8;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random r=new Random();
		r.ints(10,70).limit(100).forEach(System.out::println);


}}
