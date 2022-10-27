package prob1181;

import java.util.*;

public class Main {
    public static void main1181(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0 ; i < n; i++){
            String idx = scanner.next();
            arrayList.add(idx);
        }


        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length())
                    return s1.compareTo(s2);
                else
                    return s1.length()-s2.length();
            }
        });

        System.out.println(arrayList.get(0));
        for (int i = 1 ; i < n; i++){
            if (!arrayList.get(i).equals(arrayList.get(i-1))) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}