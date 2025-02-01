package project1;

public class FourthTypeFunction {

    static float anyCountryToIndianRupees(String country, int amt) {
        float res = 0.0f;
        if (country.equalsIgnoreCase("USA")) {
            res = amt * 78.67f;
        } else if (country.equalsIgnoreCase("UAE")) {
            res = amt * 20.56f;
        } else if (country.equalsIgnoreCase("UK")) {
            res = amt * 120.56f;
        }
        return res;
    }

    static int getAmt() {
        return 100;
    }

    public static void main(String[] args) {
        int usDollars = 100, ukPounds = 200, uaeDirhams = 50;
        float rupees;
        rupees = anyCountryToIndianRupees("USA", getAmt());
        System.out.println("Indian Rupees for 100 USD: " + rupees);

       
        rupees = anyCountryToIndianRupees("UK", ukPounds);
        System.out.println("Indian Rupees for 200 UK Pounds: " + rupees);

        
        rupees = anyCountryToIndianRupees("UAE", uaeDirhams);
        System.out.println("Indian Rupees for 50 UAE Dirhams: " + rupees);
    }
}
