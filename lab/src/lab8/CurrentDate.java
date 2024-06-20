package lab8;
import java.util.*;
import lab8.InvalidDayException;
import lab8.InvalidMonthException;
public class CurrentDate {
int day,month,year;
Scanner sc=new Scanner(System.in);
public static void main(String [] args) {
	CurrentDate date=new CurrentDate();
	try {
		date.createDate();
	}
	catch(Exception e){
	System.out.println(e.getMessage());
	}
}
void createDate() throws Exception {
	System.out.print("Enter year:");
	this.year=sc.nextInt();
	System.out.println("Month: ");
	this.month=sc.nextInt();
	if(this.month<=0||this.month>12)
		throw new InvalidMonthException();
	System.out.println("Day: ");
	this.day=sc.nextInt();
	if(this.month==2) {
		if(this.year%4==0)
			if(this.day<1||this.day>29)
				throw new InvalidDayException();
		else
			if(this.day<1||this.day>28)
					throw new InvalidDayException();
	}
	else if(this.month%2==0){
		if(this.day<1||this.day>31)
			throw new InvalidDayException();
	}
	else {
		if(this.day<1||this.day>30)
			throw new InvalidDayException();
	}
	System.out.println(this.year+"-"+this.month+"-"+this.day);
}

}
