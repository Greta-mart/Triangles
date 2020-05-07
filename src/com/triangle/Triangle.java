package com.triangle;

import static java.lang.Math.sqrt;

public class Triangle implements Comparable< Triangle >{
    private String triangleName;
    private int sideA;
    private int sideB;
    private int sideC;
    private double area;

    public Triangle(String triangleName, int sideA, int sideB, int sideC) {
        this.triangleName = triangleName;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        double perimetr = (sideA + sideB + sideC) / 2;
        this.area =  sqrt((perimetr * (perimetr - sideA) * (perimetr - sideB) * (perimetr - sideC)));
    }
    public Double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return  "[Triangle Name=" + triangleName + "]" +
                ", Area=" + area + " cm";
    }

    @Override
    public int compareTo(Triangle t) {
        return this.getArea().compareTo(t.area);
    }
}