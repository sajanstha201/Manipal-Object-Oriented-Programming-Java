package multi_threading;

public class synchronization {
public static void main(String [] args) {
	A a =new A();
	Thread t1=new Thread(()->{
		a.run();
	});
	Thread t2=new Thread(()->{
		a.add();
	});
	t1.start();
	t2.start();

}

}
class A{
	synchronized public void run() {
	try {Thread.sleep(10000);}catch(Exception e) {}
		System.out.println("sajan shrestha");
	}
	synchronized public void add() {
		try {Thread.sleep(1);}catch(Exception e) {}
		System.out.println("sajan shrestha add method");
	}
}