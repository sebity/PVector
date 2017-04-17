package com.jantatham.pvector;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testing PVector Class...");

        PVector pv = new PVector(10,20,30);

        pv.normalize();

        System.out.println(pv.x);

    }
}
