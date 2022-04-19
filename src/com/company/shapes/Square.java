package com.company.shapes;

public class Square implements Shape {

    double height;

    public Square(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }



    public double getArea (){
        return height*height;
    }

    public double getPerimeter (){
        return height*4;
    }


}
