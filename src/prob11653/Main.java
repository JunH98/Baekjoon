package prob11653;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n = primeFactorization(n);
        if (isPrime(n) == true)
            System.out.println(n);

    }

    public static int primeFactorization(int n){
        if (isPrime(n))
            return n;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                n = n/i;
                System.out.println(i);
                i--;
            }
        }
        return primeFactorization(n);
    }
    public static boolean isPrime(int n){
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
