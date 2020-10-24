package com.company.checknumber;

import java.util.Scanner;

public class Program {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            String Num = a + "";

            int lengthNum = Num.length();

            String x, y;
            if (a % 2 != 0) x = "нечетное";
            else x = "четное";

            switch (lengthNum) {
                case (1):
                    y = "однозначное";
                    break;

                case (2):
                    y = "двузначное";
                    break;

                case (3):
                    y = "трехзначное";
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + lengthNum);
            }
            if (a >= 1 && a <= 999) System.out.println(x + " " + y + " число");
        }
    }
