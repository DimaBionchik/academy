package by.academy.lesson.homeWork2;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	static int pairs(int k, int[] arr) {
		int pairsCount = 0;
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}
		for (int num : arr) {
			if (set.contains(num + k)) {
				pairsCount++;
			}
		}

		return pairsCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String[] nk = scanner.nextLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		int[] arr = new int[n];
		String[] arrItems = scanner.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
			System.out.println(arr[i]);
		}
		int result = pairs(k, arr);
		System.out.println(result);
		scanner.close();

	}

}
