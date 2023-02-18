package com.csc205.project2;

//might need to remove extends.
public class Cone extends Shape {

    private double height;
    private double radius;

    //sets radius and height to 0.0 because there is a difference between 0 and 0.0
    public Cone() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cone(double v, double x) {
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


    //might lead to a problem not sure.
    public void setHeight(double height_2 ) {

        this.height = height_2;
    }


    public void setRadius(double radius_2 ) {

        this.radius = radius_2;
    }

    //A=πr(r+h2+r2)
    public double surfaceArea() {
      return  (Math.PI * radius) * (radius + Math.sqrt(Math.pow(height,2 ) + Math.pow(radius,2)));

    }

    //πr2h
    public double volume() {

        return (Math.PI * Math.pow(radius, 2) * (height / 3));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("The height is:").append(height);
        sb.append(", The radius is:").append(radius);
        sb.append(", The surface area is:").append(surfaceArea());
        sb.append(", The volume is:").append(volume());
        sb.append('}');
        return sb.toString();
    }





}
