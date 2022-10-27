package prob2798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        int[] cards = new int[n];
        int gap = m;

        for (int i = 0; i<n; i++){
            cards[i] = sc.nextInt();
        }

        for (int i = 0; i< n; i++){
            for (int j = 0; j<n; j++) {
                if (j == i)
                    j++;
                else {
                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j)
                            k++;
                        else {
                            int sum = cards[i] + cards[j] + cards[k];

                            if (sum <= m && m-sum < gap)
                                gap = m-sum;
                        }

                    }
                }
            }
        }
        System.out.println(m-gap);
    }
}
