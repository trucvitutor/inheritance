package ss2_inheritance.bai_2;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

//    public Point3D() {
//    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] xyz = {getX(), getY(), z};
        return xyz;
    }

    public void setXYZ(float x, float y, float z) {

    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +","+
                "y=" + super.getY() +","+
                "z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(1.1f,2.2f,3.3f);
        System.out.println(point3D);
    }
}
