import java.util.Scanner;

public class Abschnitt4Month {
	
    public static void run(String month) {
        
        switch(month) {
            case "Januar":
                System.out.println("31");
                break;
            case "Februar":
                System.out.println("28");
                break;
            case "März":
                System.out.println("31");
                break;
            case "April":
                System.out.println("30");
                break;
            case "Mai":
                System.out.println("31");
                break;
            case "Juni":
                System.out.println("30");
                break;
            case "Juli":
                System.out.println("31");
                break;
            case "August":
                System.out.println("31");
                break;
            case "September":
                System.out.println("30");
                break;
            case "Oktober":
                System.out.println("31");
                break;
            case "November":
                System.out.println("30");
                break;
            case "Dezember":
                System.out.println("31");
                break;
        }
    }
	
	public static void main(String[] args) {
		run("Februar");

	}
}
	