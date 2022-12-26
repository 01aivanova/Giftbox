package com.globallogic.presents.Giftbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Giftbox {
    public static void main(String[] args) {

        ArrayList<Candies> gift = new ArrayList<>();

        Gummies bears = new Gummies("Bears", "ToTo  ", 25, 1);
        Gummies cocacola = new Gummies("Cocacola", "Sweets", 30, 15);
        Chocolate dark = new Chocolate("Dark", "Milka ",20, 150);
        Chocolate milk = new Chocolate("Milk", "Corona",15, 100);
        Chocolate white = new Chocolate("White", "Mria  ",10 , 199);

        gift.add(bears);
        gift.add(cocacola);
        gift.add(dark);
        gift.add(milk);
        gift.add(white);

        //Провести сортировку конфет в подарке на основе одного из параметров.
        System.out.println("Giftbox: ");
        gift.sort(Comparator.comparing(Candies::getName)
                .thenComparing(Candies::getWeight));
        for (Candies candy : gift) {
            candy.showInfo(candy.name);
        }

        //Найти конфету в подарке, соответствующую заданному диапазону параметров.
        System.out.println("Candy from giftbox with 100g weight");
        String f;
        for (Candies candy : gift) {
            if (candy.getWeight()>=100){
                f = candy.getName();
                candy.showInfo1(candy.name);
            }
        }


        //Собрать детский подарок с определением его веса.
        int weight = 0;
        for (Candies candy : gift) {
            weight += candy.getWeight();
        }
        System.out.println("Total giftbox weight is "+ weight + " gram");


    }
}
