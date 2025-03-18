import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();

        double[] vet = new double[N];
        double maior_valor = 0;
        int posicao = 0;

        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        for(int i = 0; i < vet.length; i++){
            if(vet[i] > maior_valor){
                maior_valor = vet[i];
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior_valor);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);

        sc.close();
    }
}
