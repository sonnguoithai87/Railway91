package com.vti.entity;

import java.util.Scanner;

/*
Mr.Son
 */
public class News implements INews {
    private int id;
    private int title;
    private String publishDate;
    private String author;
    private String content;
    private float AverageRate;
    public int group;

    public News(int id) {
        this.id  = id;
       System.out.println();

    }

    @Override
    public void disPlay() {
        //Viet lai body
    }


    //overload
    public void disPlay(IStudy iStudy) {
//         if(iStudy instanceof  Teacher) {
//
//             Teacher tc =  (Teacher) iStudy;
//              //
//         }
//
//        if(iStudy instanceof  Student) {
//
//            Student student =  (Student) iStudy;
//            //
//        }
    }



    @Override
    public float calculate() {
        int[] rates = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap rate 1");
        rates[0]  = scanner.nextInt();
        System.out.println("Moi ban nhap rate 2");
        rates[1]  = scanner.nextInt();
        System.out.println("Moi ban nhap rate 3");
        rates[2]  = scanner.nextInt();
        this.AverageRate = (rates[0] + rates[1] + rates[2])/rates.length;
        return this.AverageRate;
    }

    public int getId() {
        return id;
    }

    public int getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
