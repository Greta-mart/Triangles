package com.triangle;

public class Main {
    public static void main(String[] args) {

        Data d = new Data();
        d.inputData();

        for (int i = 0; i < d.triangles.size() ; i++) {
            Triangle t = new Triangle(d.triangleName, d.sideA, d.sideB, d.sideC);
            d.triangles.get(i);
            t.getArea();
            System.out.println(t.toString());
        }

    }
}
