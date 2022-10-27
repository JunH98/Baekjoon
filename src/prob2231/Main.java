package prob2231;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=0;

        while(m < n && m+getSum(m) != n) {
            m++;
        }

        if (m==n)
            System.out.println(0);
        else {
            System.out.println(m);
        }
    }

    public static int getSum(Integer n){
        int result = 0;
        String s = n.toString();
        for (int i = 0; i< s.length(); i++){
            result+=s.charAt(i)-'0';
        }
        return result;
    }
}
