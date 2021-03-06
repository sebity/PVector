package com.jantatham.pvector;

import static java.lang.Math.PI;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by jan on 17/04/17.
 */
public class PVectorTest {
    @org.junit.Test
    public void add_xy_to_vector() throws Exception {
        PVector pv = new PVector(1,2);
        pv.add(3,2);
        assertEquals(pv.x, 4, 0);
        assertEquals(pv.y, 4, 0);
    }

    @org.junit.Test
    public void add_xyz_to_vector() throws Exception {
        PVector pv = new PVector(1,2,3);
        pv.add(3,2,1);
        assertEquals(pv.x, 4, 0);
        assertEquals(pv.y, 4, 0);
        assertEquals(pv.z, 4, 0);
    }

    @org.junit.Test
    public void add_pVector_to_current_pVector() throws Exception {
        PVector pv1 = new PVector(1,2,3);
        PVector pv2 = new PVector(5,6,7);
        pv1.add(pv2);
        assertEquals(pv1.x, 6, 0);
        assertEquals(pv1.y, 8, 0);
        assertEquals(pv1.z, 10, 0);
    }

    @org.junit.Test
    public void add_two_pVectors_together_and_set_new_pVector() throws Exception {
        PVector pv1 = new PVector(1,2,3);
        PVector pv2 = new PVector(5,6,7);
        PVector pv3 = PVector.add(pv1, pv2);
        assertEquals(pv3.x, 6, 0);
        assertEquals(pv3.y, 8, 0);
        assertEquals(pv3.z, 10, 0);
    }

    @org.junit.Test
    public void add_two_pVectors_together_and_set_target_pVector() throws Exception {
        PVector pv1 = new PVector(1,2,3);
        PVector pv2 = new PVector(5,6,7);
        PVector pv3 = new PVector();
        PVector.add(pv1, pv2, pv3);
        assertEquals(pv3.x, 6, 0);
        assertEquals(pv3.y, 8, 0);
        assertEquals(pv3.z, 10, 0);
    }

    @org.junit.Test
    public void angleBetween_two_pVectors() throws Exception {
        PVector pv1 = new PVector(10, 20);
        PVector pv2 = new PVector(60, 80);
        double answer = PVector.angleBetween(pv1, pv2);
        assertEquals(Math.toDegrees(answer), 10.3048464687, 0.001);
    }

    @org.junit.Test
    public void copy_pVector() throws Exception {
        PVector pv1 = new PVector(4,8,16);
        PVector pv2 = pv1.copy();
        assertEquals(pv2.x, 4, 0);
    }

    @org.junit.Test
    public void dist_two_coordinates() throws Exception {
        PVector p = new PVector();
        assertEquals(p.dist(10, 20, 60, 80), 78.10249, 0.001);
    }

    @org.junit.Test
    public void dist_single_pVector() throws Exception {
        PVector pv1 = new PVector(10,20,0);
        PVector pv2 = new PVector(60, 80, 0);
        assertEquals(pv1.dist(pv2), 78.10249, 0.001);
    }

    @org.junit.Test
    public void dist_double_pVector() throws Exception {
        PVector pv1 = new PVector(10,20,0);
        PVector pv2 = new PVector(60, 80, 0);
        PVector p = new PVector();
        assertEquals(p.dist(pv1,pv2), 78.10249, 0.001);
    }

    @org.junit.Test
    public void div_pVector_by_scalar() throws Exception {
        PVector pv = new PVector(4,8,16);
        pv.div(2);
        assertEquals(pv.x, 2, 0);
        assertEquals(pv.y, 4, 0);
        assertEquals(pv.z, 8, 0);
    }

    @org.junit.Test
    public void div_pVectors_by_scalar_and_set_new_pVector() throws Exception {
        PVector pv1 = new PVector(9,6,3);
        PVector pv2 = PVector.div(pv1, 3);
        assertEquals(pv2.x, 3, 0);
        assertEquals(pv2.y, 2, 0);
        assertEquals(pv2.z, 1, 0);
    }

    @org.junit.Test
    public void div_pVectors_by_scalar_and_set_target_pVector() throws Exception {
        PVector pv1 = new PVector(12,9,6);
        PVector pv2 = new PVector();
        PVector.div(pv1, 3, pv2);
        assertEquals(pv2.x, 4, 0);
        assertEquals(pv2.y, 3, 0);
        assertEquals(pv2.z, 2, 0);
    }

    @org.junit.Test
    public void fromAngle() throws Exception {
        PVector p;
        p = PVector.fromAngle(PI/3);
        assertEquals(p.x, 0.500000, 0.001);
        assertEquals(p.y, 0.86602540, 0.001);
    }

    @org.junit.Test
    public void heading() throws Exception {
        PVector pv = new PVector();
        double result = pv.heading(10.0, 20.0);
        assertEquals(result, 1.1071, 0.001);
    }

    @org.junit.Test
    public void limit() throws Exception {
        PVector pv = new PVector(10,20,2);
        pv.limit(5);
        assertEquals(pv.x, 2.227177, 0.001);
        assertEquals(pv.y, 4.454354, 0.001);
    }

    @org.junit.Test
    public void magnitude_calculate() throws Exception {
        PVector pv = new PVector(20,30,40);
        double result = pv.mag();
        assertEquals(result, 53.852, 0.001);
    }

