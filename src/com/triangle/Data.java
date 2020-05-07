package com.triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Data {
    ArrayList<Triangle> triangles = new ArrayList<>();

    public void inputData() {
        int sideA = 0, sideB = 0, sideC = 0;
        String triangleName ="";
        String answer="";

        Scanner s = new Scanner(System.in);
        do {
            try {
                String[] triangleArr;
                System.out.print("Please enter name and length for each side of triangle : ");
                String triangleInfo = s.nextLine();
                triangleArr = triangleInfo.split(", ");

                triangleName = triangleArr[0];
                sideA = parseInt(triangleArr[1]);
                sideB = parseInt(triangleArr[2]);
                sideC = parseInt(triangleArr[3]);
                if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
                    triangles.add(new Triangle(triangleName, sideA, sideB, sideC));
                }
                else{
                    System.out.println("Triangle is not exist");
                }
                Collections.sort(triangles, Collections.reverseOrder());

                System.out.print("Would you like to continue (Y/N): ");
                answer = s.nextLine();
            } catch (Exception ex) {
                System.out.println
                        ("Please enter the name and length for each side of triangle with the separator ',' and backspace");
            }
        }
        while ((answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")));
    }
}
