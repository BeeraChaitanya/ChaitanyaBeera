package MyProjecttt;

public class PrimeNO2 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 100; i++) {
            int num = i;
            int counter = 0;
           
            for (int p = 1; p <= num; p++) {
                if (num % p == 0) {
                    counter++;
                }
            }
            if (counter == 2) {  
                System.out.print(num + " "); 
                k++;
                if (k == 6) { 
                    System.out.println();
                    k = 0;
                }
            }
        }
    }
}
