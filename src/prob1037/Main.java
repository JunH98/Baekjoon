package prob1037;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> dividers = new ArrayList<>();

        for (int i = 0; i < n; i++){
            dividers.add(sc.nextInt());
        }

        dividers.sort(Comparator.naturalOrder());

        System.out.println(dividers.get(0) * dividers.get(n-1));
    }
}
