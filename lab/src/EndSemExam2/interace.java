package EndSemExam2;
interface A{
final int a=5;
static int b=6;
public final static int xx=56;
int c=9;//invalid
//private int d=10;//invalid
//abstract int x;//invlaid
static void add(){
System.out.println("add ");
}
//final void dd() {
//	System.out.println("helelo");
//}
//void sub(){
//System.out.pritnln("sub");
//}
void mul();
abstract void dul();
}
public class interace implements A{
	
	int d=c;
	public void mul() {
		System.out.println("mul");
		d++;
		System.out.println(d);
	}
	public void dul() {
		System.out.println("div");
	}
public static void main(String[] args) {
	System.out.println(A.xx);
	interace i=new interace();
	System.out.println(i.xx);

}
}
