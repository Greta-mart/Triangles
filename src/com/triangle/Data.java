package com.triangle;

import java.util.Scanner;

public class Data {
    String trianleInfo;
    String[] triangleArr;

    public void inputData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter name and length for each side of triangle : ");
        trianleInfo = s.nextLine();
        triangleArr = trianleInfo.split(", ");
    }
}
