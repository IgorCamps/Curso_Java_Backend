import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();

        int[] vetor = new int[N];

        for(int i = 0; i < vetor.length ; i++){
            System.out.print("Digite um nuemro: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();

    }
}
