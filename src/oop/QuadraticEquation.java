package oop;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
        return 0;
    }
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();


        if (a == 0) {
            System.out.println("Đây không phải phương trình bậc 2");
            return;
        }

        QuadraticEquation eq = new QuadraticEquation(a, b, c);

        double delta = eq.getDiscriminant();
;
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("x1 = " + eq.getRoot1());
            System.out.println("x2 = " + eq.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("x = " + eq.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
