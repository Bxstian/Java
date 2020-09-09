import java.util.Scanner;

public class Abschnitt5Break {
	
	public static void main(String[] args) {
		
		for(int i = 0; i <= 20; i++) {
			 if (i == 7) {
				continue; 
			 }if (i == 13) {
				 continue;
			 }if ( i== 14) {
				continue;  
			 }
			 
			System.out.println("Etage: " + i);
			
		}
	}
}