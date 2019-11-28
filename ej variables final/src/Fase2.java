
public class Fase2 {

	public static void main(String[] args) {
		
		int year = 1988;
		
		//First leap year we take
		final int initLeap = 1948;
		
		//When we have a leap year? 
		final boolean leapAlg = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)); 
		
		//How many leap years?
		int leapYears = (year - initLeap) / 4;
		
		System.out.println("Anys de traspás desde " + initLeap + " fins " + year + ": " + leapYears);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
