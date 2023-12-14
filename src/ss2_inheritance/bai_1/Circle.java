package ss2_inheritance.bai_1;

public class Circle {
    private double r;
    private String color;

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color =color;
    }
   public double getArea(){
        return r*r;
   }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", color='" + color + '\'' +
                ", area='" + getArea() + '\'' +
                '}';
    }


}
