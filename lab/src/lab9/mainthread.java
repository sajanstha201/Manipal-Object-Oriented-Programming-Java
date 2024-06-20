package lab9;
import java.util.*;

class psum implements Runnable{
	public int psum=0,arr[][];
	static int count=0;
	psum(int arr[][]){
		this.arr=arr;
	}
	public void run() {
		int i;
		this.psum=0;
		for(i=0;i<this.arr[count].length;i++) {
			this.psum+=this.arr[count][i];
		}
		count++;
	}
}
public class mainthread {
public static void main(String [] args) {
	int row,column;
	int i,j;
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row and column: ");
	row=sc.nextInt();
	column=sc.nextInt();
	int matrix[][]=new int[row][column];
	for(i=0;i<row;i++)
		for(j=0;j<column;j++) {
			System.out.print("A["+i+"]["+j+"]= ");
			matrix[i][j]=sc.nextInt();
		}
	psum s=new psum(matrix);
	for(i=0;i<row;i++) {
		Thread t=new Thread(s);
		t.start();
		try{t.join();}catch(InterruptedException e) {}
		sum+=s.psum;
	}
	System.out.println("The sum is "+sum);
}
}
