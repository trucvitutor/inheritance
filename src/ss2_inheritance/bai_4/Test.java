package ss2_inheritance.bai_4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap cạnh 1:" );
        double side1=Double.parseDouble(scanner.nextLine());
        System.out.println("nhap cạnh 2:" );
        double side2=Double.parseDouble(scanner.nextLine());
        System.out.println("nhap cạnh 3:" );
        double side3=Double.parseDouble(scanner.nextLine());
        System.out.println("nhap màu sắc:" );
        String color=scanner.nextLine();
        Shape shape = new Triangle(color,side1,side2,side3);
        System.out.println(shape);
    }
}
