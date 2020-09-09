import java.util.Scanner;

public class Abschnitt3 {
	
	public static void main(String[] args) {
		
		String greeting = "Hallo";
		greeting = greeting + " Welt";
		greeting.concat("!");
		
		System.out.println(greeting);
		System.out.println(greeting.substring(7, 10));
		System.out.println(greeting.length());
		
		
		String firstname;
		long age;
		Scanner input = new Scanner(System.in);
        firstname = input.next();
        age = input.nextLong();
  
		
        System.out.println("Hi ich heiﬂe " + firstname + " und bin " + age);
		
		long a = 123;
		a += 123;
		a++;
		a--;
		System.out.println(a);
	}
}