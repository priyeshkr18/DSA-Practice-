public class sumofelements {
	public static void main(String[] args) {
		int sum = 0;
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < num.length; i++) {
			sum = (sum + num[i]);

		}

		System.out.println("Sum of all the elements in the Array are: " + sum);
	}

}
