package practise;
class Ab{
	int count=0;
	synchronized void add() {
		count++;
	}
}
public class synchronize {
public static void main(String [] args) throws InterruptedException{
	Ab b=new Ab();
	Thread t1=new Thread(()->{
		int i;
		for(i=0;i<100;i++) {
			b.add();
			try {Thread.sleep(10);}
			catch(InterruptedException e){System.out.println("caught");}
		}
	});
	Thread t2=new Thread(()->{
		int i;
		for(i=0;i<100;i++) {
			b.add();
			try {Thread.sleep(10);}
			catch(InterruptedException e){System.out.println("caught");}
		}

	});
	t1.start();
	t2.start();
	t2.join();
	t1.join();
	System.out.println(b.count);
	
}
}
