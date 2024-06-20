package Generics;

public class GenericAndInheritanc {
	public static void main(String [] args) {
		Ax<Integer> a=new Ax<>();
		Bx<Integer,String> b=new Bx<>();
		Integer x=45;

		b.put("sajan");

		System.out.println(b.getg());
		System.out.println(b.getv());
		Ax <?> y[]=new Ax<?>[10];
	}

}
class Ax <T>{
	T t;
	public void put(T a) {
		this.t=a;
	}
	
}
class Bx <G,V> extends Ax<V>{
	G g;
	V v;
	public void put(V v) {
		this.v=v;
	}

	public G getg() {
		return this.g;
	}
	public V getv() {
		return this.v;
	}
}