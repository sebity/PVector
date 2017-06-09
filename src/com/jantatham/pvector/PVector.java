package com.jantatham.pvector;

import static java.lang.Math.*;

/**
 * The PVector Class handles the 2D and 3D vector translations.
 *
 */
public class PVector {

    public double x;
    public double y;
    public double z;

    /**
     * This method is a Constructor for an empty vector
     */
    public PVector() {

    }

    /**
     * This method is a Constructor for a 2D vector
     *
     * @param x the X scalar
     * @param y the Y scalar
     */
    public PVector(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0.0;
    }

    /**
     * This method is a Constructor for a 3D vector
     *
     * @param x the X scalar
     * @param y the Y scalar
     * @param z the Z scalar
     */
    public PVector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * This method adds the X and Y scalars to the current vectors
     * components.
     *
     * @param x the X scalar
     * @param y the Y scalar
     * @return this vector
     */
    public PVector add(double x, double y) {
        this.x += x;
        this.y += y;
        return this;
    }

    /**
     * This method adds the X,Y and Z components to the current vectors
     * components.
     *
     * @param x the X scalar
     * @param y the Y scalar
     * @param z the Z scalar
     * @return this vector
     */
    public PVector add(double x, double y, double z) {
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }

    /**
     * This method adds the Vectors components to the Vector that called the
     * method.
     *
     * @param v the first vector
     * @return this vector.
     */
    public PVector add(PVector v) {
        x += v.x;
        y += v.y;
        z += v.z;
        return this;
    }

    /**
     * This method adds v1 and v2 together and binds the components to a new
     * vector.
     *
     * @param v1 the first vector
     * @param v2 the second vector
     * @return new vector
     */
    static public PVector add(PVector v1, PVector v2) {
        return add(v1, v2, null);
    }

    /**
     * This method adds v1 and v2 together and binds the components to the
     * target vector.
     *
     * @param v1 the first vector
     * @param v2 the second vector
     * @param target the target vector
     * @return target vector
     */
    static public PVector add(PVector v1, PVector v2, PVector target) {
        if(target == null) {
            target = new PVector(v1.x+v2.x, v1.y+v2.y, v1.z+v2.z);
        }
        else {
            target.set(v1.x+v2.x, v1.y+v2.y, v1.z+v2.z);
        }
        return target;
    }

    /**
     * This method creates a copy of the current vector by returning a new
     * vector.
     *
     * @return new vector
     */
    public PVector copy() {
        return new PVector(x, y, z);
    }

    /**
     * This method calculates the distance between two points.
     *
     * @param x1 first vector x coordinate
     * @param y1 first vector y coordinate
     * @param x2 second vector x coordinate
     * @param y2 second vector y coordinate
     * @return the euclidean distance
     */
    public double dist(double x1, double y1, double x2, double y2) {
        return sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
    }

    /**
     * This method calculates the distance between two points.
     *
     * @param p a vector
     * @return the euclidean distance
     */
    public double dist(PVector p) {
        return sqrt(Math.pow((this.x - p.x),2) + Math.pow((this.y - p.y),2));
    }

    /**
     * This method calculates the distance between two points.
     *
     * @param pv1 the first vector
     * @param pv2 the second vector
     * @return the euclidean distance
     */
    public double dist(PVector pv1, PVector pv2) {
        return sqrt(Math.pow((pv1.x - pv2.x),2) + Math.pow((pv1.y - pv2.y),2));
    }

    /**
     * This method divides the current vector by a the scalar (n).
     *
     * @param n the scalar divider
     * @return this vector
     */
    public PVector div(double n) {
        if(n != 0) {
            this.x /= n;
            this.y /= n;
            this.z /= n;
        }
        else {
            System.out.println("Warning: There is a divide overflow error");
        }
        return this;
    }

    /**
     * This method divides the vector (v1) by the scalar (n) and sets the
     * results to the new vector.
     *
     * @param v1 the vector
     * @param n the scalar divider
     * @return the new vector
     */
    static public PVector div(PVector v1, double n) {
        return div(v1, n, null);
    }

    /**
     * This method divides the vector (v1) by the scalar (n) and sets the
     * results to the target vector.
     *
     * @param v1 the vector
     * @param n the scalar divider
     * @param target the target vector
     * @return the target vector
     */
    static public PVector div(PVector v1, double n, PVector target) {
        if(n != 0) {
            if (target == null) {
                target = new PVector(v1.x / n, v1.y / n, v1.z / n);
            } else {
                target.set(v1.x / n, v1.y / n, v1.z / n);
            }
        }
        else {
            System.out.println("Warning: There is a divide overflow error");
        }
        return target;
    }


