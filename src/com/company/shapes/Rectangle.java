package com.company.shapes;

public class Rectangle implements Shape{
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width =width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea (){
        return height*width;
    }

    public double getPerimeter (){
        return (height*2)+(width*2);
    }

}
