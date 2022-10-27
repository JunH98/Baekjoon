package prob4948;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int cnt = 0;
            for (int i = n+1 ; i <= 2*n; i++){
                if(isPrime(i))
                    cnt++;
            }

            System.out.println(cnt);
        }


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
