package lab5;
public class STUDENTS{

 String sname,initials,sname2;

STUDENTS (String sname) {

 this.sname=sname;

 this.initials="";

}

static void displayInitials(STUDENTS student[]) {
 int i;
 for(i=0;i<student.length;i++) {
  System.out.println(student[i].initials);
 }
}
static void displayNameWithoutWhitespace(STUDENTS student[]) {
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



static void subString(STUDENTS student[],int n,String sub) {
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
static void sort(STUDENTS student[],int n) {
 int i,j;
 STUDENTS temp;
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