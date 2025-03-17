package com.vti.frontend;

import com.vti.backend.PresentationLayer.AccountController;
import com.vti.entity.Account;
import com.vti.utils.ScannerUtils;

import java.sql.SQLException;
import java.util.List;

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
                    }else {
                        //Đăng nhập
                        //Phai nhạp username và pass: đây chính là input
                        String userName = ScannerUtils.inputName("Moi ban nhap username");
                        String password = ScannerUtils.inputName("Moi  ban nhap password");
                        boolean login = accountController.login(userName, password);
                        if (login) {
                            menuDangxuat();
                        } else {
                            menu();
                        }
                    }
                    break;
                case 2:
                    if(isLogin) {
                        //Hien thi danh sach account;
                        List<Account> listAccount = accountController.getListAccount();
                        if(listAccount.size() > 0) {
                            for (Account account : listAccount) {
                                System.out.println(account);
                            }
                        }else {
                            System.out.println("Khong co danh sach Sinh vien");

                        }
                    }else {
                        System.out.println("Bạn phải thực hiện đăng nhập trước khi xem danh sách");
                        menu();
                    }
                    break;

                case 3:
                    //Đăng xuất
                    break;
                case 4: //Them moi acc
                    if(!isLogin) {
                        System.out.println("Bạn cần phải đăngnhập để sử dụng chức năng nay");

                    }else {
                        //Đăng nhập
                        //Phai nhạp username và pass: đây chính là input
                        String usName = ScannerUtils.inputName("Moi ban nhap username");
                        String pas = ScannerUtils.inputName("Moi  ban nhap password");
                        int departmentId = ScannerUtils.inputId("Mời bạn nhập department_id");
                        boolean flag = accountController.insertAccount(usName, pas, departmentId);
                        if(flag) {
                            System.out.println("Thêm mới account thành cong");
                        } else {
                            System.out.println("Thêm mới account thất bại");
                        }
                    }
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
        System.out.println("4: Thêm mới account");
        System.out.println("Mời bạn chọn 2, 3 , 4 tương ứng với từng chức năng");
    }
}