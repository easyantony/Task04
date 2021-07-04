package com.training.unit04.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
							
		int []  D = new int [6];
		
		Random rand = new Random();
		
		System.out.println("Исходный массив: ");
		
		for (int i = 0; i < D.length; i ++) {
			D [i] = rand.nextInt(1000);
			System.out.print("[" + D [i] + "]");
		}
		System.out.println();
		
		int sum1_3 = sum1 (D);
		int sum3_5 = sum2 (D);
		int sum4_6 = sum3 (D);
												
	}
	
	
	public static int sum1  (int D []) {
		int sum1 = 0;
		for (int i = 0; i < D.length; i ++ ) {			
			
			 if(i == 0) { 
				 sum1 = D [i] + D[i + 1] + D[i + 2]; 
				 System.out.println("Сумма чисел с 1 по 3 = " + sum1);							  			
			 }			 	
		}
		return sum1;				
	}
		
	
	public static int sum2  (int D []) {
		int sum2 = 0;
		for (int i = 0; i < D.length; i ++ ) {			
				
			if (i == 2) { 
				sum2 = D [i] + D[i + 1] + D[i + 2];
				System.out.println("Сумма чисел с 3 по 5 = " + sum2);					
			}
		}
		return sum2;
	}


		
	public static int sum3  (int D []) {
		int sum3 = 0;
		for (int i = 0; i < D.length; i ++ ) {			
	
			if (i == 3) {
				sum3 = D [i] + D[i + 1] + D[i + 2];
				System.out.println("Сумма чисел с 4 по 6 = " + sum3);
					
			}
				
		}
		return sum3;
	}
		

}
