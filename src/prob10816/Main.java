package prob10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int n = sc.nextInt();
        Integer n = Integer.parseInt(br.readLine());

//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashMap<String, Integer> map = new HashMap<>();
        String[] arrN = new String[n];
        arrN = br.readLine().split(" ");


/*
        for (int i = 0; i < n; i++){
//            int num = sc.nextInt();
            int num = Integer.parseInt(arrN[i]);
            if (map.containsKey(num)){
                int val = map.get(num);
                map.put(num, val+=1);
            }
            else{
                map.put(num,1);
            }

        }
*/
        for(String s : arrN){
            if(map.containsKey(s)){
                int val = map.get(s);
                map.put(s, val+=1);
            }
            else{
                map.put(s, 1);
            }
        }
//        int m = sc.nextInt();
        Integer m = Integer.parseInt(br.readLine());

        String[] arrM = new String[n];
        arrN = br.readLine().split(" ");

//        ArrayList<Integer> listM = new ArrayList<>();
//        for (int i = 0; i < m; i++){
//            listM.add(sc.nextInt());
//        }

//        for(int i : listM){
        for(String s : arrN){
            if (map.get(s) == null)
                System.out.printf("0 ");
            else
            System.out.printf("%d ", map.get(s));
        }
    }
}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] arrN = new int[20000000];
//
//        for (int i = 0 ; i< n; i++){
//            arrN[sc.nextInt()+10000000]++;
//        }
//
//        int m = sc.nextInt();
//        int[] arrM = new int[m];
//        for(int j = 0; j < m; j++){
//            arrM[j] = sc.nextInt();
//        }
//
//        for(int i : arrM){
//            if (arrN[i+10000000] > 0)
//                System.out.printf("%d ",arrN[i+10000000]);
//            else
//                System.out.print("0 ");
//
//        }
//    }
//}