package com.csc205.project2;

public class Cuboid extends Shape {

    private double height;
    private double length;
    private double width;
    //sets the height, length and width to 0.0 because 0 and 0.0 are different.
    public Cuboid() {
        super();
        this.height = 0.0;
        this.length = 0.0;
        this.width  = 0.0;
    }

    public Cuboid(double v, double x, double z) {
        super();
        this.height = v;
        this.length = x;
        this.width = z;
    }

    public double getHeight() {

        return height;
    }

    public double getWidth() {

        return width;
    }


    public double getLength() {

        return length;
    }



    public void setHeight(double height_2 ) {

        this.height = height_2;
    }


    public void setWidth(double width_2 ) {

        this.width = width_2;
    }

    public void setLength(double length_2 ) {

        this.length = length_2;
    }


   // 2 * (length * width + length * height + width * height);
    public double surfaceArea() {

        return  2 * (length * width + length * height + width * height);

    }

    // l * W * H
    public double volume() {

        return length * width * height;
    }

    //For fun cuboid diagonal space code.
    public double spaceDiagonal() {

        return Math.sqrt(length*length + width*width + height*height);
    }







    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuboid {");
        sb.append("The height is:").append(height);
        sb.append(", The width is:").append(width);
        sb.append(", The length is:").append(length);
        sb.append(", The space diagonal is:").append(spaceDiagonal());
        sb.append(", The surface area is:").append(surfaceArea());
        sb.append(", The volume is:").append(volume());
        sb.append('}');
        return sb.toString();
    }

























}
