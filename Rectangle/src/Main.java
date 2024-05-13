import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NHập chiều rộng : ");
        double width = sc.nextDouble();
        System.out.print("NHập chiều dài : ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hình chữ nhật có : " + rectangle.display());
        System.out.println( "Chu vi là :" + rectangle.getPerimeter());
        System.out.println( "Diện tích là : " + rectangle.getArea());
    }

}