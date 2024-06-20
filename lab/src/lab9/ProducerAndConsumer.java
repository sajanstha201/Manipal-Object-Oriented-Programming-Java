package lab9;
class shop{
	private int NoOfSell=0;
	public void sold() {
		this.NoOfSell++;
	}
	public int getSell() {
		return NoOfSell;
	}
}
class Producer implements Runnable{
	shop shop1;
	Producer(shop shop1){
		this.shop1=shop1;
	}
	public synchronized void run() {
		System.out.println("Hello I am Product manager.");
		synchronized(shop1) {
			
			try{this.shop1.wait();}catch(InterruptedException e) {System.out.println("Interrupted caught in Producer Thread");}
		}
		System.out.println("Yours Product is ready. []");
	}
}
class Consumer implements Runnable{
	shop shop1;
	Consumer(shop shop1){
		this.shop1=shop1;
	}
	public synchronized void run() {
		try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Interrupted caught in Consumer Thread");}
		System.out.println("I need a product.");
		try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Interrupted caught in Consumer Thread");}
		synchronized(shop1) {
			this.shop1.notify();
		}
	}
}
public class ProducerAndConsumer {
public static void main(String [] args) {
	shop shop1=new shop();
	Thread pt=new Thread(new Producer(shop1),"Producer");
	Thread ct=new Thread(new Consumer(shop1),"Consumer");
	pt.start();
	try{Thread.sleep(1000);}catch(InterruptedException e) {System.out.println("Interrupted caught");}
	ct.start();
}
}
