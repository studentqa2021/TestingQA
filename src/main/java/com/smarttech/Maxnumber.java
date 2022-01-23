package com.smarttech;

public class Maxnumber {
	void getDuplicte(int []nums) {
		for (int i=0;i<nums.length;i++) {
			for (int j=i+1;j<nums.length;j++) {
				if (nums[i] ==nums[j]) {
					System.out.println("Duplicate value ="+nums[i]);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Maxnumber obj = new Maxnumber();
		int []nums= {2,44,54,33,77,66,66,55,55,33,34,54};
		obj.getDuplicte(nums);
	}
	}

	
	


	 