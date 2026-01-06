package funcao;

public class Cilindro {

    public static double volumeCilindro(double raio, double altura) {
        double pi = 3.1414592;
        return pi * raio * raio * altura;
    }
    public static void main(String[] args) {
        double volume = volumeCilindro(3.0, 10.0);
        System.out.println("Volume do cilindro: " + volume);
    }

}
