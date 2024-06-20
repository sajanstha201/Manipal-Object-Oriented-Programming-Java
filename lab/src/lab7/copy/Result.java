package lab7.copy;
public class Result extends student implements Sports{
	public void getGrade() {
		System.out.println("Enter the grade point in sport: ");
		this.sportGrade=sc.nextInt();
		}
	public void putGrade() {
		for(int element:this.marks)
			this.finalgrade+=element;
		this.finalgrade+=this.sportGrade;
		this.finalgrade=this.finalgrade/(1+this.marks.length);
	}
	public void displayResult() {
		this.putMarks();
		this.putGrade();
		System.out.println("The final grade of "+this.rollNumber+"roll number is "+this.finalgrade);
	}
}