import java.util.Scanner;

public class PesquisadorDeNumeros {
    private final int TAMANHO_VETOR = 10;
    private int[] vetor = new int[TAMANHO_VETOR];
    private Scanner entrada = new Scanner(System.in);

    public void preencherNumeros() {
        System.out.println("Preencha os números do vetor");
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            vetor[i] = Integer.parseInt(entrada.nextLine());
        }
    }

}
