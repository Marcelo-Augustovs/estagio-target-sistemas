package exercicio3;


public class main {
    public static void main(String[]args){
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            K = K + 1; // igual a K++
            SOMA = SOMA + K; // igual a SOMA += K
        }
        System.out.println(SOMA);
    }
}
