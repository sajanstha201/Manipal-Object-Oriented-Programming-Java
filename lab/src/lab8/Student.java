package lab8;
import lab5.student;
public class Student {
public static void main(String args []) {
	student st[]=new student[100];
	int i=0;
	while(true) {
		try {
			st[i]=new student();
			st[i].getinfo();
			isSeatFull();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			break;
		}
		i++;
	}
}
static void isSeatFull() throws Exception{
	if(student.count>25)
		throw new SeatsFilledException();
}
}
