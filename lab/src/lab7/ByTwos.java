package lab7;
import java.util.*;
import lab7.Series;
public class ByTwos implements Series{
	int array[]=new int[100],count=0;
	public int getNext() {
		int next=this.array[this.count-1]+this.array[this.count-2];
		array[count]=next;
		count++;
		return next;
	}
	public void reset() {
		this.count=0;
	}
	public void setStart() {
		Scanner sc=new Scanner(System.in);
		this.count=0;
		System.out.println("Enter two number to start: ");
		this.array[0]=sc.nextInt();
		this.array[1]=sc.nextInt();
		count=2;
	}
}
