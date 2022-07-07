package com.company;

public class Popugai {
    private String name;
    private String color;
    private String unu;
    void setName(String p){
        name = p;
        if (p.isEmpty()){
            System.err.println("Popugai aty bosh bolbosh kerek!");
        }
    }
    void setColor(String p){
        color = p;
        if (p.isEmpty()){
            System.err.println("Popugai onu bosh bolbosh kererk!");
        }
    }
    void setUnu(String p){
        unu = p;
    }
    String getName(){
        return name;
    }
    String getColor(){
        return color;
    }
    String getUnu(){
        return unu;
    }
}

