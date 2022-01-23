package com.smarttech;

public class Deens {
	
	 void  getDuplicate(int []nums) {
		 
		 for (int i = 0;i<nums.length;i++) {
			 for (int j= i+1;j<nums.length;j++) {
				 if (nums[i]==nums[j]) {
					 System.out.println("i pound duplicate "+ nums[j]);
				 }
				 
			 }
		 }
		 
	 }
public static void main(String[] args) {
	int []nums = {33,34,44,33,43,34,22,66,55,46,47};
	Deens obj = new Deens();
	obj.getDuplicate(nums);
}
}
