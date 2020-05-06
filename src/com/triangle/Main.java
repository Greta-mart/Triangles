package com.triangle;

public class Main {
    public static void main(String[] args) {

        Data d = new Data();
        d.inputData();
        Triangle t = new Triangle(d.triangleName, d.sideA, d.sideB, d.sideC, d.area);
    }
}
