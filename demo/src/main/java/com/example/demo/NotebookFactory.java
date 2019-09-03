package com.example.demo;

public class NotebookFactory {
    public static NotebookDetail makeNotebook (int id,String brand,String title,String type,String cpu,String ram,String display,String price){
        return  new NotebookDetail(id, brand,title,type,cpu,ram,display,price);
    }
}
