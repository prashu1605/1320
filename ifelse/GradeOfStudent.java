package ifelse;

public class GradeOfStudent {

public static void main(String args[]){
	
	int marks = 67;
	
	if(marks >= 90 && marks <= 100) {
		System.out.println("Grade A");
	}else if( marks >=75 && marks <= 89) {
		System.out.println("Grade B");
	}else if(marks >= 50 && marks <= 74) {
		System.out.println("Grade C");
	}else if(marks >= 35 && marks <= 149) {
		System.out.println("Grade D");
	}else {
		System.out.println("FAIL");
	}
	}

}
