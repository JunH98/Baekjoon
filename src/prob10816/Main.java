package prob10816;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++){        //map 읽고 넣기
            int num = sc.nextInt();
            if (map.get(num) == null){
                map.put(num, 1);
            }
            else{
                int val = map.get(num);
                map.put(num, val+=1);
            }
        }

        int m = sc.nextInt();
        int[] arrM = new int[m];
        for (int i = 0; i < m; i++){
            arrM[i] = sc.nextInt();
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i : arrM){
            if (map.get(i) == null)
                stringBuilder.append(0 + " ");
            else
                stringBuilder.append(map.get(i) + " ");
        }

        System.out.println(stringBuilder);

    }

}