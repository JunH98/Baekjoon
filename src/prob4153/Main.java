package prob4153;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            int[] lengths = new int[3];
            for(int i = 0; i < 3; i++)
                lengths[i]= sc.nextInt();
            Arrays.sort(lengths);
            a = lengths[0];
            b = lengths[1];
            c = lengths[2];
            if (a == 0 && b == 0 && c == 0)
                break;
            else {
                if (a * a + b * b == c * c)
                    list.add("right");
                else
                    list.add("wrong");
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}