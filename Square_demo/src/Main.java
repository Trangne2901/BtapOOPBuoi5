
public class Main {
    public static void main(String[] args){
        Square s1 = new Square (10);
        Square s2 = new Square (10);
        int area = s1.getArea();
        int area2 = s2.takeArea();
        System.out.println("Diện tích :" + area);
        System.out.println("Chu vi là : " + area2 );
    }
}