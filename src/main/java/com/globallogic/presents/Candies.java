package com.globallogic.presents.Giftbox;

public class Candies {
    public int price;
    public int weight;
    public String name;

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }
    public String getName(){
        return name;
    }
    public void showInfo(String name) {
        this.name = name;
        System.out.println("| "+name+ "  | " + price+ " | "+ weight+ " | ");
    }
    public void showInfo1(String name) {
        this.name = name;
        System.out.println(name);
    }
}
