package com.edu.array;
import java.util.Scanner;
public class ArrayInputOutput_2 {

	public static void main(String[] args) {
		
				int a[]; //default values of array 0
				int size;
				

				Scanner scanner = new Scanner(System.in);
				//input array elements
				
				System.out.println("Enter size of an Array");
				size = scanner.nextInt();
				a=new int[size];
				
				System.out.println("Enter "+size+" elements");
				for(int i=0;i<a.length;i++) {
					a[i] = scanner.nextInt();
				}
				
				//Display
				System.out.println("Array elements are ");
				for(int i=0;i<a.length;i++) {
					System.out.println(a[i]);
				}
				
				
		    }

		}