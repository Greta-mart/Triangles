package com.triangle;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Data {
    String triangleInfo;
    String[] triangleArr;
    ArrayList<Triangle> triangles = new ArrayList<>();
    String answer;
    int sideA, sideB, sideC;
    String triangleName;
    Triangle t = new Triangle(triangleName, sideA, sideB, sideC);


    public void inputData() {
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Please enter name and length for each side of triangle : ");
            triangleInfo = s.nextLine();
            triangleArr = triangleInfo.split(", ");

            triangleName = triangleArr[0];
            sideA = parseInt(triangleArr[1]);
            sideB = parseInt(triangleArr[2]);
            sideC = parseInt(triangleArr[3]);

            triangles.add(new Triangle (triangleName, sideA, sideB, sideC));
            System.out.println("Would you like to continue (Y/N): ");
            answer = s.nextLine();
        }
        while ((answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")));
    }
}
