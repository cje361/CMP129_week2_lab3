
public class CelsiusTable {
    public static void main(String[] args) {
        int Fahrenheit=20;
        for (int i = 0; i <= 20 ; i++){
            double Celsius = 0.55556 * (Fahrenheit - 32);
            System.out.println("Fahrenheit = " + Fahrenheit + "\nCelsius = " + Celsius);
            Fahrenheit--;
        }
            
        
    }
}
