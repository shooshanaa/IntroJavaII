package com.company;
import com.company.vehicle.*;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Motorcycle();
        car.startEngine(true);


        System.out.println(TaskMenu.FILE.getFirstItem());

        System.out.println(RestaurantMenu.APPETIZER.getSecondItem());
        System.out.println(RestaurantMenu.MAINCOURSE.getFirstItem());
        System.out.println(RestaurantMenu.DESSERT.getSecondItem());


        Account lucie = new Account("A1", "Lucie", 78);
        System.out.println(lucie);

        Account gerry = new Account("A2", "Gerry");







    }
}
