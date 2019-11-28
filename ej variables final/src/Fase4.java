
public class Fase4 {

	public static void main(String[] args) {
				
		String name = "Javier ";
		String lastName1 = "del Moral ";
		String lastName2 = "Asensio";
		
		String fullName = name + lastName1 + lastName2;
		
		int day = 26;
		int month = 02;
		int year = 1988;
		
		String birthDate = day + "/" + month + "/" + year;
		
		
			System.out.println("El meu nom és " + fullName);
		
			System.out.println("Vaig neixer el " + birthDate);
		
		final boolean leapAlg = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)); 
		
		if (leapAlg) {
			
			System.out.println("El meu any de naixement es de traspás!");
			
		} else {
			
			System.out.println("El meu any de naixement NO es de traspás!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
