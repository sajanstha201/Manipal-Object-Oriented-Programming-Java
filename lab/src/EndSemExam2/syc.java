package EndSemExam2;
class B extends Thread{
	public void run(){
		synchronized(this) {
			int i;
			for(i=0;i<100;i++)
				System.out.println(i);
			try {notify();}catch(Exception e) {}
		}
	}
}
public class syc {
	public static void main(String [] args) {
		try {
			B b=new B();
		//	b.start();
			//B d=new B();
			//try {Thread.sleep(100);}catch(Exception e) {}
			synchronized(b) {
				int i;
				for(i=0;i<100;i++) {
					System.out.println("sajan shrestha  "+i);
					if(i==50)
						b.wait();
				}
			}
			System.out.println("my name is sajan shrestha and i am from kathmdanu");
		}
		catch(Exception e) {
			
		}

	}

}
