import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numero voce vai digitar? ");
        int N = sc.nextInt();

        double[] vet = new double[N];
        double soma = 0.0, media = 0.0;

        for(int i = 0; i < vet.length ; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }
        System.out.print("VALORES = ");
        for(int i = 0; i < N; i++) {
            System.out.print(vet[i] + " ");
        }
       
        media = soma / vet.length;
        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}
