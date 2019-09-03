

package com.example.demo;

public abstract class Notebook {

    public abstract int getId();
    public abstract String getBrand();
    public abstract String getTitle();
    public abstract String getType();
    public abstract String getCpu();
    public abstract String getRam();
    public abstract String getDisplay();
    public abstract String getPrice();


    @Override
    public String toString(){
        return "Id = " + String.valueOf(this.getId()) + ", Title = " + String.valueOf(this.getTitle()) ;
    }
}