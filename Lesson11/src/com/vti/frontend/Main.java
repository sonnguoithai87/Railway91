package com.vti.frontend;

import com.vti.backend.PresentationLayer.AccountController;
import com.vti.utils.ScannerUtils;

import java.sql.SQLException;

/*
Mr.Son
 */
public class Main {
    public static boolean isLogin = false;

    public static void main(String[] args) throws SQLException {
        menu();
        AccountController accountController = new AccountController();
        while(true) {
            int choiceMenu = ScannerUtils.inputInt();
            switch (choiceMenu) {
                case 1:
                    if(isLogin) {
                        System.out.println("Bạn đã đăng nhập. Không cần phải đăng nhập lại");
                    }
                    //Đăng nhập
                    //Phai nhạp username và pass: đây chính là input
                    String userName = ScannerUtils.inputName("Moi ban nhap username");
                    String password = ScannerUtils.inputName("Moi  ban nhap password");
                    boolean login = accountController.login(userName, password);
                    if(login) {
                        menuDangxuat();
                    } else {
                        menu();
                    }
                    break;
                case 2:
                    if(isLogin) {
                        //Hien thi danh sach account;
                    }else {
                        System.out.println("Bạn phải thực hiện đăng nhập trước khi xem danh sách");
                        menu();
                    }
                    break;

                case 3:
                    //Đăng xuất
                    break;
                default:
                    System.out.println("MỜi bạn chọn đúng  các chức năng tương ứng 1, 2 ,3 ");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("**************Quản ly sinh viên**************");
        System.out.println("1: Đăng nhập");
        System.out.println("Mời bạn chọn 1 tương ứng với từng chức năng");
    }

    public static void menuDangxuat() {
        System.out.println("**************Quản ly sinh viên**************");
        //System.out.println("1: Đăng xuất");
        System.out.println("2: Hiển thị danh sách account");
        System.out.println("3: Đăng xuất");
        System.out.println("Mời bạn chọn 2, 3 tương ứng với từng chức năng");
    }
}