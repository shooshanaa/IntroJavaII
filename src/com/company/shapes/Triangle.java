package com.company.shapes;

public class Triangle implements Shape{
    double sideA;
    double sideB;
    double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getArea () {
        double halfPerimeter = (sideA+sideB+sideC)/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-sideA)*(halfPerimeter-sideB)*(halfPerimeter-sideC));

    }

    public double getPerimeter (){
        return sideA+sideB+sideC;
    }
}
