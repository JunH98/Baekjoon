package prob18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int n = Integer.parseInt(bf.readLine()); //Int
        String s = bf.readLine();

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> zippedArr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s);

        for(int i = 0 ; i< n; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> sortedList = new ArrayList<>();
        for (int i : arr) {
            if (sortedList.contains(i) == false)
            sortedList.add(i);
        }

//        System.out.println(sortedList.toString());

        sortedList.sort(Comparator.naturalOrder());

        for(int i = 0 ; i< n; i++){
            zippedArr.add(sortedList.indexOf(arr.get(i)));
        }

        for(int i : zippedArr)
            System.out.printf("%d ",i);
    }
}
