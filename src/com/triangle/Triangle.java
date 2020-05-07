package com.triangle;

import static java.lang.Math.sqrt;
import java.lang.Float;

public class Triangle implements Comparable< Triangle >{
    private String triangleName;
    private int sideA;
    private int sideB;
    private int sideC;
    private double area;

    public Triangle(String triangleName, int sideA, int sideB, int sideC) {
        double perimetr;
        this.setTriangleName(triangleName);
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
        perimetr = (sideA + sideB + sideC) / 2;
        this.area =  sqrt((perimetr * (perimetr - sideA) * (perimetr - sideB) * (perimetr - sideC)));
    }

    public void setTriangleName(String triangleName) {
        this.triangleName = triangleName;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return  "[Triangle Name=" + triangleName + "]" +
                ", Area=" + area + " cm\n";
    }

    @Override
    public int compareTo(Triangle t) {
        return this.getArea().compareTo(t.area);
    }
}
