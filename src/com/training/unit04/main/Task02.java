package com.training.unit04.main;

public class Task02 {

	public static void main(String[] args) {
		
		int a = (int)(Math.random()*100); 
		int b = (int)(Math.random()*100);
		int c = (int)(Math.random()*100);
		
		int sum = sum(a,b,c);
		
		System.out.print("a = " + a +"\n"
						+"b = " + b +"\n"
						+"c = " + c +"\n"
						+"Ñóììà áîëüøåãî è ìåíüøåãî èç äàííûõ ÷èñåë = " + sum);
		

	}

		public static int sum(int a, int b,int c) {
			
			int sum;
			if(a > c & c > b) {
				sum = a + b;
				return sum;
			}
			else if (a > b & b > c) {
				sum = a + c;
				return sum;
			}else {
				sum = b + c;
				return sum;
			}
			
						
		}

}

