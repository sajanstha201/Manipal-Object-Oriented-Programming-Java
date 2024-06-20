package lab7;
import java.util.*;
public class student {
	public Scanner sc=new Scanner(System.in);
	int rollNumber,marks[],sportGrade,finalgrade=0;
	public static void main(String args[]) {
		Result student=new Result();
		student.getNumber();
		student.getMarks();
		student.getGrade();
		student.displayResult();
		
	}
	void getNumber() {
		System.out.println("Enter the roll numbers:");
		int num=sc.nextInt();
		this.rollNumber=num;
	}
	void putNumber() {
		System.out.println("The roll number is :"+this.rollNumber);
	}
	void getMarks() {
		System.out.println("Enter the total number of subject: ");
		int num=sc.nextInt();
		this.marks=new int[num];
		int i;
		for(i=0;i<num;i++) {
			System.out.print((i+1)+" Subject marks: ");
			this.marks[i]=sc.nextInt();
			}
	}
	void putMarks() {
		int i;
		System.out.println("The marks of "+this.rollNumber+" roll number is :");
		for(i=0;i<this.marks.length;i++) {
			System.out.print(this.marks[i]+" ");
		}
		System.out.println();
	}
}
