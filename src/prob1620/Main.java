package prob1620;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer, String> mapN = new HashMap<>();
        HashMap<String, Integer> mapNReversed = new HashMap<>();
        int q = sc.nextInt();
        ArrayList<String> listQ = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            mapN.put(i, name);
            mapNReversed.put(name, i);
        }


        for (int i = 0; i < q; i++) {
            listQ.add(sc.next());
        }

        for (String s : listQ) {
            if (s.charAt(0) < 'A') {  // 숫자 case
                System.out.println(mapN.get(Integer.parseInt(s) - 1));
            } else System.out.println(mapNReversed.get(s)+1);
        }

    }
}
