package com.edu.array;

public class Even_Position {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		System.out.println("Elements of given array present on even position:");
		for(int i=1;i<a.length;i+=2) {
			System.out.println(a[i]);
		}
		
		
		
	}

}
