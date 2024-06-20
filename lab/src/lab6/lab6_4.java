package lab6;

public class lab6_4 {
	public static void main(String args[]) {
		house home=new house();
		home.setstories(5);
		home.setfootage(2.5*3);
		home.setbaths(5);
		home.setbedrooms(10);
		System.out.println("The details of home is given below");
		System.out.println("Stories: "+home.getstories()+"\nFootage: "+home.getfootage()+
				" square km \nBaths: "+home.getbaths()+"\nBedrooms: "+home.getbedrooms());
		school mit=new school();
		mit.setstories(6);
		mit.setfootage(10*10);
		mit.setclassrooms(5);
		mit.setgradelevel("Junior High");
		System.out.println("The details of MIT school  is given below");
		System.out.println("Stories: "+mit.getstories()+"\nFootage: "+mit.getfootage()+
				" square km\nNumber of Class Rooms : "+mit.getclassrooms()+"\nGrade Level: "+mit.getgradelevel());
	}

}
class building{
	int stories;
	double footage;
	void setstories(int stories) {
		this.stories=stories;
	}
	int getstories() {
		return this.stories;
	}
	void setfootage(double footage) {
		this.footage=footage;
	}
	double getfootage() {
		return this.footage;
	}
}
class house extends building{
	int bedrooms,baths;
	house(){
		super();
	}
	void setbedrooms(int bedrooms) {
		this.bedrooms=bedrooms;
	}
	int getbedrooms() {
		return this.bedrooms;
	}
	void setbaths(int baths) {
		this.baths=baths;
	}
	int getbaths() {
		return this.baths;
	}
	
}
class school extends building{
	int classrooms;
	String gradelevel;
	school(){
		super();
	}
	void setclassrooms(int classrooms) {
		this.classrooms=classrooms;
	}
	int getclassrooms() {
		return this.classrooms;
	}
	void setgradelevel(String gradelevel) {
		this.gradelevel=gradelevel;
	}
	String getgradelevel() {
		return this.gradelevel;
	}
	
}