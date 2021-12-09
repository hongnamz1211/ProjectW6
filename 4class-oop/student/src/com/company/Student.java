package com.company;

public class Student {
    String name;
    int age;
    String gender;
    String add;
    double diemToan, diemVan, diemAnh;

    public Student() {
    }

    public Student(String name, int age, String gender, String add, double diemToan, double diemVan, double diemAnh) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.add = add;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
    }
    public double diemTrungBinh() {
        return (diemToan + diemVan + diemAnh) / 3;
    }
    public String[] students(String[] arrStudent) {
        
    }
}
