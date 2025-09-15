package com.magasin;

class Magasin {
    Item[] items;

    public Magasin(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {


        for (int i = 0; i < items.length; i++) {

            Item item = items[i];
            String name = item.name;
            int quality = item.quality;
            int sellIn = item.sellIn;

            if (!name.equals("Comté")
                    && ! name.equals("Pass VIP Concert")) {
                if (quality > 0) {
                    if (!name.equals("Kryptonite")) {
                        item.quality = item.quality - 1;
                    }
                }
            }
            else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;

                    if (name.equals("Pass VIP Concert")) {
                        if (sellIn < 11) {
                            if (quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }

                        if (sellIn < 6) {
                            if (quality< 50) {
                                item.quality = item.quality + 1;
                            }
                        }
                    }
                }
            }

            if (!name.equals("Kryptonite")) {
                item.sellIn = item.sellIn - 1;
            }

            if (sellIn < 0) {
                if (!name.equals("Comté")) {
                    if (!name.equals("Pass VIP Concert")) {
                        if (quality > 0) {
                            if (!name.equals("Kryptonite")) {
                                item.quality = item.quality - 1;
                            }
                        }
                    } else {
                        item.quality = item.quality - item.quality;
                    }
                } else {
                    if (quality  < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
    }
}
