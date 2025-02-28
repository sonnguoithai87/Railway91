package com.vti.frontend;

import com.vti.entity.Student;

import java.util.Random;
import java.util.Scanner;

/*
Mr.Son
 */
public class Main {
    public static void main(String[] args) {
        try {
            int giatritrungbinh = getAvg();
            System.out.println("GIá trị trung bình:"+giatritrungbinh);
        } catch (ArithmeticException e) {
            System.out.println("Có lỗi xay ra trong qua trình tính toán");

        }catch (Exception ex)  {
            System.out.println("Lỗi khong xác dinh");
        }

        try {
            int tuoi = getAge();
            if(tuoi < 0 ) {
             System.out.println("tuoi khong the âm");
            }else {

                System.out.println("Tuoi cua bạn là"+tuoi);
            }
        } catch (Exception e) {
            System.out.println("Ký tự bạn nhập không phải sô");

        }


    }

    public static int getAvg() throws ArithmeticException, Exception {
        Random rd = new Random();
        try {
            int[] ages = {1, 2, 3, 4};
            int avg = ages[6] /  rd.nextInt(2);
            System.out.println("Vi tri thu 3:" + avg);
            return avg;
        } catch ( ArithmeticException e) {
            //System.out.println("Loi chi cho 0");
            throw new ArithmeticException("Lỗi chia cho 0");
        } catch (Exception ex) {
            throw new Exception("Loi kong xac dinh");

        }
    }

    public static int getAge() throws Exception {

        Scanner sc = new Scanner(System.in);
        try {

             int age = sc.nextInt();
             return age;
        }catch (Exception ex) {
            throw new Exception("Inut khong dung. Input chi la so thoi");
        }
    }
}