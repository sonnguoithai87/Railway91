package com.vti.frontend;

import com.vti.entity.Account;
import com.vti.entity.Department;

/*
Mr.Son
 */
public class Main {

    public static void main(String[] args) {
        String text = "Nguyễn Văn Sơn";
       //Chuyen đổi chu thường thanh ch hoa
        String textUper = text.toUpperCase();
        System.out.println(textUper);
        //Chuyen doi chu Hoa thanh chu THuong
        String textLower = textUper.toLowerCase();
        System.out.println(textLower);
        //Dem so chu trong text
        int length = text.length();
        System.out.println("So ky tu cua chuoi Text:"+length);

        String textError = " Nguyễn Văn Sơn ";
        String textErrorTrim = textError.trim();
        System.out.println("textError:"+textError);
        System.out.println("textErrorTrim:"+textErrorTrim);
        String   arrayName[] = {"Nguyen Van Son","Le van tuan","Nguyen Van A","Hoang Van B"};
        for(int i =0; i< arrayName.length; i++) {
            if(arrayName[i].startsWith("Nguyen")) {
                System.out.println(arrayName[i]);
            }
        }

        String firstName = "Nguyen";
        String lastName = "Van Son";
        String fullName = firstName.concat(" ").concat(lastName);

        System.out.println("Ten day du:"+fullName);

    }
}