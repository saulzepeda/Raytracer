/**
 * [1968] - [2020] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package up.edu.isgc.raytracer.objects;

import up.edu.isgc.raytracer.IIntersectable;
import up.edu.isgc.raytracer.Vector3D;

import java.awt.*;

/**
 * @author Jafet Rodríguez
 * @author Saúl Zepeda
 */
public abstract class Object3D implements IIntersectable {

    private Vector3D position;
    private Color color;
    private double CONST_AMBIENT;
    private double CONST_DIFFUSE;
    private double CONST_SPECULAR;
    private double CONST_REFLECTION;
    private double N_Value;

    public double getN_Value() {
        return N_Value;
    }

    public void setN_Value(double n_Value) {
        N_Value = n_Value;
    }

    public double getCONST_REFLECTION() {
        return CONST_REFLECTION;
    }

    public void setCONST_REFLECTION(double CONST_REFLECTION) {
        this.CONST_REFLECTION = CONST_REFLECTION;
    }

    public double getCONST_AMBIENT() {
        return CONST_AMBIENT;
    }

    public void setCONST_AMBIENT(double CONST_AMBIENT) {
        this.CONST_AMBIENT = CONST_AMBIENT;
    }

    public double getCONST_DIFFUSE() {
        return CONST_DIFFUSE;
    }

    public void setCONST_DIFFUSE(double CONST_DIFFUSE) {
        this.CONST_DIFFUSE = CONST_DIFFUSE;
    }

    public double getCONST_SPECULAR() {
        return CONST_SPECULAR;
    }

    public void setCONST_SPECULAR(double CONST_SPECULAR) {
        this.CONST_SPECULAR = CONST_SPECULAR;
    }

    public Vector3D getPosition() {
        return position;
    }

    public void setPosition(Vector3D position) {
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Object3D(Vector3D position, Color color) {
        setPosition(position);
        setColor(color);
    }

    public Object3D(Vector3D position, Color color, double CONST_AMBIENT, double CONST_DIFFUSE, double CONST_SPECULAR,
                    double CONST_REFLECTION, double N_Value) {
        setPosition(position);
        setColor(color);
        setCONST_AMBIENT(CONST_AMBIENT);
        setCONST_DIFFUSE(CONST_DIFFUSE);
        setCONST_SPECULAR(CONST_SPECULAR);
        setCONST_REFLECTION(CONST_REFLECTION);
        setN_Value(N_Value);
    }

}
