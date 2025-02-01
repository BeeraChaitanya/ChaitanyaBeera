package MyProjecttt;
public class PrimeNO3 {
    public static void main(String[] args) {
        int k = 0; 
        for (int i = 1; i <= 1000; i++) {
            int num = i;
            int counter = 0;
          
            for (int p = 1; p <= num; p++) {
                if (num % p == 0) {
                    counter++;
                }
            }
            if (counter == 2) { 
                System.out.print(num + " ");  
                if (++k % 8 == 0) {  
                    System.out.println();
                }
            }
        }
    }
}
