package EndSemExam;

public class varray {
public static void main(String [] args) {
	varray.add(1,'a',3,4,5);
	int [][]arr=new int[3][4];
	System.out.println("sajan"+arr.length);
	System.out.println(arr[0].length);
	String name="sajan shrestha";
	System.out.println(name.length());
	
}
static void add(int b,char c,int ...a) {
	System.out.println("heelo"+b+c);
	System.out.println("length="+a.length);
	for(int ae:a) {
		System.out.println(ae);
	}
}
}
