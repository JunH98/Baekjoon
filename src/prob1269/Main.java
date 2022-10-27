package prob1269;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        HashMap<Integer, Boolean> mapA = new HashMap<>();
        int b = sc.nextInt();
        ArrayList<Integer> listB = new ArrayList<>();

        for (int i = 0; i< a; i++){
            mapA.put(sc.nextInt(), true);
        }

        for (int i = 0; i< b; i++){
            listB.add(sc.nextInt());
        }

        int cnt = 0;
        for (Integer i : listB){
            if(Optional.ofNullable(mapA.get(i)).isPresent())
                cnt++;
        }

        System.out.println(a+b-cnt*2);

    }
}
