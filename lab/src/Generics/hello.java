package Generics;

public class hello {
public static void main(String [] args) {
	System.out.println("sajan shreshta");
	sta<Integer> s=new sta<>();
	s.push(45);
	System.out.println(s.getClass());
	sta<Integer> p=new sta<>();
	System.out.println(p.getClass());
	if(s.equals(p)) {
		System.out.println("sajan");
	}
}
}
class sta<T>{
	T arr[];
	int top;
	sta(){
		this.arr=(T[])new Object[20];
		this.top=-1;
	}
	void push(T t) {
		arr[++top]=t;
	}
	T pop() {
		return arr[top--];
	}
}