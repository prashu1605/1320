package ifelse;

public class LeapCenturyYr {

public static void main(String args[]){
	
int year = 1988;
	
	if((year%4)==0) {
		System.out.print("year is leap yr");
		
		if((year %400) ==0) {
			System.out.println(" and year is also century yr ");
		}else {
			System.out.println(" but year is not century year");
		}
	}else {
		System.out.println("year is not  leap year");
	}
		
	}

}
