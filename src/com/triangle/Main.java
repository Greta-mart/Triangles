package com.triangle;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        d.inputData();

        if (!d.triangles.isEmpty()){
            System.out.println("============= Triangles list: =============== ");
            for (int i = 0; i < d.triangles.size(); i++) {
                System.out.println(d.triangles.get(i).toString());
            }
        }
    }
}
