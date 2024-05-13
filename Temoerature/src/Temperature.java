public class Temperature {
    private double value ;
    private char scale;

    public Temperature (double value, char scale){
        this.scale = scale;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public char getScale() {
        return scale;
    }
    public double  celsiusToFahrenheit(){ // C sang F
        return  (9.0 / 5) * value + 32 ;
    }
    public double fahrenheitToCelsius(){
        return (value - 32) *(5.0 / 9) ;
    }

    public void display () {
        System.out.println(value + "\t" + scale );
    }
}
