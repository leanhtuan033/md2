package Kethua.CircleCylinder;

public class main {
    public static void main(String[] args) {
        Circle c = new Circle(5, "xanh");
        System.out.println(c);
        System.out.println("Diện tích: " + c.getArea());

        System.out.println("------------------");

        Cylinder cy = new Cylinder(5, "xanh", 10);
        System.out.println(cy);
        System.out.println("Thể tích: " + cy.getVolume());

    }
}
