package com.csc205.project2;

public class Cylinder extends Shape {

    private double height;
    private double radius;
    //sets everything to 0.0 because there is a difference between 0 and 0.0
    public Cylinder() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double v, double x) {
        super();
        this.height = v;
        this.radius = x;
    }

    public double getHeight() {

        return height;
    }

    public double getRadius() {

        return radius;
    }


    public void setHeight(double height_2 ) {

        this.height = height_2;
    }


    public void setRadius(double radius_2 ) {

        this.radius = radius_2;
    }

    //fix this
    public double surfaceArea() {

        return (2.0 * Math.PI * radius * height) + 2  * Math.PI * Math.pow(radius,2);
    }

    //πr2h
    public double volume() {

        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("The height is:").append(height);
        sb.append(", The radius is:").append(radius);
        sb.append(", The surface area is:").append(surfaceArea());
        sb.append(", The volume is:").append(volume());
        sb.append('}');
        return sb.toString();
    }





}
