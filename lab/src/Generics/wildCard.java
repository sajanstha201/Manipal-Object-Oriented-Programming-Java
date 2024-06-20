package Generics;
import java.util.*;
public class wildCard <T>{
	public static void main(String [] args) {
		wildCard<Integer> a=new wildCard<Integer>();
		Integer arr[]= {1,2,3,4,5};
		Integer d=2;
		a.printing(arr,d);
		List <String> l1= new ArrayList<String>();
		l1.add("sajan");
		l1.add("deep");
		//a.print(l1);
		List <Integer> l2=new ArrayList<Integer>();
		l2.add(5);
		l2.add(6);
		Integer x=a.print(l2);
	}
	<Z extends Comparable<Integer>> void printing(Z z[],Integer d){
		for(Z a:z) {
			if(a.compareTo(d)==0)
				System.out.println(a);
		}
	}
	Integer print(List<? extends Number> list) {
		System.out.println(list);
		Integer a=5;
		return a;
	}
}