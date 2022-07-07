package com.company;

public class Balyk {
    private String species;
    private String color;
    private int weight;
    private int length;

    void setBalykTuru(String s){
        species = s;
    }
    void setColor(String c){
        color = c;
    }
    void setWeight(int w){
        weight = w;
    }
    void setLength(int l){
        length = l;
    }
    String getSpecies(){
        return species;
    }
    String getColor(){
        return color;
    }
    int getWeight(){
        return weight;
    }
    int getLength(){
        return length;
    }
}
