package lab6;

public class lab6_1 {
public static void main(String args []) {
	STUDENT student=new STUDENT("sajan shrestha",9,8,9,8,9);
	student.compute();
	student.display();
	ScienceStudent sciencestudent=new ScienceStudent("deep khadka",9,8,9,9,9);
	sciencestudent.compute();
	sciencestudent.displayPracticalMarks();
	sciencestudent.display();
	ArtsStudent artstudent=new ArtsStudent("devraj silwal","Math",9,8,9);
	artstudent.display();
}
}
class STUDENT{
	int marks[]=new int[3],total=0;
	float avg;
	String name;
	STUDENT(String name,int ...marks){
		this.marks=marks;
		this.name=name;
	}
	void compute() {
		for(int mark:marks) {
			this.total+=mark;
		}
		this.avg=this.total/marks.length;
	}
	void display(){
		System.out.println("Name: "+this.name+"  Average Marks: "+this.avg);
	}
}
class ScienceStudent extends STUDENT{
	private int practicalMarks[];
	ScienceStudent(String name,int ...marks){
		super(name,marks[0],marks[1],marks[2]);
		this.practicalMarks=new int[]{marks[3],marks[4]};
	}
	void compute(){
		for(int mark:marks) 
			this.total+=mark;
		for(int practicalMark:this.practicalMarks)
			this.total+=practicalMark;
		this.avg=this.total/(marks.length+1);
	}
	void displayPracticalMarks() {
		System.out.println("The practical marks of "+this.name+" are: ");
		for(int mark:this.practicalMarks) {
			System.out.print(mark+" ");
		}
		System.out.println(" ");
	}
}
class ArtsStudent extends STUDENT{
	private String electiveSubject;
	ArtsStudent(String name,String electiveSubject,int ...marks){
		super(name,marks);
		this.name=name;
		this.electiveSubject=electiveSubject;
	}
	void display() {
		super.compute();
		System.out.println("\nName: "+this.name+"\nAverage Marks: "+this.avg+"\nElective Subject: "+this.electiveSubject);
	}
}
