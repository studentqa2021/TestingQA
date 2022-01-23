package com.smarttech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxNumfromList {
	// List > Part of Collection, It's an Interface.
	// List implements four Classes
	// 1. ArrayList 2. LinkedList 3. Vector 4. Stack
	
	public void getMaxNum(List<Integer> nums) {
		/*
		int maxNum = nums.get(0);
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) > maxNum) {
				maxNum = nums.get(i);
				
			}
		}
		*/
		System.out.println(Collections.max(nums));
	}
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(100);
		nums.add(43);
		nums.add(200);
		nums.add(500
				);
		MaxNumfromList obj = new MaxNumfromList();
		obj.getMaxNum(nums);
	}

}
