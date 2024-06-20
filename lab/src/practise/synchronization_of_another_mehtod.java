package practise;

public class synchronization_of_another_mehtod {
	void  a() {
		int i;
		try {Thread.sleep(5000);}catch(InterruptedException e) {}
		for(i=0;i<10;i++)
			System.out.println(i);
		System.out.println(" ");
	}
	 void c() {
			int i;
			for(i=0;i<10;i++)
				System.out.println(i);
			System.out.println(" ");
	 }
public static void main(String [] args) {
	synchronization_of_another_mehtod b=new synchronization_of_another_mehtod();
	synchronization_of_another_mehtod x=new synchronization_of_another_mehtod();
	synchronization_of_another_mehtod y=new synchronization_of_another_mehtod();
	Thread t1=new Thread(()->{synchronized(b) {
		x.a();
	}});
	Thread t2=new Thread(()->{synchronized(b) {
		x.c();
	}});
	t1.start();
	t2.start();
}
}
