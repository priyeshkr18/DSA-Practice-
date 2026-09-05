public class smallestelementinthearray {
	public static void main(String[] args) {

		int num[] = { 23, 12, 35, 64, 66, 6 };
		int min = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];

			}
		}
		System.out.println("Min: " + min);
	}

}
