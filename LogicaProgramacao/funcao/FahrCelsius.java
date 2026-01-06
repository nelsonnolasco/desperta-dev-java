package funcao;

public class FahrCelsius {
    public static double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }
    public static void main(String[] args) {
        double c = fahrenheitParaCelsius(98.6);
        System.out.println("Temperatura em Celsius: " + c);
    }


}
