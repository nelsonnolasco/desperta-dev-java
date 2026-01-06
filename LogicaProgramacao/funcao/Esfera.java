package funcao;

public class Esfera {

    public static double volumeEsfera(double raio) {
        double pi = 3.1414592;
        return (4.0 / 3.0) * pi * raio * raio * raio;
    }
    public static void main(String[] args) {
        double volume = volumeEsfera(5.0);
        System.out.println("Volume da esfera: " + volume);
    }

}
