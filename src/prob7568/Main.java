package prob7568;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Bigman[] arr = new Bigman[n];

        for (int i = 0; i < n; i++){
            arr[i] = new Bigman(sc.nextInt(), sc.nextInt());
        }

        for (int i = 0; i< n; i++){
            for (int j = 0; j<n; j++){
                if (i!=j){
                    if (arr[i].h > arr[j].h && arr[i].w > arr[j].w){
                        arr[j].rank++;
                    }
                }
            }
        }

        for (Bigman i : arr){
            System.out.printf("%d ", i.rank);
        }



    }
    public static class Bigman{
        int h;
        int w;
        int rank=1;

        public Bigman(int w, int h) {
            this.h = h;
            this.w = w;
        }

        public int getH() {
            return h;
        }

        public int getW() {
            return w;
        }
    }
}
