
public class Abschnitt2 {
	
	public static void main(String[] args) {
		
		long zahl = 321 + 20;
		zahl = zahl + 20;
		
		System.out.println(zahl);
		
		
		double Kzahl = 5.0 / 2;
		
		System.out.println(Kzahl);
		
		char letter = 'g';
		
		System.out.println(letter);
		
		boolean b;
		long a;
		a = 400;
		
		b = (a >= 200);
		System.out.println(b);
		
		
		String greeting = "Hallo";
		greeting = greeting + " Welt";
		greeting.concat("!");
		
		System.out.println(greeting);
		System.out.println(greeting.substring(7, 10));
		System.out.println(greeting.length());
		
	}
	
}
