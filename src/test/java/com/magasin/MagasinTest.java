package com.magasin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    @DisplayName("Normal items: sellIn and quality decrease by 1 each day")
    void normalItemDegradesNormally() {
        Item[] items = { new Item("normal", 10, 5) };
        Magasin magasin = new Magasin(items);

        magasin.updateQuality();

        assertEquals(9, items[0].sellIn);
        assertEquals(4, items[0].quality);
    }

    @Test
    @DisplayName("Normal items: quality decreases twice as fast after sellIn <= 0")
    void normalItemDegradesTwiceAsFastAfterSellIn() {
        Item[] items = { new Item("normal", 0, 10) };
        Magasin magasin = new Magasin(items);

        magasin.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(8, items[0].quality);
    }

    @Test
    @DisplayName("Comté increases in quality, max 50")
    void comteIncreasesInQuality() {
        Item[] items = { new Item("Comté", 10, 5) };
        Magasin magasin = new Magasin(items);

        magasin.updateQuality();

        assertEquals(9, items[0].sellIn);
        assertEquals(6, items[0].quality);
    }

    @Test
    @DisplayName("Comté increases twice as fast after expiration")
    void comteIncreasesTwiceAfterSellIn() {
        Item[] items = { new Item("Comté", 0, 5) };
        Magasin magasin = new Magasin(items);

        magasin.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(7, items[0].quality);
    }

    @Test
    @DisplayName("VIP Pass increases by 2 when 6 <= sellIn <= 10")
    void vipPassIncreasesByTwo() {
        Item[] items = { new Item("Pass VIP Concert", 10, 10) };
        Magasin magasin = new Magasin(items);

        magasin.updateQuality();

        assertEquals(9, items[0].sellIn);
        assertEquals(12, items[0].quality);
    }

    @Test
    @DisplayName("VIP Pass increases by 3 when 1 <= sellIn <= 5")
    void vipPassIncreasesByThree() {
        Item[] items = { new Item("Pass VIP Concert", 5, 10) };
        Magasin magasin = new Magasin(items);

        magasin.updateQuality();

        assertEquals(4, items[0].sellIn);
        assertEquals(13, items[0].quality);
    }

    @Test
    @DisplayName("VIP Pass drops to 0 quality after the concert (sellIn <= 0)")
    void vipPassDropsToZeroAfterConcert() {
        Item[] items = { new Item("Pass VIP Concert", 0, 10) };
        Magasin magasin = new Magasin(items);

        magasin.updateQuality();

        assertEquals(-1, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

    @Test
    @DisplayName("Kryptonite stays at 80 quality and sellIn = 0")
    void kryptoniteAlways80() {
        Item[] items = {
                new Item("Kryptonite", 5, 42)
        };
        Magasin magasin = new Magasin(items);

        magasin.updateQuality();

        assertEquals(0, items[0].sellIn);
        assertEquals(80, items[0].quality);
    }
}
