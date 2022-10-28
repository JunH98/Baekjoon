package prob11050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(factorial(n) / (factorial(k) * factorial(n-k)));
    }

    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
