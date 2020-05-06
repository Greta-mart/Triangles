package com.triangle;

import static java.lang.Math.sqrt;

public class Triangle {
    private String triangleName;
    private int sideA;
    private int sideB;
    private int sideC;
    private float area;

    public Triangle(String triangleName, int sideA, int sideB, int sideC) {
        float perimetr;
        this.setTriangleName(triangleName);
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
        perimetr = (sideA + sideB + sideC) / 2;
        this.area = (float) sqrt((perimetr * (perimetr - sideA) * (perimetr - sideB) * (perimetr - sideC)));
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

    public void setArea(float area) {
        this.area = area;
    }
}
