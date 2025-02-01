package MyProjecttt;
public class PrimeNO1 {
	public static void main(String[] args) {
		int num = 434, counter=0;
		for (int p=num;p>=1;p--) {
		 if(num % p == 0) counter++;
		}
		if(counter == 2) System.out.println("it is prime");
		else System.out.println(" its not a prime");

	}
}