package com.company.vehicle;

public enum RestaurantMenu {
    APPETIZER ("steamed prawn", "cafe Latte"),
    MAINCOURSE ("continental rice", "deep fried chicken"),
    DESSERT ("cupcakes", "milk chocolate ice cream");

    private final String firstItem;
    private final String secondItem;



    RestaurantMenu(String firstItem, String secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;

    }

    public String getFirstItem() {
        return firstItem;
    }

    public String getSecondItem() {
        return secondItem;
    }

    }
