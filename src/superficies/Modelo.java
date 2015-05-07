/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

/**
 *
 * @author iquintasgonzalez
 */
public class Modelo {

    float sideLength;
    float sideHeight;
    float height;
    float baseLength;
    float radius;
    

    String operacion;

    public Modelo() {
    }

    public Modelo(float sideLength, float sideHeight, float height, float baseLength, float radius, String operacion) {
        this.sideLength = sideLength;
        this.sideHeight = sideHeight;
        this.height = height;
        this.baseLength = baseLength;
        this.radius = radius;
        this.operacion = operacion;
    }

    public float getSideLength() {
        return sideLength;
    }

    public float getSideHeight() {
        return sideHeight;
    }

    public float getHeight() {
        return height;
    }

    public float getBaseLength() {
        return baseLength;
    }

    public float getRadius() {
        return radius;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideHeight(float sideHeight) {
        this.sideHeight = sideHeight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setBaseLength(float baseLength) {
        this.baseLength = baseLength;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    @Override
    public String toString() {
        return "Modelo{" + "sideLength=" + sideLength + ", sideHeight=" + sideHeight + ", height=" + height + ", baseLength=" + baseLength + ", radius=" + radius + ", operacion=" + operacion + '}';
    }
    
}
