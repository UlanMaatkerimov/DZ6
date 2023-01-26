package com.javalesson6;

public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss(40, 400, new Weapon("Laser", "Gun"));
        Skeleton skeleton1 = new Skeleton(10, 100, new Weapon("Bounce ", "Pistol"));
        Skeleton skeleton2 = new Skeleton(5, 50, new Weapon("Bounce1 ", "Pistol2"));


        System.out.println(boss1.printlnfo());
        System.out.println(skeleton1.printlnfo());
        System.out.println(skeleton2.printlnfo());
    }





}