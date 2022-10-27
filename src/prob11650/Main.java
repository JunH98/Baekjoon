package prob11650;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Pos[] arr = new Pos[n];

        for (int i = 0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = new Pos(x,y);
        }

        Arrays.sort(arr, new Comparator<Pos>() {
            @Override
            public int compare(Pos o1, Pos o2) {
                if (o1.getX() == o2.getX())
                    return o1.getY()-o2.getY();
                else
                    return o1.getX()-o2.getX();
            }
        });

        for (int i = 0; i<n; i++){
            System.out.println(arr[i].getX() + " " + arr[i].getY());
        }

    }

    public static class Pos{
        int x;
        int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getY() {
            return y;
        }

        public int getX() {
            return x;
        }

    }

}
