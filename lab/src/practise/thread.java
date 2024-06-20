package practise;
class sajan extends Thread{
	public void run() {
		shrestha a=new shrestha();
		a.start();
		try{a.join();}
		catch(InterruptedException e) {System.out.println("Exception caught");}
		int i;
		for(i=0;i<5;i++) {
			System.out.println("sajan");
			try{Thread.sleep(1000);}
			catch(InterruptedException e) {System.out.println("Exception caught");}
		}

}
}
class shrestha extends Thread{
	public void run() {
		int i;
		for(i=0;i<5;i++) {
			System.out.println("shrestha");
			try{Thread.sleep(1000);}
			catch(InterruptedException e) {System.out.println("Exception caught");}
		}
}
}
class deep extends Thread{
	public void run() {
		int i;
		for(i=0;i<5;i++) {
			System.out.println("deep");
			try{Thread.sleep(1000);}
			catch(InterruptedException e) {System.out.println("Exception caught");}
	}
}
}
public class thread {
	public static void main(String [] args) {
		sajan a =new sajan();
		a.start();
		try{Thread.sleep(10);}
		catch(InterruptedException e) {System.out.println("Exception caught");}
		deep d=new deep();
		d.start();
		try{a.join();d.join();}
		catch(InterruptedException e) {System.out.println("Exception caught");}
		System.out.println(a.isAlive());
	}
}
