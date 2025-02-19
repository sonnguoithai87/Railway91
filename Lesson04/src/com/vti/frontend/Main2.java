package com.vti.frontend;

import com.vti.utils.ScannerUtils;

import java.util.Scanner;

/*
Mr.Son
 */
public class Main2 {
 public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("MOi ban nhap tuoi:");
//    int tuoi = scanner.nextInt();
//    System.out.println("Tuoi cua ban la:"+ tuoi);

    int tuoicuaSon = ScannerUtils.inputId("Moi ban nhap tuoi");
    System.out.println("TUoi cua sown la:"+tuoicuaSon);

    String fullNamne = ScannerUtils.inputName("Moi ban nhap ten");
    System.out.println("Ten cua ban:"+fullNamne);


 }
}
