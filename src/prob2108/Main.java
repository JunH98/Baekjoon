package prob2108;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);      //오름차순 정렬

        System.out.println(average(arr));
        System.out.println(arr[arr.length / 2]);
        System.out.println(most(arr));
        System.out.println(arr[arr.length - 1] - arr[0]);
    }
    public static int average(int [] arr){
        double sum = Arrays.stream(arr).sum();
        double avr = sum / (double)arr.length;

        return (int)Math.round(avr);
    }


    public static int most(int[] arr) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();        //카운팅정렬 겸용 HashMap
        ArrayList<Integer> mostUsedKeys = new ArrayList<>();                //최빈값들 ArrayList

        //  HashMap에 Key : 값, Value : 빈도로 put
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // HashMap에서 빈도가 가장 큰 값구하기(value가 가장 큰 map의 Value구하기)
        Integer maxValue = Collections.max(map.values());

        //  빈도가 가장 큰 수들(중복되는 최빈값들)을 찾아서 mostUsedKeys에 추가
        for (int key : map.keySet()) {
            if (map.get(key).equals(maxValue))
                mostUsedKeys.add(key);
        }

        //mostUsedKeys 오름차순 정렬
        mostUsedKeys.sort(Comparator.naturalOrder());

        if (mostUsedKeys.size() == 1)
            return mostUsedKeys.get(0);

            //최빈값이 여러개 라면 mostUsedKeys에서 두번째로 작은 값 return
        else
            return mostUsedKeys.get(1);
    }
}
