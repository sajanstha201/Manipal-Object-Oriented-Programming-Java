package lab6;
public class lab6_6 {
	public static void main(String args []) {
		result sajan=new result("sajan shrestha",201,10,9);
		sajan.display();
	}

}
class students{
	students(String name,int id){
		this.name=name;
		this.id=id;
	}
	String name;
	int id;
}
class SportsAndExam extends students{
	SportsAndExam(String name,int id,int s_grade,int e_grade){
		super(name,id);
		this.s_grade=s_grade;
		this.e_grade=e_grade;
	}
	int s_grade;
	int e_grade;
}
class result extends SportsAndExam{
	String finalresult;
	result(String name,int id,int s_grade,int e_grade){
		super(name,id,s_grade,e_grade);
		this.finalresult="Sport Grade: "+this.s_grade+" \n Exam Grade: "+this.e_grade;
	}
	void display(){
		System.out.println("The final result of "+this.name+" :\n "+this.finalresult);
	}
}
