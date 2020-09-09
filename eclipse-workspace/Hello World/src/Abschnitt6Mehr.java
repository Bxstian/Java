import java.util.Arrays;

public class Abschnitt6Mehr {

	public static void main(String[] args) {
		
		boolean[][] board = new boolean [8][8];
		board[2][3] = true;
		for(boolean[] row : board) {
			System.out.println(Arrays.toString(row));
		}
	}

}
