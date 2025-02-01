package project1;


public class include {

	public static void main(String[] xyz) {
	
	
		int a=500,b=25000,c=35000;
		int big,small;
		
		
		if(b>c) {
			big = b;
			small=c;
		}
		 
			big = c;
			small = b;
		}
		
		if(a > big) big = a;
		if(a< small) small = a;
		
		
		
		
		System.out.println(" big number--->"+big);
		System.out.println(" small number--->"+small);
		
		System.out.println("program ends");

		
		
		
		
		
	}

}