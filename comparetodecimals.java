import java.util.Scanner;

	public class comparetodecimals {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter any character: ");
	        char inputChar = scanner.next().charAt(0);

	       
	        if (Character.isLetter(inputChar)) {
	            System.out.println("'" + inputChar + "' is an alphabet.");
	        }
	       
	        else if (Character.isDigit(inputChar)) {
	            System.out.println("'" + inputChar + "' is a digit.");
	        }
	       
	        else {
	            System.out.println("'" + inputChar + "' is a special character.");
	        }

	     
	        scanner.close();
	    }
	}