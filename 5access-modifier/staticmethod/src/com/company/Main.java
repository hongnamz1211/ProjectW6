package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StaticMethod.change();

        StaticMethod n1 = new StaticMethod(111,"Hoang");
        StaticMethod n2 = new StaticMethod(222,"Nam");
        StaticMethod n3 = new StaticMethod(333,"Khanh");

        n1.display();
        n2.display();
        n3.display();
    }
}
