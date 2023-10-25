package com.edu.array;

import java.util.Scanner;

public class Array_Operations {

	public static void main(String[] args) {
		int [] a;
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		size=sc.nextInt();
		a = new int[size];
		
		System.out.println("Enter "+a.length+ " Elements :");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Array Elements are: ");
		for(int i :a) {
			System.out.println(i);
		}
		
		//sum of all array elements
		int sum=0;
		for(int i:a) {
			sum +=i;
		}
		System.out.println("Sum= "+sum);
		
		//average
		float avg =0;
		avg=(float) sum/a.length;
		System.out.println("Average: "+avg);
		
		//Find the largest element of an array
		int max=a[0]; //assume first number is largest
		for(int i=1;i<a.length;i++) {
			if(a[i]>max)
				max =a[i];
		}
		System.out.println("Largest of all array elements "+max);
		
		
		//minimum number
		int min=a[0];//assume first number is minimum
		for(int i=1;i<a.length;i++) {
			if(a[i]<min)
				min = a[i];			
		}
		System.out.println("Minimum of all array elements "+min);
		
		//Search an element in an elements (Linear search)
		int pos = 0;
		System.out.println("Enter an element to search");
		int key = sc.nextInt(); //key =5
		
		for(int i = 0; i < a.length; i++) { //2 3 5 6 5 8
			if(key == a[i]) {
				pos = pos+i; //pos =2
				break;
			}
		}
		if(pos > 0) {
			System.out.println("Successful search ");
			System.out.println(key+" presesnt at position "+(pos+1));
		}else {
			System.out.println(key +" not found");
			System.out.println("Unsuccessful Search");
		}
		
		

	}

}
