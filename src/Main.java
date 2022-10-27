import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[] arrN = new boolean[20000000];

        for (int i = 0 ; i< n; i++){
            arrN[sc.nextInt()+10000000]=true;
        }

        int m = sc.nextInt();
        int[] arrM = new int[m];
        for(int j = 0; j < m; j++){
            arrM[j] = sc.nextInt();
        }

        for(int i : arrM){
            if (arrN[i+10000000] == true)
                System.out.print("1 ");
            else
                System.out.print("0 ");

        }
    }
}
