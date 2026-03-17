package ifelse;

public class TriangleType {

public static void main(String args[]){
		
	int a = 4;
	int b = 3;
	int c = 4;
	
	if( a == b && b == c) {
		System.out.println("equilateral triangle");
	}else if( a == b || b == c || a == c) {
		System.out.println("Isosceles triangle");
	}else {
		System.out.println("Scalene triangle");
	}
	}

}
