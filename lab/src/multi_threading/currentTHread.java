package multi_threading;

public class currentTHread {
public static void main(String [] args) {
	Thread t=Thread.currentThread();
	t.setName("sajan");
	try{t.sleep(100);}catch(Exception e) {}
	System.out.println("sajan shrestha");
	System.out.println(t);
}
}
