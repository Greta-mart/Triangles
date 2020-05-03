package com.triangle;

import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class Triangle {
    String triangleName;
    int sideA, sideB, sideC;

    public Triangle(String triangleName, int sideA, int sideB, int sideC) {
        this.triangleName = triangleName;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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

    ArrayList<Triangle> triangles = new ArrayList<>();

    public float area(int sideA, int sideB, int sideC) {
        float perimetr;
        perimetr = (sideA + sideB + sideC) / 2;
        return (float) sqrt((perimetr * (perimetr - sideA) * (perimetr - sideB) * (perimetr - sideC)));
    }
}
