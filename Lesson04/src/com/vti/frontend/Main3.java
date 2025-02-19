package com.vti.frontend;

import com.vti.entity.Student;

import java.util.Scanner;

/*
Mr.Son
 */
public class Main3
{
    public static void main(String[] args) {
        Main3 main = new Main3();
        main.menu();
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];
        while (true) {
            System.out.print("Moi ban chon chuc nang:");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1: //viet ham them moi sinh vien
                    System.out.println("Moi ban nhap id");
                    int id = scanner.nextInt();
                    //1 so may bi loi thi de nextLine o day
                    scanner.nextLine();
                    System.out.println("Moi ban nhap Ten");
                    String name = scanner.nextLine();
                    Student student = new Student();
                    student.setId(id);
                    student.setStudentName(name);
                    for (int i = 0; i < students.length; i++) {
                        Student student1 = students[i];
                        if(student1==null) {
                            students[i] = student;
                            System.out.println("Them moi sinh vien thanh cong");
                            break;
                        }
                    }
                    break;
                case 2: //viet ham hien thi danh sach sinh vien
                    for (int i = 0; i < students.length; i++) {
                        Student student1 = students[i];
                        if(student1 != null) {
                            System.out.println("Student la:"+student1.getStudentName());
                            break;
                        }
                    }
                    break;
                case 3: //Viet ham tim kiem sinh vientheo ten
                    scanner.nextLine();
                    System.out.println("Moi ban nhap Ten");
                    String ten = scanner.nextLine();
                    boolean flag = true;
                    for (int i = 0; i < students.length; i++) {
                        Student student1 = students[i];
                        if(student1 != null && student1.getStudentName().equalsIgnoreCase(ten)) {
                           System.out.println("Student la:"+student1.getStudentName());
                           flag = false;
                        }
                    }
                    if(flag) {
                        System.out.println("SInh vien khong ton tai");
                    }
                    break;
                case 4: //Quay lai menu ;
                    main.menu();
                    break;
                    default: return;
            }
        }
    }

    public void menu(){
        System.out.println("======== Chuong trinh quan ly sinh vien=========");
        System.out.println("***Chọn chức năng tương ứng: 1, 2, 3 ,4, 5***");
        System.out.println("1: Thêm mới sinh viên");
        System.out.println("2: Hiển thị danh sách tất cả các sinh viên");
        System.out.println("3: Tìm kiếm sinh viên theo tên");
        System.out.println("4: Quay lai menu");
        System.out.println("5: Thoát");
    }
}
