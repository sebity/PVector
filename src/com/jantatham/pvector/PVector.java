package com.jantatham.pvector;

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
