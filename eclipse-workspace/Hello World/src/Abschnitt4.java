import java.util.Scanner;

public class Abschnitt4 {
	
	public static void main(String[] args) {
		
		System.out.println("Wie alt bist du ?");
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		
	if(x>=18) {	
		System.out.println("Erwachsen");
	}else if(x>=13) {
		System.out.println("Jugendlich");
	} else {
		System.out.println("Kind");
	}
	switch(x) {
	case 1:
		System.out.println("Erwachsen");
		break;
	case 2:
		System.out.println("Jugendlich");
		break;
	case 3:
		System.out.println("Kind");
		break;
		default:
		System.out.println("nicht zuortbar");
	}
	}
}
	