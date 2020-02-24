package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Colors ");
        Scanner s = new Scanner(System.in);
        String color1 = s.nextLine();
        String color2 = s.nextLine();
        String color3 = s.nextLine();
        String color4 = s.nextLine();
        String color5 = s.nextLine();

        ArrayList<String> a = new ArrayList<>();
        a.add(color1);
        a.add(color2);
        a.add(color3);
        a.add(color4);
        a.add(color5);
        System.out.println();
        System.out.println("Ваши цвета: ");
        Iterator<String> iter = a.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("Напишите марки машин");
        Scanner s2 = new Scanner(System.in);
        String car1 = s2.nextLine();
        String car2 = s2.nextLine();
        String car3 = s2.nextLine();
        String car4 = s2.nextLine();
        String car5 = s2.nextLine();

        ArrayList<String> b = new ArrayList<>();
        b.add(car1);
        b.add(car2);
        b.add(car3);
        b.add(car4);
        b.add(car5);
        System.out.println();
        System.out.println("Ваши машины : ");
        Iterator<String> iter2 = b.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }
        System.out.println();
        System.out.println("Цвета и  машины : ");
        System.out.println();
        ArrayList<String> carColor
                = new ArrayList<>();
        carColor.addAll(a);
        carColor.add(1, car5);
        carColor.add(3, car4);
        carColor.add(5, car3);
        carColor.add(7, car2);
        carColor.add(9, car1);

        Iterator<String> iterT = carColor.iterator();
        while (iterT.hasNext()) {
            System.out.println(iterT.next());
        }
        System.out.println();
        System.out.println("Сортировка : ");
        System.out.println();
        Collections.sort(carColor, Comparator.comparingInt(String::length));
        iterT = carColor.iterator();
        while (iterT.hasNext()) {
            System.out.println(iterT.next());

        }
    }
}
