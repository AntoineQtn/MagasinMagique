package com.magasin;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println( "Golden Master ");
    Item[] items = {
//            //La qualité doit baisser plus sellin baisse, ne pas être négative et ne pas dépasser 50, si sellIn négatif la qualité baisse *2
//           //dégression normal works
            new Item("normal", 10, 5),
//            //quality*2 en négatif works
            new Item("normal", 0, 50),



//            //La qualité doit augmenter plus sellIn baisse, ne pass dépasser 50, si sellIn négatif qualité*2
//           // augmentation works
            new Item("Comté", 10, 5),
//            //limit 50 works
            new Item("Comté", 10, 50),
//
//
//            //La qualité augmente en fonction du sellIn, entre 5 et 10 quality*2, entre 5 et 1 *3, 0 à 0
//            //if sellIn <= 10, quality += * 2, ifeq sellIn <= 5, quality += * 3, if sellIn <= 0, quality = 0
//            //qulity n'augmente pas !, ni *2, ni *3
            new Item("Pass VIP Concert", 12, 12),
            new Item("Pass VIP Concert", 5, 5),
            new Item("Pass VIP Concert", 0, 5),
            new Item("Pass VIP Concert", -1, 5),
//
////            // quality always 80, sellIn always 0
////            //if sellIn < 0, quality -= * 2
////            //SellIn = 0, quality = quality
//            //quality baisse ! quality peut être autre que 80
            new Item("Kryptonite", 0, 80),
            new Item("Kryptonite", 1, 0 ),
            new Item("Kryptonite", 0, 90)

    };

    Magasin magasin = new Magasin(items);
    for (int i = 0; i < 12; i++) {
        magasin.updateQuality();
        System.out.println( "-------- day " + i + " --------");
        System.out.println(Arrays.toString(items));

    }
    }
}