    /**
     * This method calculates the dot product of two vectors.
     *
     * @param v a vector
     * @return the dot product
     */
    public double dot(PVector v) {
        return x*v.x + y*v.y + z*v.z;
    }


    /**
     * This method calculate the dot product of the vector passing in the
     * X,Y,Z components.
     *
     * @param x the X component of the vector
     * @param y the Y component of the vector
     * @param z the Z component of the vector
     * @return the dot product
     */
    public double dot(double x, double y, double z) {
        return this.x*x + this.y*y + this.z*x;
    }

    /**
     *
     * @param angle the angle
     * @return the PVector
     */
    static public PVector fromAngle(double angle) {
        return fromAngle(angle, null);
    }

    /**
     *
     * @param angle the angle
     * @param target the target PVector
     * @return the PVector
     */
    static public PVector fromAngle(double angle, PVector target) {
        if(target == null) {
            target = new PVector(cos(angle), sin(angle), 0);
        }
        else {
            target.set(cos(angle), sin(angle), 0);
        }

        return target;
    }

    /**
     * This method calculates the angle of rotation for this vector in 2D only.
     *
     * @return the angle of rotation
     */
    public double heading() {
        double angle = atan2(y,x);

        return angle;
    }

    /**
     * This method calculates the angle of rotation for a 2D Vector
     *
     * @param vx the target X vector
     * @param vy the target Y vector
     * @return the angle
     */
    public double heading(double vx, double vy) {
        double angle = atan2(vy,vx) - atan2(y,x);

        return angle;
    }

    /**
     *
     * @param max the maximum limit
     * @return the vector
     */
    public PVector limit(double max) {
        if(this.magSq() > max * max) {
            this.normalize();
            this.mult(max);
        }
        return this;
    }

    /**
     * This method calculates the magnitude (length) of the vector
     *
     * @return vector magnitude
     */
    public double mag() {
        return sqrt(square(x) + square(y) + square(z));
    }

    /**
     * This method calculates the magnitude (length) of the vector, squared.
     *
     * @return vector magnitude squared
     */
    public double magSq() {
        return (square(x) + square(y) + square(z));
    }

    /**
     *
     * @param value the incoming value to be converted
     * @param start1 lower bound of the value's current range
     * @param stop1 upper bound of the value's current range
     * @param start2 lower bound of the value's target range
     * @param stop2 upper bound of the value's target range
     * @return the result
     */
    public double map(double value, double start1, double stop1, double start2, double stop2) {
        return start2 + ((value - start1) * (stop2 - start2)) / (stop1 - start1);
    }

    /**
     * This method multiplies the current vector by a scalar.
     *
     * @param n the scalar multiplier
     * @return this vector
     */
    public PVector mult(double n) {
        this.x *= n;
        this.y *= n;
        this.z *= n;
        return this;
    }

    /**
     * This method multiplies the vector (v1) by a scalar and binds the
     * results to a new vector.
     *
     * @param v1 the vector
     * @param n the scalar multiplier
     * @return the new vector
     */
    static public PVector mult(PVector v1, double n) {
        return mult(v1, n, null);
    }

    /**
     * This method multiplies the vector (v1) by a scalar sets results to
     * the target vector (target).
     *
     * @param v1 the vector
     * @param n the scalar multiplier
     * @param target the target vector
     * @return the new vector
     */
    static public PVector mult(PVector v1, double n, PVector target) {
        if(target == null) {
            target = new PVector(v1.x*n, v1.y*n, v1.z*n);
        }
        else {
            target.set(v1.x*n, v1.y*n, v1.z*n);
        }
        return target;
    }

    /**
     * This method normalizes the vector to length 1 making it a unit vector.
     *
     * @return this vector
     */
    public PVector normalize() {
        double m = this.mag();
        if(m != 0) {
            this.div(m);
        }
        return this;
    }


    /**
     * This method normalizes the vector (vec) passed in the parameter.
     *
     * @param vec the vector to be normalized
     * @return the vector passed
     */
    public PVector normalize(PVector vec) {
        if(vec == null) {
            vec = new PVector();
        }
        double m = mag();
        if(m > 0) {
            vec.set(x/m, y/m, z/m);
        }
        else {
            vec.set(x, y, z);
        }

        return vec;
    }

    /**
     * This method rotates the vector by the specified angle using 2D vectors
     * only (X,Y).
     *
     * @param theta the rotation angle
     * @return this vector
     */
    public PVector rotate(double theta) {
        double oldX = this.x;
        this.x = (this.x * cos(theta)) - (this.y * sin(theta));
        this.y = (oldX * sin(theta)) + (this.y * cos(theta));
        return this;
    }


