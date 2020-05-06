package com.triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Math.sqrt;

public class Data {
    ArrayList<Triangle> triangles = new ArrayList<>();
    int sideA, sideB, sideC;
    float area;
    String triangleName;
    Triangle t = new Triangle(triangleName, sideA, sideB, sideC);

    public void inputData() {
        String triangleInfo;
        String answer;
        String[] triangleArr;
        float perimetr;

        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Please enter name and length for each side of triangle : ");
            triangleInfo = s.nextLine();
            triangleArr = triangleInfo.split(", ");

            triangleName = triangleArr[0];
            sideA = parseInt(triangleArr[1]);
            sideB = parseInt(triangleArr[2]);
            sideC = parseInt(triangleArr[3]);

            perimetr = (sideA + sideB + sideC) / 2;
            area = (float) sqrt((perimetr * (perimetr - sideA) * (perimetr - sideB) * (perimetr - sideC)));

            triangles.add(new Triangle(triangleName, sideA, sideB, sideC));

            Collections.sort(triangles, Collections.reverseOrder());

            System.out.println("Would you like to continue (Y/N): ");
            answer = s.nextLine();

        }
        while ((answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")));
    }

    @Override
    public String toString() {
        return "Data{" +
                "triangles=" + triangles +
                ", area=" + area +
                ", triangleName='" + triangleName + '\'' +
                ", t=" + t +
                '}';
    }
}
