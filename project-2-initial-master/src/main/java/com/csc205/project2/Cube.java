package com.csc205.project2;

//might need to remove extends.
public class Cube extends Shape {
    private double width;

    //sets width to 0.0 because there is a difference between 0 and 0.0
    public Cube() {
        super();
        this.width = 0.0;
    }

    public Cube(double v) {
        super();
        this.width = v;
    }

    public double getWidth() {

        return width;
    }

    public void setWidth(double widthh) {

        this.width = widthh;
    }

    public double surfaceArea() {

        return 6 * Math.pow(width, 2);
    }

    public double volume() {

        return  Math.pow(width, 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("The width is:").append(width);
        sb.append(", The surface area is:").append(surfaceArea());
        sb.append(", The volume is:").append(volume());
        sb.append('}');
        return sb.toString();
    }


}
