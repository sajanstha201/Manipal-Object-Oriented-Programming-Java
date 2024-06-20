package lab6;
public class lab6_3 {
	public static void main(String [] args) {
		person pep=new person("sajan shrestha","April 15,2004");
		System.out.println("Name: "+pep.name()+"\nDate of Birth: "+pep.birthDate());
		CollegeGraduate pep1=new CollegeGraduate("deep khadka","December 25,2004",9.9,2022);
		System.out.println("Name: "+pep1.name()+"\nDate of Birth: "+pep1.birthDate()+
				"\nGPA: "+pep1.GPA()+"\nYear of Graduation: "+pep1.yearOfGraduation());
	}
}
class person{
	private String name;
	private String birthDate;
	person(String name,String birthDate){
		this.name=name;
		this.birthDate=birthDate;
	}
	String name() {
		return this.name;
	}
	String birthDate() {
		return this.birthDate;
	}
}
class CollegeGraduate extends person{
	CollegeGraduate(String name,String birthDate, double GPA, int yearOfGraduation){
		super(name,birthDate);
		this.GPA=GPA;
		this.yearOfGraduation=yearOfGraduation;
	}
	private double GPA;
	private int yearOfGraduation;
	double GPA() {
		return this.GPA;
	}
	int yearOfGraduation() {
		return this.yearOfGraduation;
	}
}