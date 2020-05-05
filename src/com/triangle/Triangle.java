package com.triangle;

import static java.lang.Math.sqrt;

public class Triangle {
    private String triangleName;
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(String triangleName, int sideA, int sideB, int sideC) {
        this.setTriangleName(triangleName);
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
    }

    public String getTriangleName() {
        return triangleName;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }


    public float area() {
        float perimetr;
        perimetr = (getSideA() + getSideB() + getSideC()) / 2;
        return (float) sqrt((perimetr * (perimetr - getSideA()) * (perimetr - getSideB()) * (perimetr - getSideC())));
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
}
