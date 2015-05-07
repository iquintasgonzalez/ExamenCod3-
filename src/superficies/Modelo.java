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
    float squareArea;
    float rectangleArea;
    float triangleArea;
    float circleArea;
    
    String operacion;

    public Modelo() {
    }

    public Modelo(float sideLength, float sideHeight, float height, float baseLength, float radius, float squareArea, float rectangleArea, float triangleArea, float circleArea, String operacion) {
        this.sideLength = sideLength;
        this.sideHeight = sideHeight;
        this.height = height;
        this.baseLength = baseLength;
        this.radius = radius;
        this.squareArea = squareArea;
        this.rectangleArea = rectangleArea;
        this.triangleArea = triangleArea;
        this.circleArea = circleArea;
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

    public float getSquareArea() {
        return squareArea;
    }

    public float getRectangleArea() {
        return rectangleArea;
    }

    public float getTriangleArea() {
        return triangleArea;
    }

    public float getCircleArea() {
        return circleArea;
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

    public void setSquareArea(float squareArea) {
        this.squareArea = squareArea;
    }

    public void setRectangleArea(float rectangleArea) {
        this.rectangleArea = rectangleArea;
    }

    public void setTriangleArea(float triangleArea) {
        this.triangleArea = triangleArea;
    }

    public void setCircleArea(float circleArea) {
        this.circleArea = circleArea;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    @Override
    public String toString() {
        return "Modelo{" + "sideLength=" + sideLength + ", sideHeight=" + sideHeight + ", height=" + height + ", baseLength=" + baseLength + ", radius=" + radius + ", squareArea=" + squareArea + ", rectangleArea=" + rectangleArea + ", triangleArea=" + triangleArea + ", circleArea=" + circleArea + ", operacion=" + operacion + '}';
    }
    

}
