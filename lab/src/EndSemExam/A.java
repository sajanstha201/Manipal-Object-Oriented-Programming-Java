package EndSemExam;

public class A {
int a;
public int b;
protected int c=10;
void method1() {
	System.out.println("This is from class A method1");
}
public void method2() {
	System.out.println("This si from class A method2");
}
protected void method3() {
	System.out.println("This is from class A method3");
}
interface interfaceA{
	abstract void method1();
	 void method2();
}
public class D{
	public D(){
		System.out.println("This is from class D constructor");
	}
}
public static void main(String [] args) {
	A a=new A();
}
}
class B implements A.interfaceA{
	public void method1() {
		System.out.println("This is form class B method1");
	}
	public void method2() {
		System.out.println("This is from class B method2");
	}
}
