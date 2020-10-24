package com.company.arefmetics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
       // String name = console.nextLine();
        int choice = console.nextInt();// считавыем число и записывает и записываем в choice
        switch (choice) {
            case 1:
                System.out.println("арифемитика");
                System.out.println("Введите первое число прогрессии");
                int a = console.nextInt();
                System.out.println("Введите d-шаг");
                int d = console.nextInt();
                System.out.println("Введите n-номер члена прогрессии");
                int n = console.nextInt();
                int result = a + d*(n - 1);
                System.out.println(result);

                //Scanner a = new Scanner(System.in);
                break;
            case 2:
                System.out.println("Геометрическая");
                System.out.println("Введите первое число прогрессии");
                int b = console.nextInt();
                System.out.println("Введите q-шаг");
                int q = console.nextInt();
                System.out.println("Введите n-номер члена прогрессии");
                int f = console.nextInt();
                double result2 = b * Math.pow(q, f-1);
                System.out.println(result2);
                break;
        }
    }
}

