package prob10814;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] person = new Person[n];

        for (int i = 0 ; i< n; i++){
            person[i] = new Person(sc.nextInt(), i, sc.nextLine());
        }

        Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.age == o2.age)
                    return o1.order - o2.order;

                return o1.age - o2.age;
            }
        });

        for (int i = 0; i< n; i++){
            person[i].printInfo();
        }


    }
    public static class Person{
        int age;
        int order;
        String name;

        public Person(int age, int order, String name) {
            this.age = age;
            this.order = order;
            this.name = name;
        }

        public void printInfo(){
            System.out.println(age  + name);
        }
    }
}