    /**
     * This method rotates the vector in the Z axis be angle theta.
     *
     * @param theta the angle of rotation
     * @return the new vector
     */
    public PVector rotateX(double theta) {
        double oldY = this.y;
        this.y = (this.y * cos(theta)) - (this.z * sin(theta));
        this.z = (oldY * sin(theta)) + (this.z * cos(theta));
        return this;
    }

    /**
     * This method rotates the Vector in the Y access by angle theta.
     *
     * @param theta the angle of rotation
     * @return the new vector
     */
    public PVector rotateY(double theta) {
        double oldZ = this.z;
        this.z = (this.z * cos(theta)) - (this.x * sin(theta));
        this.x = (oldZ * sin(theta)) + (this.z * cos(theta));
        return this;
    }

    /**
     * This method rotates the Vector in the Z access by angle theta.
     *
     * @param theta the angle of rotation
     * @return the new vector
     */
    public PVector rotateZ(double theta) {
        double oldX = this.x;
        this.x = (this.x * cos(theta)) - (this.y * sin(theta));
        this.y = (oldX * sin(theta)) + (this.y * cos(theta));
        return this;
    }

    /**
     * This method sets X and Y components on the current vector.
     *
     * @param x the X scalar
     * @param y the Y scalar
     * @return this vector
     */
    public PVector set(double x, double y) {
        this.x = x;
        this.y = y;
        return this;
    }

    /**
     * This method sets X, Y and Z components on the current vector.
     *
     * @param x the X scalar
     * @param y the Y scalar
     * @param z the Z scalar
     * @return this vector
     */
    public PVector set(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    /**
     * This method sets the currents components based on the vector (v)
     * components.
     *
     * @param v the vector
     * @return this vector
     */
    public PVector set(PVector v) {
        x = v.x;
        y = v.y;
        z = v.z;
        return this;
    }

    /**
     * This method sets the magnitude of the vector to the value used for the
     * len parameter.
     *
     * @param len the new length of the vector
     * @return the magnitude of the vector
     */
    public PVector setMag(double len) {
        normalize();
        mult(len);
        return this;
    }

    /**
     * This method sets the magnitude of the vector that has been passed in
     * the parameters.
     *
     * @param vec the vector that will have it's magnitude set
     * @param len the new length of the vector
     * @return the magnitude of the vector
     */
    public PVector setMag(PVector vec, double len) {
        vec = normalize(vec);
        vec.mult(len);
        return vec;
    }

    /**
     * This method sets the currents vector X component.
     *
     * @param x the X scalar
     * @return this vector
     */
    public PVector setX(double x) {
        this.x = x;
        return this;
    }

    /**
     * This method sets the currents vector Y component.
     *
     * @param y the Y scalar
     * @return this vector
     */
    public PVector setY(double y) {
        this.y = y;
        return this;
    }

    /**
     * This method sets the currents vector Z component.
     *
     * @param z the Z scalar
     * @return this vector
     */
    public PVector setZ(double z) {
        this.z = z;
        return this;
    }

    /**
     * This method calculates the square of a scalar.
     *
     * @param n the scalar
     * @return the squared result
     */
    public double square(double n) {
        return n*n;
    }

    /**
     * This method subtracts the X and Y scalars from the current vector.
     *
     * @param x the X scalar
     * @param y the Y scalar
     * @return this vector
     */
    public PVector sub(double x, double y) {
        this.x -= x;
        this.y -= y;
        return this;
    }

    /**
     * This method subtracts the X, Y and Z scalars from the current vector.
     *
     * @param x the X scalar
     * @param y the Y scalar
     * @param z the Z scalar
     * @return this vector
     */
    public PVector sub(double x, double y, double z) {
        this.x -= x;
        this.y -= y;
        this.z -= z;
        return this;
    }

    /**
     * This method subtracts the Vectors components from the Vector that called
     * the method.
     *
     * @param v the vector
     * @return this vector
     */
    public PVector sub(PVector v) {
        x -= v.x;
        y -= v.y;
        z -= v.z;
        return this;
    }

    /**
     * This method subtracts Vector 2 from Vector 1 and binds the components
     * to a new Vector.
     *
     * @param v1 the first vector
     * @param v2 the second vector
     * @return the new vector
     */
    static public PVector sub(PVector v1, PVector v2) {
        return sub(v1, v2, null);
    }

    /**
     * This method subtracts Vector 2 from Vector 1 and binds the components
     * to the target Vector
     *
     * @param v1 the first vector
     * @param v2 the second vector
     * @param target the target vector
     * @return target Vector
     *
     */
    static public PVector sub(PVector v1, PVector v2, PVector target) {
        if(target == null) {
            target = new PVector(v1.x-v2.x, v1.y-v2.y, v1.z-v2.z);
        }
        else {
            target.set(v1.x-v2.x, v1.y-v2.y, v1.z-v2.z);
        }
        return target;
    }
}
