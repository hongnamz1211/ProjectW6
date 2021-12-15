package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(3f,4f);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println("--------");

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(4,5,6);
        System.out.println(point3D);

        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
