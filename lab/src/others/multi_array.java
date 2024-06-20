package others;

public class multi_array {
public static void main(String [] args) {
	String a="sajan";
	System.out.println(a.substring(4));
}
static class A{
	A(){
		System.out.println("THis is from classs A");
	}
	void add() {
		System.out.println("This is form class A add method");
	}
	class B{
		B(){
			System.out.println("This si form class B");	
		}
		void sub() {
			System.out.println("This is from class B sub mehtod");
		}
	}
}
static class d extends A{
	d(){
		System.out.println("This is form class D");
	}
	void div() {
		System.out.println("This si form calss D div method");
	}
}
}
