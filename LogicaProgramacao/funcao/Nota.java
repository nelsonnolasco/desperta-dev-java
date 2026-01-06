package funcao;

public class Nota {

    public static double calcularMedia(double n1, double n2, double n3, char tipo) {
        if (tipo == 'A' || tipo == 'a') {
            // Média aritmética
            return (n1 + n2 + n3) / 3.0;
        } else if (tipo == 'P' || tipo == 'p') {
            // Média ponderada (pesos 5, 3 e 2)
            return (n1 * 5 + n2 * 3 + n3 * 2) / 10.0;
        } else {
            // Tipo inválido
            return -1;
        }
    }

    public static void main(String[] args) {
        double mediaAritmetica = calcularMedia(8.0, 7.5, 9.0, 'A');
        double mediaPonderada = calcularMedia(8.0, 7.5, 9.0, 'P');

        System.out.println("Média Aritmética: " + mediaAritmetica);
        System.out.println("Média Ponderada: " + mediaPonderada);
    }

}
