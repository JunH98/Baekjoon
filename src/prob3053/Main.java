package prob3053;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();
        double euclidean = Math.round(n*n*Math.PI*1000000)/1000000.0;
        double taxi = (n*n*2*1000000)/1000000.0;
        String taxi_s = String.format("%f",taxi);

        System.out.println(euclidean);
        System.out.println(taxi_s);
    }

}
