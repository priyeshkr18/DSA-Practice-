// import java.util.LinkedList;
// import java.util.Scanner;

// public class SearchInLinkedList {
// 	public static void main(String[] args) {

// 		Scanner scanner = new Scanner(System.in);

// 		LinkedList<Integer> list = new LinkedList<>();

// 		list.add(10);
// 		list.add(20);
// 		list.add(30);
// 		list.add(40);
// 		list.add(50);

// 		System.out.print("Enter number to search: ");
// 		int num = scanner.nextInt();

// 		if (list.contains(num)) {
// 			System.out.println("Element found!");
// 		} else {
// 			System.out.println("Element not found!");
// 		}
// 	}
// }
import java.util.LinkedList;
import java.util.Scanner;

public class SearchInLinkedList {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList<Integer> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.print("Enter number to search: ");
		int num = sc.nextInt();

		int index = list.indexOf(num);

		if (index != -1) {
			System.out.println("Element found at index: " + index);
		} else {
			System.out.println("Element not found!");
		}
	}
}