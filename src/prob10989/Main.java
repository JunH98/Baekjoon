package prob10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[10001];

        for (int i = 0 ; i < n; i++){
            arr[Integer.parseInt(bufferedReader.readLine())] += 1;
        }

        for(int i = 0; i < 10001; i++){
            for (int j = 0; j < arr[i];j++){
//                System.out.println(i);
                stringBuilder.append(i + "\n");
            }
        }

        System.out.println(stringBuilder);
    }
}
