package prob1004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] result = new int[t];
        for (int i = 0; i< t; i++) {
            int departureX = sc.nextInt();
            int departureY = sc.nextInt();
            int arrivalX = sc.nextInt();
            int arrivalY = sc.nextInt();
            int cnt = 0;

            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int pass = 0;
                int planetX = sc.nextInt();
                int planetY = sc.nextInt();
                int planetR = sc.nextInt();

                double distance = getDistance(departureX, departureY, planetX, planetY);
                if (distance < planetR)
                    pass+=1;
                distance = getDistance(arrivalX, arrivalY, planetX, planetY);
                if (distance < planetR)
                    pass+=1;

                if (pass%2 == 1)
                    cnt+=1;
            }
            result[i] = cnt;
        }

        for (int i : result)
            System.out.println(i);

    }

    static double getDistance(int x1, int y1, int x2, int y2){
        int distanceX, distanceY;
        if (x1 * x2 >= 0){
            distanceX = Math.abs(Math.abs(x1) - Math.abs(x2));
        }
        else {
            distanceX = Math.abs(x1 - x2);
        }
        if (y1 * y2 >= 0) {
            distanceY = Math.abs(Math.abs(y1) - Math.abs(y2));
        }
        else {
            distanceY = Math.abs(y1 - y2);
        }

        return Math.sqrt(Math.pow(distanceX,2) + Math.pow(distanceY,2));
    }

}
