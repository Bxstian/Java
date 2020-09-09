import java.nio.file.Paths;
import java.util.Scanner;

public class GoetheFaust {

	public static void main(String[] args) throws Exception {
		String file = "\\Users\\Win10\\eclipse-workspace\\Hello World\\src\\faust.txt";
		Scanner input = new Scanner(Paths.get(file));
		int countI = 0;
		int countYou = 0;
		while(input.hasNext()) {
			
			
			String word = input.next();
			word = word.toLowerCase();
			
			if (word.equals("ich")) {
				countI++;
			}
			if (word.equals("du")) {
				countYou++;
			}
			
			
		}
		
		System.out.println("Ich: " + countI);
		System.out.println("Du: " + countYou);
		System.out.println(file);
	
	
	}
	

}
