package lab5;
import java.util.Scanner;
public class lab5_2 {
		public static void main(String [] args) {
			int n=3,i;
			Scanner sc=new Scanner(System.in);
			STUDENT student[]=new STUDENT[n];
			String name;
			for(i=0;i<n;i++) {
				System.out.println("Name: ");
				name=sc.nextLine();
				student[i]=new STUDENT(name);
				student[i].extractInitial();
				student[i].removeWhitespace();
			}
			System.out.println("The entered name initials are: ");
			STUDENT.displayInitials(student);
			System.out.println("The enterd name without whitespace are: ");
			STUDENT.displayNameWithoutWhitespace(student);
			
			System.out.println("The name of sudent with same substring \"sajan\" are:");
			STUDENT.subString(student,n,"sajan");
			System.out.println("\nThe asscending order of enter name are; ");
			STUDENT.sort(student, n);
		}
		static class STUDENT{

			String sname,initials,sname2;

		STUDENT (String sname) {

			this.sname=sname;

			this.initials="";

		}

		static void displayInitials(STUDENT student[]) {
			int i;
			for(i=0;i<student.length;i++) {
				System.out.println(student[i].initials);
			}
		}
		static void displayNameWithoutWhitespace(STUDENT student[]) {
			int i;
			for(i=0;i<student.length;i++) {
				System.out.println(student[i].sname2);
			}
		}
		void extractInitial() {
			int i;
			char temp;
			String temp2="";
			this.sname=this.sname.trim();
			this.initials+=Character.toString(this.sname.charAt(0));
			for(i=0;i<this.sname.length();i++) {
				if(this.sname.charAt(i)==' ') {
					temp=this.sname.charAt(i+1);
					temp2=Character.toString(temp);
					this.initials+=temp2;
				}
			}
		}

		void removeWhitespace() {
			int i;
			char temp;
			String temp2="";
			this.sname=this.sname.trim();
			for(i=0;i<this.sname.length();i++) {
				if(this.sname.charAt(i)!=' ')
					temp2+=Character.toString(this.sname.charAt(i));
			}
			this.sname2=temp2;
		}
		
		

		static void subString(STUDENT student[],int n,String sub) {
			int i,j,l;
			String temp;
			for(i=0;i<n;i++) {
				int num=0,k=1;
				student[i].sname=student[i].sname.trim();
				for(j=0;j<student[i].sname.length();j++) {
					if(student[i].sname.charAt(j)==' ')
						num++;
				}
				int arr[]=new int[num+2];
				arr[0]=-1;
				for(j=0;j<student[i].sname.length();j++)
					if(student[i].sname.charAt(j)==' ') {
						arr[k]=j;
					k++;
					}
				arr[k]=student[i].sname.length();
				for(l=0;l<arr.length-1;l++) {
					if(sub.equalsIgnoreCase(student[i].sname.substring(arr[l]+1,arr[l+1]))) {
						System.out.println(student[i].sname);
						continue;
					}
				}
			}
		}
		static void sort(STUDENT student[],int n) {
			int i,j;
			STUDENT temp;
			for(i=0;i<n;i++) {
				for(j=i;j<n;j++) {
					if(student[i].sname.compareTo(student[j].sname)>0) {
						temp=student[i];
						student[i]=student[j];
						student[j]=temp;
					}
				}
			}
			for(i=0;i<n;i++) {
				System.out.println(student[i].sname);
			}
		}
		
		
		}


	}
