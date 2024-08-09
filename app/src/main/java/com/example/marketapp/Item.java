package com.example.marketapp;

public class Item {
    int ItemImg;
    String ItemName, ItemDesc;

    //our constructor

    public Item(int itemImg, String itemName, String itemDesc) {
        ItemImg = itemImg;
        ItemName = itemName;
        ItemDesc = itemDesc;
    }

    public int getItemImg() {
        return ItemImg;
    }

    public void setItemImg(int itemImg) {
        ItemImg = itemImg;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getItemDesc() {
        return ItemDesc;
    }

    public void setItemDesc(String itemDesc) {
        ItemDesc = itemDesc;
    }
}
