package LeetCode;

class Solution2 {
    public int findMaxConsecutiveOnes(int[] nums) {
    	int max =0;
    	int current = 0;
    	for(int ele:nums) {
    		if(ele==1) {
    			current++;
    			max = Math.max(max, current);
    		} else {
    			current = 0;
    		}
    	}
    	return max;
    }
}
