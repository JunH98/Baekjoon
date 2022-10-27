package prob14425;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        int n = sc.nextInt();
        ArrayList<String> listN = new ArrayList<>();
        int m = sc.nextInt();
        ArrayList<String> listM = new ArrayList<>();

        for (int i = 0; i < n; i++){
            listN.add(sc.next());
        }

        for (int i = 0; i < m; i++){
            listM.add(sc.next());
        }

        for (String s : listM){
            if(listN.contains(s))
                cnt++;
        }

        System.out.println(cnt);

    }
}
