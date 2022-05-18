package LoopApplications;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        int num = 5;
        boolean b = true;
        int i = 0;
        while (i <= num / 2)
            for (i = 3; i <= num / 2; i++) {
                if (num % i == 0) {
                    b = true;
                    break;
                }
            }
            if (b)
                System.out.println("is a prime number");
            else
                System.out.println("is not a prime number");
        }
    }
