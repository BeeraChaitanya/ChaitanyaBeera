package project1;

public class Secondtypefunction {
	static void pattern(char ch1,int num1,char ch2,int num2) {
		for(int i=1;i<=num1;i++) {
			System.out.print(ch1);
		}
		System.out.println();
		for(int i=1;i<num2;i++) {
			System.out.println(ch2);
		}
		System.out.println();
	}
	public static void main(String []abc) {
		pattern('*',20,'-',25);
		System.out.println("Its");
		pattern('.',25,'-',35);
		System.out.println("hi-tech city");
	}
	
}
