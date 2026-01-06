package funcao;

public class IMC {

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    public static void main(String[] args) {
        double imc = calcularIMC(70.0, 1.75);
        System.out.println("IMC: " + imc);
    }

}
