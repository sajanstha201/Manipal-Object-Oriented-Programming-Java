package Generics;

public class genericClass <T>{
	public static void main(String [] args) {
		genericClass<Integer> a=new genericClass<Integer>(4);
		System.out.println(a.add());
		System.out.println(a.get());
		System.out.println(a.print("sajan"));
		Integer arr[]= {1,2,3,4,5};
		a.printing(arr);
	}
	T t;
	<H>genericClass(H h){
		System.out.println(h);
	}
	int add() {
		return 5;
	}
	T get() {
		return this.t;
	}
	<G> G print(G g) {
		return g;
	}
	<Z extends Comparable<?>> void printing(Z z[]){
		for(Z a:z) {
			if(a.compareTo(a)==0)
				System.out.println(a);
		}
	}
}
