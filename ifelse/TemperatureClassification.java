package ifelse;

public class TemperatureClassification {

public static void main(String args[]){
	
	int temp = 20;
	
	if(temp>30) {
		System.out.println("hot day");
	}else if( temp >20 && temp<=30) {
		System.out.println("warm");
	}else if(temp > 10 && temp <=20) {
		System.out.println("cool");
	}else {
		System.out.println("cold");
	}
	}

}
