package others;

public class inheritance_and_refrence {
	public static void main(String [] args) {
		B b=new B();
		//b.add();
		A a=b;
		//a.add();
		System.out.println("\n"+a.a+b.a);
		B.add();
		A.c c=new A.c();
		c.add();
	}

}
class A{
	static int a=10;
	A(){
		System.out.println("This is from class A");
	}
	static class c{
		c(){
			System.out.println("This is from class c");
		}
		void add() {
			System.out.println("This is from class c add method"+a);
		}
	}
}
class B extends A{
	static int a=5;
	B(){
		System.out.println("This is from class B");
	}
	static void add() {
		System.out.println("This is from class B add method"+a);
	}
}
