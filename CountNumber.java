import java.util.Scanner;

public class CountNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter number to search: ");
		int num = sc.nextInt();

		int count = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == num) {
				count++;
			}
		}

		System.out.println("Number occurs " + count + " times.");
	}
}