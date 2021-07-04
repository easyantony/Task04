package com.training.unit04.main;

public class Task01 {

	public static void main(String[] args) {
		
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		
		int nod = evclid(a,b);		
		int nok = kratnoe(a,b,nod);;
											
		System.out.print("a = " + a + "\n"
				+"b = " + b + "\n"
				+"НОД = " + nod + "\n"
				+"НОК = " + nok + "\n");
	}
		
		  public static int evclid(int a, int b) {
			  
			  int nod = 0;
		      
			  while (a != 0 && b != 0) {
				  if (a >= b) {
					a %= b;
		          
				  } else {
		        	  b %= a;
		           	  }
				nod = a + b;
		      	  }
		      
			  return nod;				  
		  
		  }

		  
		  public static int kratnoe(int a, int b, int nod ) {
			  
			  int nok;
			  nok = (a * b) / nod;
			  
			  return nok;

		  }
		 
}


