package practise;
class a implements Runnable{
	public void run() {
		int i;
		for(i=0;i<5;i++)
			System.out.println("sajan");
	}
}
class b implements Runnable{
	public void run() {
		System.out.println("deep");
	}
}
class sa extends Thread{
	public void run() {
		int i;
		
		for(i=0;i<5;i++) {
			System.out.println("sajan");
			try {Thread.sleep(1000);}
			catch(InterruptedException e) {System.out.println("Exception caught");}
		}

	}
}
class de extends Thread{
	de(Thread ob){
		super(ob);
	}
	de(){
		super();
	}
	public void run() {
		int i;
		for(i=0;i<5;i++) {
			System.out.println("deep");
		try {Thread.sleep(1000);}
		catch(InterruptedException e) {System.out.println("Exception caught");}
		}
	}
}
public class setPriority {
public static void main(String [] args) {
	/*sa sajan=new sa();
	de deep=new de();
	sajan.setPriority(5);
	deep.setPriority(1);
	sajan.start();
	deep.start();*/
	a s=new a();
	Thread t=new Thread(s);
	t.start();
	Thread t2=new Thread(()->{
		System.out.println("SAJAN SHRESTHA");
	});
	t2.start();
}
}
