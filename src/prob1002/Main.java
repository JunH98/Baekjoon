package prob1002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[n];

        for(int i = 0; i< n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            if (r2 < r1){
                int temp = x1;
                x1 = x2;
                x2 = temp;

                temp = y1;
                y1 = y2;
                y2 = temp;

                temp = r1;
                r1 = r2;
                r2 = temp;
            }

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

            double distance = Math.sqrt(Math.pow(distanceX,2) + Math.pow(distanceY,2));


            if (x1==x2 && y1 == y2 && r1== r2)
                result[i] = -1;
            else if(distance > r1 + r2 || distance < r2-r1)
                result[i] = 0;
            else if(distance == r1+r2 || distance == r2-r1)
                result[i] = 1;
            else
                result[i] = 2;

        }
        for (int i : result)
            System.out.println(i);
    }
}

