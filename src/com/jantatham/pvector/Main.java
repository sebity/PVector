package com.jantatham.pvector;

public class Main {

    public static void main(String[] args) {
        PVector pv1 = new PVector(2,3);
        PVector pv2 = new PVector(4,7);
        PVector pv3 = PVector.add(pv1,pv2);

        pv1.add(pv2);

        System.out.println(pv3.x);
        System.out.println(pv1.div(2).x);
        System.out.println(pv2.div(0).x);
    }



}
