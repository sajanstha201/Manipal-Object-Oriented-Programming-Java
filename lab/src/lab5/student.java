package lab5;
import java.util.*;
public class student{
	int reg,joinDate;
	String fullname;
	short semester;
	float GPA,CGPA;
	public static int count=24;
	public Scanner sc=new Scanner(System.in);
	public student(){}	
		
	student(String fullname,short semester,float GPA,float CGPA,int joinDate,int i){
		this.fullname=fullname;
		this.semester=semester;
		this.GPA=GPA;
		this.CGPA=CGPA;
		this.joinDate=joinDate;
		this.reg=(this.joinDate%100)*100+i;
	}
	public void getinfo() {
		count++;
		System.out.print("Name: ");
		this.fullname=sc.nextLine();
		System.out.print("Join Date: ");
		this.joinDate=sc.nextInt();
		System.out.print("semester: ");
		this.semester=sc.nextShort();
		System.out.print("GPA: ");
		this.GPA=sc.nextFloat();
		System.out.print("CGPA: ");
		this.CGPA=sc.nextFloat();
		sc.nextLine();
		this.reg=(this.joinDate%100)*100+count;
	}
	static void displayRecord(student st[]){
		int i;
		System.out.println("Reg \t Full name \t semester \t CGPA");
		for(i=0;i<st.length;i++) {
			System.out.println(st[i].reg+"\t\t"+st[i].fullname+"\t\t"+st[i].semester+"\t\t"+st[i].CGPA);
		}
	}
	static void sortSemAndCGPA(student st[]) {
		int i,j;
		student temp;
		for(i=0;i<st.length;i++) {
			for(j=i;j<st.length;j++) {
				if(st[i].semester>st[j].semester) {
					temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}

			}
		}
		for(i=0;i<st.length;i++) {
			for(j=i;j<st.length;j++) {
				if(st[i].semester==st[j].semester) {
					if(st[i].CGPA<st[j].CGPA) {
						temp=st[i];
						st[i]=st[j];
						st[j]=temp;
					}
				}
			}
		}
	}
	public static void sortName(student st[]) {
		int i,j;
		student temp;
		for(i=0;i<st.length;i++) {
			for(j=i;j<st.length;j++) {
				if(st[i].fullname.compareToIgnoreCase(st[j].fullname)>0) {
					temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
			}
		}
	}
	
	
	
	
	
	
	//resume for there
	
	
	
	
	
	public static void startParticularchar(student st[],char c) {
		int i;
		System.out.println("The student name that start with \""+c+"\" character are: ");
		for(i=0;i<st.length;i++) {
			if(st[i].fullname.charAt(0)==c) {
				System.out.println(st[i].fullname);
			}
		}
	}
	public static void startParticularsubstring(student st[],String str) {
		int i,j;
		System.out.println("\n\n The student name containing sub string \""+str+"\" are: ");
		for(i=0;i<st.length;i++) {
			int num=0,k=1;
			st[i].fullname.trim();
			for(j=0;j<st[i].fullname.length();j++) {
				if(st[i].fullname.charAt(j)==' ')
					num++;
			}
			int arr[]=new int[num+2];
			arr[0]=-1;
			for(j=0;j<st[i].fullname.length();j++) {
				if(st[i].fullname.charAt(j)==' ') {
					arr[k]=j;
					k++;
				}
			}
			arr[k]=st[i].fullname.length();
			for(j=0;j<k;j++) {
				if(str.compareToIgnoreCase(st[i].fullname.substring(arr[j]+1,arr[j+1]))==0) {
					System.out.println(st[i].fullname);
				}
			}
		}
	}
	static void initialFamilyName(student st[]) {
		int i,j;
		for(i=0;i<st.length;i++) {
			String modname="";
			int num=0,k=0;
			for(j=0;j<st[i].fullname.length();j++) {
				if(st[i].fullname.charAt(j)==' ')
					num++;
			}
			modname+=Character.toString(st[i].fullname.charAt(0)).toUpperCase()+".";
			for(j=0;j<st[i].fullname.length();j++) {
				if(st[i].fullname.charAt(j)==' ') {
					k++;
					if(num==k) {
						modname+=Character.toString(st[i].fullname.charAt(j+1)).toUpperCase();
						modname+=st[i].fullname.substring(j+2,st[i].fullname.length());
						break;
					}
					else
						modname+=Character.toString(st[i].fullname.charAt(j+1)).toUpperCase()+".";
				}
			}
			st[i].fullname=modname;
		}
	}

}