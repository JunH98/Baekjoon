package prob5086;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pos> pos = new ArrayList<Pos>();

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a==0 && b==0)
                break;
            else{
                pos.add(new Pos(a,b));
            }
        }

        for (Pos p: pos){
            System.out.println(p.relate);
        }

    }

    public static class Pos {
        int a, b;
        String relate;

        public Pos(int a, int b) {
            this.a = a;
            this.b = b;
            if (a < b && b % a == 0)
                this.relate = "factor";
            else if (a >= b && a % b == 0)
                this.relate = "multiple";
            else
                this.relate = "neither";
        }
    }

}
