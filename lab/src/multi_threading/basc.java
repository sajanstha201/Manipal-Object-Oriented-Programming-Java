package multi_threading;

public class basc {
public static void main(String [] args) {
	Thread t=new Thread(new Runnable() {
		public void run() {
			System.out.println("sajan shrestha");
		}
	});
	Thread t2=new Thread(()->{
		System.out.println("deep khadka");
	});
	t.start();
	t2.start();
	t.setName("sajan");
	System.out.println(t.getName());
	t.setPriority(10);
	System.out.println(t.getPriority());
}
}
