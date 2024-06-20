package lab5;
import java.util.Scanner;
public class lab5_3 {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int num=5,i,reg,joinDate;
	String fullname[]=new String[num];
	short semester;
	float GPA,CGPA;
	char c;
	student st[]=new student[num];
	for(i=0;i<num;i++) {
		System.out.print("Name: ");
		fullname[i]=sc.nextLine();
		System.out.print("Join Date: ");
		joinDate=sc.nextInt();
		System.out.print("semester: ");
		semester=sc.nextShort();
		System.out.print("GPA: ");
		GPA=sc.nextFloat();
		System.out.print("CGPA: ");
		CGPA=sc.nextFloat();
		sc.nextLine();
		st[i]=new student(fullname[i],semester,GPA,CGPA,joinDate,i);
	}
	student.displayRecord(st);
	student.sortSemAndCGPA(st);
	System.out.println("\n\n sorted record as per semester and CGPA");
	student.displayRecord(st);
	System.out.println("\n\nsorted record as per name");
	student.sortName(st);
	student.displayRecord(st);
	student.startParticularchar(st,'s');
	student.startParticularsubstring(st,"sajan");
	student.initialFamilyName(st);
	student.displayRecord(st);
}
}
