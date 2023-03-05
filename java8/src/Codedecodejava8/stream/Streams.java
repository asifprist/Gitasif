package Codedecodejava8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(7);
		list.add(61);
		list.add(2);
		List<Integer> a1=new ArrayList<Integer>();
		a1=list.stream().filter(x->x>=15).collect(Collectors.toList());
		a1.stream().forEach(x->System.out.println(x));
		list.stream().filter(i->i%2==0).forEach(x->System.out.println(x));
		list.stream().map(i->i*i).forEach(x->System.out.println(x));
		
		long a=list.stream().count();
		System.out.println(a);
		
		Stream<Integer> b=list.stream().sorted((i1,i2)->i2.compareTo(i1));
		b.forEach(x->System.out.println(x));
		
		Integer min=list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);

		System.out.println("-------------------");
		Integer max=list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
	}

}
