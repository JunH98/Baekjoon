package prob1764;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<String, Boolean> map = new HashMap<>();
        int m = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n ;i++){
            map.put(sc.next(), true);
        }

        for (int i = 0; i < m; i++){
            list.add(sc.next());
        }

        ArrayList<String> strangerList = new ArrayList<>();
        for (String s : list){
            if (map.get(s) != null)
                strangerList.add(s);
        }
        strangerList.sort(Comparator.naturalOrder());

        System.out.println(strangerList.size());
        for (String s : strangerList){
            System.out.println(s);
        }
    }
}

