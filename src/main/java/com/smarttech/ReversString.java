package com.smarttech;

public class ReversString {
  void 	getSwap(int a, int b) {
	  
	  System.out.println("A value before swap" + a);
	  System.out.println("B value before"+b);
	  a=a+b;//60
	  b=a-b;//20
	  a=b-a;//40
	  System.out.println("A value after swap "+a);
	  System.out.println("B value after sape "+b);
  }
  public static void main(String[] args) {
	  ReversString obj = new ReversString();
	  obj.getSwap(20, 40);
}
}