    @org.junit.Test
    public void magnitude_squared_calculate() throws Exception {
        PVector pv = new PVector(20,30,40);
        double result = pv.magSq();
        assertEquals(result, 2900, 0);
    }

    @org.junit.Test
    public void map_test() throws Exception {
        PVector pv = new PVector();
        double result = pv.map(110, 0, 100, -20, -10);
        assertEquals(result, -9.0, 0);
    }

    @org.junit.Test
    public void mult_pVector_by_scalar() throws Exception {
        PVector pv = new PVector(1,2,3);
        pv.mult(5);
        assertEquals(pv.x, 5, 0);
        assertEquals(pv.y, 10, 0);
        assertEquals(pv.z, 15, 0);
    }

    @org.junit.Test
    public void mult_pVectors_by_scalar_and_set_new_pVector() throws Exception {
        PVector pv1 = new PVector(1,2,3);
        PVector pv2 = PVector.mult(pv1, 3);
        assertEquals(pv2.x, 3, 0);
        assertEquals(pv2.y, 6, 0);
        assertEquals(pv2.z, 9, 0);
    }

    @org.junit.Test
    public void mult_pVectors_by_scalar_and_set_target_pVector() throws Exception {
        PVector pv1 = new PVector(1,2,3);
        PVector pv2 = new PVector();
        PVector.mult(pv1, 4, pv2);
        assertEquals(pv2.x, 4, 0);
        assertEquals(pv2.y, 8, 0);
        assertEquals(pv2.z, 12, 0);
    }

    @org.junit.Test
    public void normalize_vector() throws Exception {
        PVector pv = new PVector(10, 20, 30);
        pv.normalize();
        assertEquals(pv.x, 0.267, 0.001);

    }

    @org.junit.Test
    public void set_xy_values() throws Exception {
        PVector pv = new PVector(5,6,7);
        pv.set(3,4);
        assertEquals(pv.x, 3, 0);
        assertEquals(pv.y, 4, 0);
    }

    @org.junit.Test
    public void set_xyz_values() throws Exception {
        PVector pv = new PVector(5,6,7);
        pv.set(3,4,5);
        assertEquals(pv.x, 3, 0);
        assertEquals(pv.y, 4, 0);
        assertEquals(pv.z, 5, 0);
    }

    @org.junit.Test
    public void set_pVector1_values_to_pVector2_values() throws Exception {
        PVector pv1 = new PVector();
        PVector pv2 = new PVector(3,4,5);
        pv1.set(pv2);
        assertEquals(pv1.x, 3, 0);
        assertEquals(pv1.y, 4, 0);
        assertEquals(pv1.z, 5, 0);
    }

    @org.junit.Test
    public void setX() throws Exception {
        PVector pv = new PVector(1,2,3);
        pv.setX(5);
        assertEquals(pv.x, 5, 0);
    }

    @org.junit.Test
    public void setY() throws Exception {
        PVector pv = new PVector(4,5,6);
        pv.setY(8);
        assertEquals(pv.y, 8, 0);
    }

    @org.junit.Test
    public void setZ() throws Exception {
        PVector pv = new PVector(6,7,8);
        pv.setZ(5);
        assertEquals(pv.z, 5, 0);
    }

    @org.junit.Test
    public void square_calculate() throws Exception {
        PVector pv = new PVector();
        double result = pv.square(5);
        assertEquals(result, 25, 0);
    }

    @org.junit.Test
    public void sub_xy_from_vector() throws Exception {
        PVector pv = new PVector(10,10);
        pv.sub(3,2);
        assertEquals(pv.x, 7, 0);
        assertEquals(pv.y, 8, 0);
    }

    @org.junit.Test
    public void sub_xyz_to_vector() throws Exception {
        PVector pv = new PVector(10,10,10);
        pv.sub(3,2,1);
        assertEquals(pv.x, 7, 0);
        assertEquals(pv.y, 8, 0);
        assertEquals(pv.z, 9, 0);
    }

    @org.junit.Test
    public void sub_pVector_to_current_pVector() throws Exception {
        PVector pv1 = new PVector(10,10,10);
        PVector pv2 = new PVector(5,6,7);
        pv1.sub(pv2);
        assertEquals(pv1.x, 5, 0);
        assertEquals(pv1.y, 4, 0);
        assertEquals(pv1.z, 3, 0);
    }

    @org.junit.Test
    public void sub_two_pVectors_together_and_set_new_pVector() throws Exception {
        PVector pv1 = new PVector(10,10,10);
        PVector pv2 = new PVector(5,6,7);
        PVector pv3 = PVector.sub(pv1, pv2);
        assertEquals(pv3.x, 5, 0);
        assertEquals(pv3.y, 4, 0);
        assertEquals(pv3.z, 3, 0);
    }

    @org.junit.Test
    public void sub_two_pVectors_together_and_set_target_pVector() throws Exception {
        PVector pv1 = new PVector(10,10,10);
        PVector pv2 = new PVector(5,6,7);
        PVector pv3 = new PVector();
        PVector.sub(pv1, pv2, pv3);
        assertEquals(pv3.x, 5, 0);
        assertEquals(pv3.y, 4, 0);
        assertEquals(pv3.z, 3, 0);
    }

}