package Searching;

import java.util.Scanner;

public class FindingMinUsingBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int arr[] = new int[str.length];
		for(int i=0;i<str.length;i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println(binarySearch(arr));
		sc.close();
	}
	public static int binarySearch(int arr[]) {
		int left=0;
		int right = arr.length-1;
		
		if(arr[left]<arr[right]) {
			return arr[left];
		}
		
		while(left<=right) {
			if(left==right) {
				return arr[left];
			}
			
			int mid=left+(right-left)/2;
			
			if(arr[mid]>arr[mid+1]) {
				return arr[mid+1];
			}
			
			if(arr[mid]<arr[mid-1]) {
				return arr[mid];
			}
			
			if(arr[mid]>arr[left]) {
				left = mid +1;
			} else {
				right = mid -1;
			}
			
		}
		return -1;
	}
}
