package com.vti.frontend;

import com.vti.utils.InvalidAgeException;

import java.util.Scanner;

/*
Mr.Son
 */
public class Main03 {

    public static void main(String[] args) {
        try {
            getInt();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("Có lỗi xay ra");
        }


    }
  public static int getInt() throws InvalidAgeException {
     Scanner sc = new Scanner(System.in);
     int input = sc.nextInt();
     if(input < 10) {
         throw new InvalidAgeException("Giá trị tuổi phải lớn hơn 10");
     }else {
         return input;
     }
  }

}
