package funcao;

public class TesteMaior {

    public static int maior(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int resultado = maior(10, 25);
        System.out.println("Maior valor: " + resultado);
    }
}

