package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        /*ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);

        shapes.forEach(System.out::println);*/

        /*
        The following code works with the code given.
         */


        //inputs cone
        ThreeDimensionalShape cone = new Cone(5.0, 1.0);

        //inputs Sphere
        ThreeDimensionalShape sphere = new Sphere(2.0);


        //inputs cube
        ThreeDimensionalShape cube = new Cube(5.0);

        //inputs cylinder
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);

        //inputs cuboid
        ThreeDimensionalShape cuboid = new Cuboid(4.0, 1.0,10);

        // gets List and adds the different shapes to the array.
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(cone);
        shapes.add(cuboid);
        //outputs the shape's information
        shapes.forEach(System.out::println);





    }

}

