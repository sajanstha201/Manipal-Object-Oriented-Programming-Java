package lab5;
import java.util.Scanner;
public class lab5_6 {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	String num=sc.nextLine();
	String revnum="";
	int i;
	for(i=0;i<num.length();i++) {
		if(i%3==0&&i!=0) {
			revnum+=",";
		}
		revnum+=Character.toString(num.charAt(num.length()-i-1));
	}
	num="";
	for(i=revnum.length()-1;i>=0;--i) {
		num+=Character.toString(revnum.charAt(i));
	}
	System.out.println(num);
}
}
