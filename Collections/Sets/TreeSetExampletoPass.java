package Sets;
import java.util.*;
public class TreeSetExampletoPass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(findLongestConsecutiveSequence(arr));

		sc.close();
	}

	private static int findLongestConsecutiveSequence(int[] nums) {
		HashSet<Integer> set = new HashSet<>();

		// Add all elements to the HashSet
		for (int num : nums) {
			set.add(num);
		}

		int maxLength = 0;

		// Check each number to find the start of a sequence
		for (int num : nums) {
			// Check if it's the start of a sequence
			if (!set.contains(num - 1)) {
				int currentNum = num;
				int currentStreak = 1;

				// Count consecutive numbers
				while (set.contains(currentNum + 1)) {
					currentNum += 1;
					currentStreak += 1;
				}

				// Update maxLength if current streak is the longest
				maxLength = Math.max(maxLength, currentStreak);
			}
		}

		return maxLength;
	}
}
