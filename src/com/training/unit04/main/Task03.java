package com.training.unit04.main;

public class Task03 {

	public static void main(String[] args) {
		
		int a = (int)(Math.random()*1000000);
		int b = (int)(Math.random()*1000000);
		
		int counta = counta(a);
		int countb = countb(b);
		
		
		System.out.println("a = " + a + "\n" 
				  +"b = " + b + "\n"
				  +"Количество цифр в числе a = " + counta + "\n"
				  +"Количество цифр в числе b = " + countb);
		
		if (counta > countb) {
			System.out.print("a > b");
		}else if (counta < countb) {
			System.out.print("b > a");
		}else
			System.out.print("a = b");
	}
	
	
	public static int counta(int a) {
		
		int counta = 0;
				
		while (a != 0) {
			a /= 10;
			counta ++;
						
		}
	return counta;
	
	}
	
	
	public static int countb(int b) {
		
		int countb = 0;
				
		while (b != 0) {
			b /= 10;
			countb ++;
						
		}
	return countb;
	
	}
		
}
