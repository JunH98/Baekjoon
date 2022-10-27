package prob3009;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> mapX = new HashMap<>();
        int[] arrX = new int[3];
        HashMap<Integer, Integer> mapY = new HashMap<>();
        int[] arrY = new int[3];

        for (int i = 0 ; i < 3; i++){
            Integer x = sc.nextInt();
            arrX[i] = x;
            mapX.put(x, mapX.get(x) == null ? 1 : mapX.get(x)+1);

            Integer y = sc.nextInt();
            arrY[i] = y;
            mapY.put(y, mapY.get(y) == null ? 1 : mapY.get(y)+1);
        }

        int a = 0;
        int b = 0;

        for (int i : arrX){
            if (mapX.get(i).equals(1))
                a = i;
        }

        for (int i : arrY){
            if (mapY.get(i).equals(1))
                b = i;
        }

        System.out.printf("%d %d", a,b);

    }
}
