package com.magasin;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println( "Golden Master ");
    Item[] items = {
            new Item("normal", 10, 5),
            new Item("normal", 0, 50),
            new Item("Comté", 10, 5),
            new Item("Comté", 10, 50),
            new Item("Pass VIP Concert", 12, 12),
            new Item("Pass VIP Concert", 5, 5),
            new Item("Pass VIP Concert", 0, 5),
            new Item("Pass VIP Concert", -1, 5),
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
