package com.csc205.project2;

//might need to remove extends.
public class  Sphere extends Shape {

    private double radius;
    //sets radius to 0.0 because there is a difference between 0 and 0.0
    public Sphere() {
        super();
        this.radius = 0.0;
    }

    public Sphere(double v) {
        super();
        this.radius = v;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append(" The radius is:").append(radius);
        sb.append(", The surface area is:").append(surfaceArea());
        sb.append(", The volume is:").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
