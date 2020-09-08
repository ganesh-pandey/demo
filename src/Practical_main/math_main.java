package Practical_main;

import Practical.compelete;

public class math_main {
    public static void main(String[] args) {
        // we are going to excesses or (using java heristance) the one class from another class by extends keyword
        compelete com =new compelete();
        System.out.println(com.divvide(20,10));//excesses the value of divide method from compelete by java inheristance
        System.out.println(com.add(10,20));//excesses the value of add method from math by java inheristance
        System.out.println(com.mul(10,10));//excesses the value of mul method from math by java inheristance
        System.out.println(com.cube(10));//first we excesses the class power in math (by extend )then in math main
        System.out.println(com.square(20));//first we excesses the class power in math (by extend )then in math main

    }
}
