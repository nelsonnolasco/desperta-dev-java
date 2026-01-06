package funcao;
import java.util.Random;
public class GerarSenha {

    public static String gerar_senha(int comprimento) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789";
        Random random = new Random();
        String senha = "";

        for (int i = 0; i < comprimento; i++) {
            int indice = random.nextInt(caracteres.length());
            senha += caracteres.charAt(indice);
        }

        return senha;
    }
    public static void main(String[] args) {
        System.out.println(gerar_senha(8));
        System.out.println(gerar_senha(12));
    }

}
