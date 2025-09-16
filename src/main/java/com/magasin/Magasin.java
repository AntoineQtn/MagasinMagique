package com.magasin;

class Magasin {
    Item[] items;

    public Magasin(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            String name = item.name;

            if (name.equals("Kryptonite")) {
                item.quality = 80;
                item.sellIn = 0;
                continue;
            }

            item.sellIn--;

            if (name.equals("Comté")) {
                if (item.quality < 50) {
                    item.quality++;
                    if (item.sellIn < 0 && item.quality < 50) {
                        item.quality++;
                    }
                }
            } else if (name.equals("Pass VIP Concert")) {
                if (item.sellIn < 0) {
                    item.quality = 0;
                } else if (item.sellIn < 5) {
                    item.quality = Math.min(item.quality + 3, 50);
                } else if (item.sellIn < 10) {
                    item.quality = Math.min(item.quality + 2, 50);
                } else {
                    if (item.quality < 50) {
                        item.quality++;
                    }
                }
            } else {
                if (item.quality > 0) {
                    item.quality--;
                    if (item.sellIn < 0 && item.quality > 0) {
                        item.quality--;
                    }
                }
            }
        }
    }




//            if (!name.equals("Comté")
//                    && ! name.equals("Pass VIP Concert")) {
//                if (quality > 0) {
//                    if (!name.equals("Kryptonite")) {
//                        item.quality = item.quality - 1;
//                    }
//                }
//            }
//            else {
//                if (quality < 50) {
//                    item.quality = item.quality + 1;
//
//                    if (name.equals("Pass VIP Concert")) {
//                        if (sellIn < 11) {
//                            if (quality < 50) {
//                                item.quality = item.quality + 1;
//                            }
//                        }
//
//                        if (sellIn < 6) {
//                            if (quality< 50) {
//                                item.quality = item.quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!name.equals("Kryptonite")) {
//                item.sellIn = item.sellIn - 1;
//            }
//
//            if (sellIn < 0) {
//                if (!name.equals("Comté")) {
//                    if (!name.equals("Pass VIP Concert")) {
//                        if (quality > 0) {
//                            if (!name.equals("Kryptonite")) {
//                                item.quality = item.quality - 1;
//                            }
//                        }
//                    } else {
//                        item.quality = item.quality - item.quality;
//                    }
//                } else {
//                    if (quality  < 50) {
//                        item.quality = item.quality + 1;
//                    }
//                }
//            }
        }
//    }
//}
