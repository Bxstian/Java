import java.util.Arrays;

public class ArraysSummen {
	public static void sum(int[][] arr) {
		int sum = 0;
		for(int[] a : arr) {
			for (int b: a) {
				sum+=b;
				
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[][] a = {{4,2},{9,5,2},{1}};
		sum(a);


	}

}
