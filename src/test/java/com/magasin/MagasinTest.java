package com.magasin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void GoldenMasterComteTest() {
        Item[] items = new Item[] { new Item("Comté", 10, 10) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("Comté", app.items[0].name);
    }

    @Test
    void GoldenMasterComteQualityTest() {
        Item[] items = new Item[] { new Item("Comté", 10, 60) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("Comté", app.items[0].name);
    }

    @Test
    void GoldenMasterPassVIPConcertTest() {
        Item[] items = new Item[] { new Item("Pass VIP Concert", 10, 10) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("Pass VIP Concert", app.items[0].name);
    }

    @Test
    void GoldenMasterKryptoniteTest() {
        Item[] items = new Item[] { new Item("Kryptonite", 0, 10) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("Kryptonite", app.items[0].name);
    }

    @Test
    void fixme() {
        Item[] items = new Item[] { new Item("fixme", 0, 0) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    @Test
    void testQuality() {

    }

}
