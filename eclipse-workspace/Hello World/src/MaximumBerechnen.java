
public class MaximumBerechnen {

	public static void max(int[] arr) {
		int maxItem = Integer.MIN_VALUE;
		for(int item : arr) {
			maxItem = Math.max(maxItem, item);

				
		}
		System.out.println(maxItem);
	}
	
	
	public static void main(String[] args) {
		int[] a = {13, 25, 0, 44};
		max(a);
	}
}
