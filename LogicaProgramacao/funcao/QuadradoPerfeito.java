package funcao;

public class QuadradoPerfeito {

    public static boolean ehQuadradoPerfeito(int n) {
        if (n < 0) {
            return false;
        }

        int raiz = (int) Math.sqrt(n);
        return raiz * raiz == n;
    }
    public static void main(String[] args) {
        System.out.println(ehQuadradoPerfeito(1));  // true
        System.out.println(ehQuadradoPerfeito(4));  // true
        System.out.println(ehQuadradoPerfeito(9));  // true
        System.out.println(ehQuadradoPerfeito(8));  // false
    }

}
