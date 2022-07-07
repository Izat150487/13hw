package com.company;

public class Myshyk {
    private String name;
    private int age;
    private String color;

    void setName(String a){
        name = a;
        if (a.isEmpty()){
            System.err.println("Myshyk aty bosh bolbosh kerek!");
        }
    }
    void setAge(int a){
        age = a;
        if (a < 0){
            System.err.println(name + " Jashy ters bolboshu kerek!");
        }else {
            age = a;
        }
    }
    void setColor(String a){
        color = a;
        if (a.isEmpty()){
            System.err.println("Color bosh bolbosh kerek!");
        }
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getColor(){
        return color;

    }

}

