package Project;

public class PrimeNoo4 {

	public static void main(String[] args) {
			int pn=0;
			for(int i=1,k=0,m=0;i<=30;i++) {
				
				int num = i; 
				
				int counter=0;
				for(int p=1;p<=num;p++) {
					if(num % p == 0) counter++;
					
				}
				if(counter == 2) {
					pn = num;
				}
				
			}
			
			System.out.println("last prime number--->"+pn);
			
			
					
		}

		
		
		
	}

