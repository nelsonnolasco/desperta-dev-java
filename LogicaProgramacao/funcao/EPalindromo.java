package funcao;

public class EPalindromo {

    public static boolean e_palindromo(String texto) {
        // normaliza: remove espaços e coloca em minúsculas
        texto = texto.replace(" ", "").toLowerCase();

        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(e_palindromo("arara"));              // true
        System.out.println(e_palindromo("Roma me tem amor"));   // true
        System.out.println(e_palindromo("Programacao"));        // false
    }

}
