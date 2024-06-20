package multi_threading;
import java.util.*;
class stacks{
	static int max=20;
	static int top=-1;
	static product <?>[] stack=new product<?>[max];
	public static void push(product<?> e) {
		stack[++top]=e;
	}
	public static product<?> pop() {
		return stack[top--];
	}
	public static void display() {
		for(product<?> element:stack) {
			System.out.print(element.data+" ");
		}
		System.out.println("\n");
	}
	public static boolean isFull() {
		if(top==max)
			return true;
		return false;
	}
	public static boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	}
}
class Shop{
	public synchronized void produce(int i) {
		if(stacks.isFull()) {
			System.out.println("Stack Full\n");
			try{wait();}catch(Exception e) {}
		}
		product <?> pr;
		if(i%2==0) {
		pr=new product<String>("sajan");
		}
		else {
		pr=new product<Integer>(10);		
		}
		stacks.push(pr);
		System.out.println("Product produced: "+pr.data+"  "+(i+1));
		notifyAll();
	}
	public synchronized void consume(int i) {
		if(stacks.isEmpty()) {
			System.out.println("Stack is Empty\n");
			try{wait();}catch(Exception e) {}	
		}
		System.out.println("Product consumed: "+stacks.pop().data+"  "+(i+1));
		notifyAll();
	}
}
class product<T>{
	T data;
	product(T data){
		this.data=data;
	}
}
class producer implements Runnable{
	Shop s;
	producer(Shop s){
		this.s=s;
	}
	public synchronized void run() {
		int i;
		for(i=0;i<20;i++) {
			s.produce(i);
		}
	}
}
class consumer implements Runnable{
	Shop s;
	consumer(Shop s){
		this.s=s;
	}
	public synchronized void run() {
		int i;
		for(i=0;i<20;i++) {
			s.consume(i);
		}
	}
}
public class producerAndConsumer {
	public static void main(String [] args) {
		Shop shop=new Shop();
		consumer c=new consumer(shop);
		Thread t1=new Thread(c);
		t1.start();
		producer p=new producer(shop);
		Thread t2=new Thread(p);
		t2.start();
		try {t1.join();t2.join();}catch(Exception e) {}

	}
}
