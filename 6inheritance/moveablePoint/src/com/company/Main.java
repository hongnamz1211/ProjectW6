package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point point = new Point();
        System.out.println(point);

        point = new Point(5,8);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(5.5f, 5.2f);
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(5.4f, 5.2f, 6.7f, 2.3f);
        System.out.println(moveablePoint);

        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
