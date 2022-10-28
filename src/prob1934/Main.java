package prob1934;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i< n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a*b/gcd(a,b);
        }

        for (int i : arr){
            System.out.println(i);
        }
    }
    public static int gcd(int num1, int num2){
        if (num2 == 0)
            return num1;
        else
            return gcd(num2, num1 % num2);
    }
}
