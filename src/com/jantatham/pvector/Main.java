package com.jantatham.pvector;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testing PVector Class...");

        PVector p = new PVector(10, 20, 2);
        p.limit(5);

        System.out.println(p.x + "x" + p.y);


    }
}
