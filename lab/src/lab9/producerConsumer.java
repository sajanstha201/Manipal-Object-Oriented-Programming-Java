package lab9;

public class producerConsumer {
	int producedProduct=0,productProductionLimit=10;
	synchronized void producer() {
		try{Thread.sleep(1000);}catch(Exception e) {}
		this.producedProduct++;
		System.out.println("product produced:"+this.producedProduct);
		if(this.producedProduct==this.productProductionLimit)
			try{wait();}catch(InterruptedException e) {}
		notify();
	}
	synchronized void consumer() {
		try {Thread.sleep(900);}catch(Exception e) {}
		if(this.producedProduct==0)
			try {wait();}catch(InterruptedException e) {}
		this.producedProduct--;
		System.out.println("product consumed");
		notify();
	}
public static void main(String [] args) {
	producerConsumer shop=new producerConsumer();
		Thread t1=new Thread(()->{
			int i;
			for(i=0;i<20;i++) {
				shop.producer();
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		});
		Thread t2=new Thread(()->{
			int i;
			for(i=0;i<20;i++) {
				shop.consumer();			
				try {Thread.sleep(300*i);}catch(Exception e) {}
			}
		});
		t1.start();
		try {Thread.sleep(5000);}catch(Exception e) {}
		t2.start();

}
}

