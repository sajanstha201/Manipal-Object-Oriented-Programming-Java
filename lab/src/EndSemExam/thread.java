package EndSemExam;

public class thread extends Thread{
public void run() {
	System.out.println("this is form thread class");
}
public static void main(String [] args) {
	int i=256;
	byte a=10;
	System.out.println((byte)i);
	System.out.println(a*2);
	Thread t=new thread() {
		public void run() {
			System.out.println("this is form public static void main");
		}
	};
	t.start();
}
}
