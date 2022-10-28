package prob4153;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
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