package prob2477;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Line> list = new ArrayList<>();

        int k = sc.nextInt();
        for (int i = 0; i< 6; i++){
            list.add(new Line(sc.nextInt(), sc.nextInt()));
        }

        int shape = 1;
        for (int i = 0; i< 6; i++)
            shape *= list.get(i).direction;

        if (shape == 72){
            while (list.get(0).direction != 4){
                Line temp = list.get(0);
                list.remove(0);
                list.add(temp);
            }
        }

        else if (shape == 144){
            while (list.get(0).direction != 1){
                Line temp = list.get(0);
                list.remove(0);
                list.add(temp);
            }
        }

        else if (shape == 192){
            while (list.get(0).direction != 3){
                Line temp = list.get(0);
                list.remove(0);
                list.add(temp);
            }
        }

        else if (shape == 96){
            while (list.get(0).direction != 2){
                Line temp = list.get(0);
                list.remove(0);
                list.add(temp);
            }
        }

        int field = list.get(0).length * list.get(1).length - (list.get(3).length * list.get(4).length);
        System.out.println(field*k);

    }

    public static class Line{
        int direction;
        int length;
        public Line(int direction, int length) {
            this.direction = direction;
            this.length = length;
        }
    }
}
