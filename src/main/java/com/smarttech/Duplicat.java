package com.smarttech;

public class Duplicat {
	
	 void getDuplicatevalue(int [] nums){
		 
		 for (int i = 0;i< nums.length;i++) {
			 for (int j = i+1;j<nums.length;j++) {
				 if (nums [i] == nums [j]) {
					System.out.println(" i found duplicate value =" +nums[j]); 
				 }
			 }
		 }
	}
	 public static void main(String[] args) {
		int [] nums ={1,2,3,4,5,6,4,3,5,1};
		Duplicat obj = new Duplicat();
		obj.getDuplicatevalue(nums);
	}
}
