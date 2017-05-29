package com.jantatham.pvector;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testing PVector Class...");

        PVector pv1 = new PVector(10,20,0);
        PVector pv2 = new PVector(60, 80, 0);
        PVector p = new PVector();

        double x = p.dist(pv1, pv2);

        System.out.println(x);


    }
}
