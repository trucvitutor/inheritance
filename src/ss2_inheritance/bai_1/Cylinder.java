package ss2_inheritance.bai_1;

public class Cylinder extends Circle{
    private double h;

    public Cylinder(double r, String color, double h,double area,double V) {
        super(r, color);
        this.getArea();
        this.h = h;

    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = 4;
    }
    public double getV(){
        return 3.14*(getR()*2)*h;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "h=" + h +","+
                "Area=" + super.getArea() +","+
                "R=" + super.getR() +","+
                "color=" + super.getColor() +","+
                "V=" + this.getV() +
                '}';
    }

    public static void main(String[] args) {
      Cylinder cylinder=new Cylinder(3.5,"blue",6.6,12,2);
        System.out.println(cylinder);
    }
}
