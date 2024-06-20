package EndSemExam2;

public class ih extends Ab{
	void add() {
		super.add();
		System.out.println(super.c);
	}
	public static void main(String [] args) {
		ih a=new ih();
		a.add();
	}
	
}
class Ab{
	int c=10;
	void add() {
		System.out.println("this is from class A add method");
	}
}
