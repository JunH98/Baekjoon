package prob3036;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ;i < n-1; i++){
            list.add(sc.nextInt());
        }

        for (int i : list){
            out(m,i);
        }


    }

    public static void out (int m, int k){
        if (m%k == 0){
            System.out.println(m/k + "/1");
        }
        else if (m%k ==0 && m < k){
            System.out.println("1/" + k/m);
        }
        else{
            System.out.println(m/gcd(m,k) + "/" +k/gcd(m,k));
        }
    }
    public static int gcd(int num1, int num2){
        if (num2 == 0)
            return num1;
        else
            return gcd(num2, num1 % num2);
    }
}
