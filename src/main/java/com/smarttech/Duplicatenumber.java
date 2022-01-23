package com.smarttech;

public class Duplicatenumber {
	void getDuplicatevalue(int []nums) {
		
		for (int i=0;i<nums.length;i++) {
			
			for (int j =i+1;j<nums.length;j++) {
				
				if (nums[i] ==nums[j]) {
					System.out.println(nums[j]);
				}
				
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		int []nums = {22,33,44,34,32,76,56,44,22};
		Duplicatenumber obj =new Duplicatenumber();
		obj.getDuplicatevalue(nums);
	}

}
