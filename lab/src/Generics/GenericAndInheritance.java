package Generics;

public class GenericAndInheritance {
	public static void main(String [] args) {
		A<Integer> a=new A<>();
		B<Integer,String> b=new B<>();
		Integer x=45;
		b.put(x);
		b.put("sajan");
	}

}
class A <T>{
	T t;
	public void put(T a) {
		this.t=a;
	}
	
}
class B <G,V> extends A<V>{
	G g;
	V v;
	public void put(V a) {
		this.v=a;
	}
	public void put(G a) {
		this.g=a;
	}
}