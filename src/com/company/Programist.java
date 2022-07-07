package com.company;

public class Programist {
    private String name;
    private int age;

    void setName(String a) {
        name = a;
        if (a.isEmpty()) {
            System.out.println("Programistin aty bosh bolbosh kerek!");
        }
    }

    void setAge(int a) {
        age = a;
        if (a < 0) {
            System.out.println(name + " Jashy ters bolboshu kerek!");
        } else {
            age = a;
        }
    }

}
