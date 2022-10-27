package prob25305;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0 ; i < n; i++){
            arrayList.add(sc.nextInt());
        }
        arrayList.sort(Comparator.reverseOrder());

        System.out.println(arrayList.get(k-1));

    }
}

