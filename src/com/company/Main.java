package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arrayList1 = new ArrayList<>();
        enterNumber(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        enterNumber(arrayList2);

        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.addAll(Collections.singleton(arrayList1.get(0) + " - " + arrayList2.get(4)));
        arrayList3.addAll(Collections.singleton(arrayList1.get(1) + " - " + arrayList2.get(3)));
        arrayList3.addAll(Collections.singleton(arrayList1.get(2) + " - " + arrayList2.get(2)));
        arrayList3.addAll(Collections.singleton(arrayList1.get(3) + " - " + arrayList2.get(1)));
        arrayList3.addAll(Collections.singleton(arrayList1.get(4) + " - " + arrayList2.get(0)));
        System.out.println(arrayList3);

    }

    public static void enterNumber(ArrayList list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 words");
        String str0 = scanner.nextLine();
        list.add(str0);
        info(list);
        System.out.println("Enter 1 word");
        String str1 = scanner.nextLine();
        list.add(str1);
        info(list);
        System.out.println("Enter 1 word");
        String str2 = scanner.nextLine();
        list.add(str2);
        info(list);
        System.out.println("Enter 1 word");
        String str3 = scanner.nextLine();
        list.add(str3);
        info(list);
        System.out.println("Enter 1 word");
        String str4 = scanner.nextLine();
        list.add(str4);
        info(list);

    }

    public static void info(ArrayList<?> arrayList) {
        System.out.println("----------------------------------");
        Iterator<?> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
