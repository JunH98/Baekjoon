package prob1417;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main1417(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        while (num > 0){
            arr.add(num%10);
            num = num/10;
        }

        arr.sort(Comparator.reverseOrder());

        for (int i:arr){
            System.out.printf("%d",i);
        }

    }
}
