import java.util.Scanner;

public class media_pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vet = new int[n];
        int media = 0, par = 0;

        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
            if(vet[i]%2 == 0){
                media += vet[i];
                par++;
            }
        }

        if (media > 0) {
            System.out.println("MEDIA DOS PARES = " + media/par);
        }else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}
