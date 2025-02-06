package LeetCode;

class Solutions {
	public int removeElement(int[] nums, int val) {
		int k =0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==val) {
				k++;
			}
		}
		int arr[] = new int[k];

		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				arr[i] = nums[i];
			}
		}
		return k;
	}
}
