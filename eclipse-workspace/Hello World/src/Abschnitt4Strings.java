
public class Abschnitt4Strings{
	
	public static void run(String input) {
		int pos = input.lastIndexOf(" ");
		System.out.println(input.substring(pos + 1));
		
		
	}
	public static void main(String[] args) {
		run("Ich lebe in Berlin");
	}
}