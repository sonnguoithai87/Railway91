package com.vti.frontend;

import com.vti.entity.Canbo;
import com.vti.entity.Congnhan;
import com.vti.entity.Kysu;

import java.util.Scanner;

/*
Mr.Son
 */
public class Program {
    public static void main(String[] args) {
        Program program = new Program();
        program.menu();
        Scanner scanner = new Scanner(System.in);
        Canbo[] canbos = new Canbo[10];
        Kysu[] kysus = new Kysu[10];
        Congnhan[] congnhans = new Congnhan[10];
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thêm mới cán bộ");
                    System.out.println("Chọn loại cán bộ cần thêm: 1: Kỹ su: 2 cong nhan 3 nhan vien");
                    int choiceLoaiCb = scanner.nextInt();
                    switch (choiceLoaiCb) {
                        case 1: //Them moi Ky sư
                            System.out.println("Nhập tên  ky sư");
                            String tenkysu = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Nhập tên đệm ky sư");
                            String tendem = scanner.nextLine();
                            Kysu cb = new Kysu(tendem, tenkysu);
                            for (int i = 0; i < 10; i++) {
                                if (kysus[i] == null) {
                                    kysus[i] = cb;
                                    break;
                                }
                            }

                        case 2: //them m ới cong nhan
                            System.out.println("Nhập tên Cong nhan");
                            String tencongnhan = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Nhập tên đệm Cong nhan");
                            String tendemcongnhan = scanner.nextLine();
                            Congnhan congnhan = new Congnhan(tencongnhan, tendemcongnhan);
                            for (int i = 0; i < 10; i++) {
                                if (congnhans[i] == null) {
                                    congnhans[i] = congnhan;
                                    break;
                                }
                            }
                        case 3: //them mới nhan vien
                        default:
                            System.out.println("Chức năng khong phù hợp");
                            break;
                    }

                    break;
                case 2:
                    for (int i = 0; i < canbos.length; i++) {
                        if (canbos[i] != null) {
                            System.out.println("Student la:" + canbos[i].getFirstName());
                            break;
                        }
                    }
                    break;
                case 3:

                    break;
                case 4: //Quay lai menu ;
                    program.menu();
                    break;
                default:
                    return;
            }
        }

    }

    public void menu() {
        System.out.println("=====QUẢN LÝ CÁN BỘ====");
        System.out.println("1: Thêm mới cán bộ");
        System.out.println("2: Tìm kiếm theo họ tên");
        System.out.println("3: Hiển thị thông tin danh sách cán bộ");
        System.out.println("4: Nhập tên cán bộ và xóa cán bộ đó");
        System.out.println("5: Thoát khỏi chương trình");
        System.out.println("Chọn từ 1 - 5 tương ứng với chức năng");
    }
}
