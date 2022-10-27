package prob1085;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,w,h;

        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();

        System.out.println(Math.min(getDistance(x, w), getDistance(y, h)));
    }

    public static int getDistance(int pos, int max){
        if (pos > max/2)
            return max-pos;
        else
            return pos;
    }

}
