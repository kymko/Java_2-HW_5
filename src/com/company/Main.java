package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 words");
        String str0 = scanner.nextLine();
        ArrayList<String> list1 = new ArrayList<>(5);
        list1.add(str0);
        info(list1);
        System.out.println("Enter 1 word");
        String str1 = scanner.nextLine();
        list1.add(str1);
        info(list1);
        System.out.println("Enter 1 word");
        String str2 = scanner.nextLine();
        list1.add(str2);
        info(list1);
        System.out.println("Enter 1 word");
        String str3 = scanner.nextLine();
        list1.add(str3);
        info(list1);
        System.out.println("Enter 1 word");
        String str4 = scanner.nextLine();
        list1.add(str4);
        info(list1);


        ArrayList<String> list2 = new ArrayList<>(5);
        System.out.println("Enter 5 another words");
        String str5 = scanner.nextLine();
        list2.add(str5);
        info(list2);
        System.out.println("Enter 1 another word");
        String str6 = scanner.nextLine();
        list2.add(str6);
        info(list2);
        System.out.println("Enter 1 another word");
        String str7 = scanner.nextLine();
        list2.add(str7);
        info(list2);
        System.out.println("Enter 1 another word");
        String str8 = scanner.nextLine();
        list2.add(str8);
        info(list2);
        System.out.println("Enter 1 another word");
        String str9 = scanner.nextLine();
        list2.add(str9);
        info(list2);


        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Collections.singleton(str0 + " - " + str9));
        list3.addAll(Collections.singleton(str1 + " - " + str8));
        list3.addAll(Collections.singleton(str2 + " - " + str7));
        list3.addAll(Collections.singleton(str3 + " - " + str6));
        list3.addAll(Collections.singleton(str4 + " - " + str5));


        info(list3);


    }

    public static void info(ArrayList<?> arrayList) {
        System.out.println("----------------------------------");
        Iterator<?> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
