package com.triangle;

public class Main {
    public static void main(String[] args) {
        Application d = new Application();
        d.data();

        if (!d.triangles.isEmpty()){
            System.out.println("============= Triangles list: =============== ");
            for (int i = 0; i < d.triangles.size(); i++) {
                System.out.println(d.triangles.get(i).toString());
            }
        }
    }
}
