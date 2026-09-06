public class ReverseArray {
	public static void main(String[] args) {

		int num[] = { 20, 10, 15, 19, 29 };

		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
	}
}