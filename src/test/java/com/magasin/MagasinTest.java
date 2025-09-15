package com.magasin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void normalNameTest() {
        Item[] items = {
                new Item("normal", 10, 5),
                new Item("normal", 0, 50),
        };
                Magasin magasin = new Magasin(items);
                magasin.updateQuality();
                assertEquals("normal", magasin.items[0].name);
    }

    @Test
    @DisplayName("normal sellIn and quality should decrease by 1")
    void normalSellInTest() {
        Item[] items = {
                new Item("normal", 10, 5),
                new Item("normal", 0, 50),
        };
        Magasin magasin = new Magasin(items);
        magasin.updateQuality();
        for (int i = 0; i < items.length; i++) {
            if (items[i].quality < 50) {
                items[i].quality = items[i].quality + 1;
            }
        }
    }

    @Test
    @DisplayName("VIP Pass should increase quality by 2 when 5 < SellIn < 10")
    void vipPassQualityByTwoTest() {
        Item[] items = {
                new Item("Pass VIP Concert", 12, 12),
        };
        Magasin magasin = new Magasin(items);
        magasin.updateQuality();
//        if (items[0].quality <= 10) {
//            items[0].quality = items[0].quality - 2;
//        }
        for (int i = 0; i < items.length; i++) {

            Item item = items[i];
            String name = item.name;
            int quality = item.quality;
            int sellIn = item.sellIn;
            if (sellIn < 10 && sellIn >= 5) {
                quality = quality + 2;
            }
        }

    }


    @Test
    @DisplayName("Kryptonite should return 0 and 80")
    void kryptoniteSellInQualityTest() {
        Item[] items = {
                new Item("Kryptonite", 0, 80),
        };
        Magasin magasin = new Magasin(items);
        magasin.updateQuality();

        assertEquals(80, magasin.items[0].quality);
        assertEquals(0, magasin.items[0].sellIn);

    }

}
