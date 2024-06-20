package EndSemExam2;

class Axxxx{
	int[] a=new int[5];
	Axxxx() {
		a[0]=10;
	}
}
public class bike extends Axxxx{
	bike(){
		a=new int[5];
		System.out.println(a[0]);
	}
	public static void main(String [] args) {
		bike b=new bike();
	}
}