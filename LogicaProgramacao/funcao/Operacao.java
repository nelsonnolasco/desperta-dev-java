package funcao;

public class Operacao {
    public static double calcular(double a, double b, char operador) {
        switch (operador) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    return 0; // evita divisão por zero
                }
            default:
                return 0; // operador inválido
        }
    }
    public static void main(String[] args) {
        System.out.println(calcular(10, 5, '+')); // 15
        System.out.println(calcular(10, 5, '-')); // 5
        System.out.println(calcular(10, 5, '*')); // 50
        System.out.println(calcular(10, 5, '/')); // 2
    }

}
