package prob2751;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();


        int n = Integer.parseInt(br.readLine());

        for (int i = 0 ; i< n; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        arr.sort(Comparator.naturalOrder());

        for (int i = 0 ; i < n; i++){
            sb.append(arr.get(i)+"\n");
        }
        System.out.println(sb);




    }
}
