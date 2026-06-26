package Kethua.Point2DPoint3D;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("===== Point2D =====");

        Point2D p2 = new Point2D();
        System.out.println(p2);

        p2.setXY(10, 20);
        System.out.println(p2);

        System.out.println(Arrays.toString(p2.getXY()));

        System.out.println("\n===== Point3D =====");

        Point3D p3 = new Point3D(1, 2, 3);
        System.out.println(p3);

        p3.setXYZ(5, 6, 7);
        System.out.println(p3);

        System.out.println(Arrays.toString(p3.getXYZ()));
    }
}
