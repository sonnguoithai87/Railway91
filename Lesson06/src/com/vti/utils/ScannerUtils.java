package com.vti.utils;

import java.util.Scanner;

/*
Mr.Son
 */
public class ScannerUtils {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int age = inputInt("Giá trị tuổi phải là số. Mời bạn nhập số cho đúng!");
        System.out.println("Tuôi của bạn là:" + age);

        int sysolop = inputInt("Sĩ số lớp phải là số và không được âm");
        System.out.println("Sỹ số lớp là:" + sysolop);
    }

    public static int inputInt(String errorMessage) {
        while (true) {
            System.out.print("Mời bạn nhập giá trị tương ứng");
            try {
                int output = scanner.nextInt();
                return output;
            } catch (Exception e) {
                System.out.println(errorMessage);
                scanner.nextLine();
            }
        }
    }

    public static int inputIntAge() {
        while (true) {
            System.out.print("Mời bạn nhập giá trị tương ứng");
            try {
                int output = scanner.nextInt();
                return output;
            } catch (Exception e) {
                System.out.println("TUối phải là số");
                scanner.nextLine();
            }
        }
    }

    public static int inputIntId() {
        while (true) {
            System.out.print("Mời bạn nhập giá trị tương ứng");
            try {
                int output = scanner.nextInt();
                return output;
            } catch (Exception e) {
                System.out.println("Id phải là số");
                scanner.nextLine();
            }
        }
    }
}
