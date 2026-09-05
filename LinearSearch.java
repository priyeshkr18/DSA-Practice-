public class LinearSearch {
	public static void main(String[] args) {

		int num[] = { 10, 20, 30, 40, 50 };
		int target = 30;

		for (int i = 0; i < num.length; i++) {
			if (num[i] == target) {
				System.out.println("Element found at index: " + i);
				return;
			}
		}

		System.out.println("Element not found");
	}
}