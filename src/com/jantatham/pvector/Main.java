package com.jantatham.pvector;

import javafx.scene.paint.Color;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testing PVector Class...");

        PVector p = new PVector(10, 20, 2);
        PVector p2 = new PVector(5,3,2);
        PVector p3 = p.lerp(p, p2, 0.5);

        Color c1 = Color.rgb(255, 200, 123);
        Color c2 = Color.rgb(155, 100, 133);
        int c3 = p.lerpColorRGBFX(c1, c2, 0.5);

        System.out.println(p3.x + "x" + p3.y + "x" + p3.z);
        System.out.println((c3 >> 16) & 255);
        int[] rgba = p.colorIntegerToRGBA(c3);

        System.out.println(rgba[0]);
    }
}
