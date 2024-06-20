package lab7;
import lab7.ByTwos;
import java.util.*;
public class main {
public static void main(String args []) {
	Scanner sc=new Scanner(System.in);
	ByTwos a=new ByTwos();
	System.out.println("1.setStart\n2.get next \n3.restart\n");
	while(true) {
		System.out.print("Enter a choice: ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			a.setStart();
			break;
		case 2:
			System.out.println(a.getNext());
			break;
		case 3:
			a.reset();
			break;
		default:
			System.out.println("invalid choice\n");
		}
	}
}
}
