public class Main {
    public static void main(String[] args) {
        Temperature temp1 = new Temperature(26, 'C');
        Temperature temp2 = new Temperature(75, 'F');

        temp1.display(); // In ra: 25 C
        temp2.display(); // In ra: 75 F

        System.out.println("Temp1 sang  F: " + temp1. celsiusToFahrenheit());
        System.out.println("Temp2 sang độ C: " + temp2. fahrenheitToCelsius());
    }

}