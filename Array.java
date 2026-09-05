// public class Array {
// 	public static void main(String[] args) {
// 		int score[] = { 89, 56, 66, 91, 22 };
// 		for (int i = 1; i <= 5; i++) {
// 			System.out.println(score[i]);
// 			i++;
// 		}

// 	}
// }

//2. Print all the elements in the array
// public class Array {
// 	public static void main(String[] args) {

// 		int score[] = { 89, 56, 66, 91, 22 };

// 		for (int i = 0; i < score.length; i++) {
// 			System.out.print(score[i] + " ");
// 		}
// 	}
// }

// 3. Find the highest number in the array
public class Array {
	public static void main(String[] args) {

		int score[] = { 89, 56, 66, 91, 22 };
		int max = score[0];

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}

		System.out.println("Maximum = " + max);
	}
}