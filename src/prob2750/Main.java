package prob2750;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0 ; i< n; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        arr.sort(Comparator.naturalOrder());
        for(int i = 0 ; i< n; i++){
            System.out.println(arr.get(i));
        }
    }
}
