package com.example.demo;

public class NotebookDetail extends Notebook{
    private  int id;
    private String brand;
    private String title;
    private  String type;
    private String cpu;
    private  String ram;
    private String display;
    private  String price;

    @Override
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getDisplay() {
        return display;
    }
    public void setDisplay(String display) {
        this.display = display;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }



    public NotebookDetail(){}

    public NotebookDetail(int id, String brand, String title, String type, String cpu, String ram, String display,String price){
        this.setId(id);
        this.setBrand(brand);
        this.setTitle(title);
        this.setType(type);
        this.setCpu(cpu);
        this.setRam(ram);
        this.setDisplay(display);
        this.setPrice(price);
    }

    @Override
    public String toString(){
        return "NotebookDeail{" +
                "id=" + id +
                ", title=" + title +
                '}';
    }
}