package com.company;
import com.company.books.Book;
import com.company.shapes.Circle;
import com.company.shapes.Rectangle;
import com.company.shapes.Square;
import com.company.shapes.Triangle;
import com.company.vehicle.*;

public class Main {
    public static void main(String[] args) {

  /*      Vehicle car = new Motorcycle();
        car.startEngine(true);


        System.out.println(TaskMenu.FILE.getFirstItem());

        System.out.println(RestaurantMenu.APPETIZER.getSecondItem());
        System.out.println(RestaurantMenu.MAINCOURSE.getFirstItem());
        System.out.println(RestaurantMenu.DESSERT.getSecondItem());*/

/*
        Account lucie = new Account("A1", "Lucie", 78);
        //System.out.println(lucie);

        Account gerry = new Account("A2", "Gerry");

        System.out.println(lucie.getBalance());
        gerry.getBalance();

        System.out.println(lucie.transferTo(1500, gerry));*/

       /* Book[] books= new Book[4];
        Book one = new Book("Jayne Eyre", "Charlotte Bronte", 15f);
        Book two = new Book("Daddy LongLegs", "Gina Webster", 10f);
        Book three = new Book("Bible", "God", 25f);
        Book four = new Book("White nowhere", "Christin Hanna", 12.56f);





        System.out.println("The author of the book " + one.getName() + " is " + one.getAuthorName());
        System.out.println("The author of the book " + two.getName() + " is " + two.getAuthorName());
        System.out.println("The author of the book " + three.getName() + " is " + three.getAuthorName());
        System.out.println("The author of the book " + four.getName() + " is " + four.getAuthorName());
*/

        Circle circle = new Circle(3);
        System.out.println("The radius of a circle is " + circle.getRadius());
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getPerimeter());

        Square square = new Square(10);
        System.out.println("The length of one side of the square is " + square.getHeight());
        System.out.println("The area of the square is " + square.getArea());
        System.out.println("The perimeter of the square is " + square.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("The sides of the triangle are " + triangle.getSideA() + ", "+ triangle.getSideB() + ", " + triangle.getSideC());
        System.out.println("The area of the triangle is " + triangle.getArea());
        System.out.println("The perimeter of the triangle is " + triangle.getPerimeter());

        Rectangle rectangle = new Rectangle(12,5);
        System.out.println("The height of the rectangle is " + rectangle.getHeight());
        System.out.println("The width of the rectangle is " + rectangle.getWidth());
        System.out.println("The area of the rectangle is " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());












    }
}
