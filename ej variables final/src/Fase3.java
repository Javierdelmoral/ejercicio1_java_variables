
public class Fase3 {

	public static void main(String[] args) {
		
		//My birth
		int year = 1988;
		
				
		//Show all the leap years from your birth to 1948
		
		int LeapYears = 1948;
		
		//When we have a leap year? Boolean Algorithm
		final boolean leapAlg = ((LeapYears % 4 == 0) && (LeapYears % 100 != 0) || (LeapYears % 400 == 0)); 
		
		
		//for loop
		
		for (int i = 1948; i < year; i += 4) {
			
			if (leapAlg == true) {
				
				System.out.println("L'any " + i + " �s un any de trasp�s!");
				
			}
			
		}
				
		
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			
			System.out.println("El meu any de naixement ("+ year + ") es de trasp�s!");
			
		} else {
			
			System.out.println("El meu any de naixement ("+ year + ") NO es de trasp�s!");
		}
		
		
				
		
		
	}

}
