package prob11478;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        String[] arrS = new String[s.length()];
        arrS = s.split("");

        for (int i = 0; i < s.length(); i++){
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++){
                sb.append(arrS[j]);
                map.put(sb.toString(), true);
            }
        }

        System.out.println(map.size());

    }
}
