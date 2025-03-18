import java.util.Scanner;

public class soma_vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos valores vai ter cada vetor? ");
        int N = sc.nextInt();

        int[] vet1 = new int[N];
        int[] vet2 = new int[N];
        int[] vet3 = new int[N];

        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < vet1.length; i++){
            vet1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < vet2.length; i++){
            vet2[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < vet3.length; i++){
            vet3[i] = vet1[i] + vet2[i];
            System.out.println(vet3[i]);
        }


        sc.close();
    }
}
