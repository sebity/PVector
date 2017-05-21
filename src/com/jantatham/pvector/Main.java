package com.jantatham.pvector;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testing PVector Class...");

        PVector pv = new PVector(2,3,4);

        pv.rotateX(PI/2);

        System.out.println(pv.x + "x" + pv.y + "x" + pv.z);


    }
}
