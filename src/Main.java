public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(5 ,6);
        System.out.println(point2D);

        point2D.getXY();
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(1,2,3);
        System.out.println(point3D);
        System.out.println(point3D.toString());
    }
}
