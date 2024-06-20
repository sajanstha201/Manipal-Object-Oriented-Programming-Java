package lab10;
public class stackUsingWildCard<T>{
public static void main(String [] args) {
	Stack.push(new Member<String>("sajan"));
	Stack.push(new Member<Integer>(50));
	Stack.push(new Member<Double>(3.0));
	Stack.show();
}

}
class Stack<T>{
	static int max=10;
	static int top=-1;
	static Stack<?> stack[]=new Stack[max];
	T data;
	Stack(T t) {
		this.data=t;
	}
	static void push(Stack<?> t) {
		if(top==max) {
			System.out.println("Over flow");
			return;
		}
		else {
			top++;
			stack[top]=t;
		}
	}
	static Stack<?> pop() {
		return stack[top--] ;
	}
	static void show() {
		int i;
		for(i=0;i<=top;i++)
			System.out.println(stack[i].data+" ");
		System.out.println();
	}
}
class Member <T> extends Stack<T>{
	Member(T t){
		super(t);
	}
}
