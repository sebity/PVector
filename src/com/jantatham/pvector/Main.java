package com.jantatham.pvector;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testing PVector Class...");

        PVector p1 = new PVector(10, 20);
        PVector p2 = new PVector(60, 80);

        double answer = PVector.angleBetween(p1, p2);

        System.out.println(Math.toDegrees(answer));
    }
}
