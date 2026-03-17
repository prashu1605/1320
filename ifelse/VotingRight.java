package ifelse;

public class VotingRight {

public static void main(String args[]){
	int age = 20;
	
	if(age>18) {
		System.out.println("Adult");
		
		if(age>=25) {
			System.out.println(" and can also contest in elections");
		}else {
			System.out.println(" but cannot contest in elections");
		}
	}else {
		System.out.println("not An Adult");
	}

	}

}
