import java.util.Arrays;

public class MagicArray {
	
	public static void magic(int[][] arr) {
		int[] sums = new int[arr.length];
		int counter = 0;
		for (int[] a: arr) {
			int sum = 0;
			for (int b : a) {
				sum = sum + b;
			}
			sums[counter] = sum;
			counter++;
		}
		
		boolean isMagicArray = true;
		int firstSumsValue = sums[0];
		for(int value : sums) {
			if (value != firstSumsValue) {
				isMagicArray = false;
				
			}
		}
		
		if(isMagicArray) {
			System.out.println("Magic Array");
		} else {
			System.out.println("Simple Array");
		}
	}

	public static void main(String[] args) {
		int[][] a = {{2,2,5,1},{5,5},{7,2,1}};
		magic(a);

	}

}
