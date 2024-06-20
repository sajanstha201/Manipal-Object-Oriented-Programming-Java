package practise;

public class Generics <T>{
	T t;
	Generics(){
		
	}
	Generics(T t){
		this.t=t;
	}
	T get() {
		return this.t;
	}
	void put(T t) {
		this.t=t;
	}
	public static void main(String [] args) {
		Generics <Integer> i=new Generics<Integer>();
		i.put(5);
		System.out.println(i.get());
		B <Integer>b=new B<Integer>(100);
		A <B>a=new A<B>(b);
		System.out.println(a.get().get());
	}

}
class B <T>extends Generics{
	B(){
		
	}
	B(T t){
		super(t);
	}
}
class A <T extends Generics>{
	T t;
	A(T t){
		this.t=t;
	}
	A(){
		
	}
	T get() {
		return this.t;
	}
}
