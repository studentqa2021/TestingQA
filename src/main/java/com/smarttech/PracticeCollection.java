package com.smarttech;

import java.util.Arrays;

public class PracticeCollection {
	public void getMaxValue (int[] nums) {
		int maxNum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > maxNum) {
				maxNum = nums[i];
			}
		}
		System.out.println(maxNum);
	}
	
	
	public static void main(String[] args) {
		PracticeCollection cl = new PracticeCollection();
		
		int[] nums = {100, 32, 200, 43, 43, 500, 54};
		cl.getMaxValue(nums);	
	}
}
