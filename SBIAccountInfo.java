package demo;

public class SBIAccountInfo { 
    public static void main(String[] args) { 
        SBIAccount acc1 = new SBIAccount("Hari", "7815810684", 10000); 
        SBIAccount acc2 = new SBIAccount("Jane Smith", "9876543210", 20000); 
        System.out.println(acc1); 
        System.out.println(acc2); 
        System.out.println("\nOperations on Account 1:"); 
        acc1.deposit(5000);
        acc1.checkBalance();
        acc1.withDraw(3000);
        acc1.checkBalance();
        acc1.withDraw(15000);         
        System.out.println("\nOperations on Account 2:"); 
        acc2.deposit(10000);
        acc2.checkBalance();
        acc2.withDraw(5000); 
        acc2.checkBalance(); 
    } 
}