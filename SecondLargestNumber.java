package Week1.Day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int [] nums = {10,45,9877,5875,153,18};
		Arrays.sort(nums);
		int len = nums.length;
		System.out.println(nums[len-2]);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);	
		}	
	}

}
