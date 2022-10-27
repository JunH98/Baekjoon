package prob2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = -1;
        int kg5 = 0;
        int kg3 = 0;

        for (int i = 0 ; i <= n ; i+=5){
            if ((n-i) % 3 == 0) {
                kg5 = i / 5;
                kg3 = (n-i)/3;
            }
        }
        if (kg5>0 || kg3>0)
            result = kg5+kg3;

        System.out.println(result);
    }
}
