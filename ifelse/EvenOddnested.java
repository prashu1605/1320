package ifelse;

public class EvenOddnested {

public static void main(String args[]){
	
	int number = 56;
	
	if((number%2) == 0) {
		System.out.print("number is even");
		
		if(number > 50) {
			System.out.println(" and number is also greater than 50");
		}
		else {
			System.out.println(" but number is not greater than 50 ");
		}
	}else
	{
		System.out.println("number is odd");
	}
		
	}

}
