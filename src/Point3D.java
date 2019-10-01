import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float z, float x, float y) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = z;
        return arr;
    }

    @Override
    public String toString() {
        return "String{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z= " + getZ() +
                ", xyz= " + Arrays.toString(getXYZ()) +
                '}';
    }
}
