package lab9;
class mul extends Thread{
	int num;
	mul(int num){
		this.num=num;
	}
	public void run() {
		int i;
		for(i=1;i<=10;i++)
			System.out.println(i+" X "+this.num+" = "+(i*this.num));
		System.out.println("");
	}
}
public class Tables {
	public static void main(String [] args) {
		mul m5=new mul(5);
		m5.start();
		mul m7=new mul(7);
		m7.start();
	}
}
