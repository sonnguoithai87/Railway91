package com.vti.frontend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
Mr.Son
 */
public class Main02 {
    public static void main(String[] args)  {
        try {
            System.out.println("Lam viec voi file");
            File file = new File("D:/Test.txt");
            FileOutputStream fos = new FileOutputStream(file);

        } catch(FileNotFoundException ex) {
            System.out.println("File not found");
        } catch(Exception e) {


        }finally {
            System.out.println("Ket thuc chuong trinh");
        }
    }
}
