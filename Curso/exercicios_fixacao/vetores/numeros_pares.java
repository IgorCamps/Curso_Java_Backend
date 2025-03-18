import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();

        int[] vet = new int[N];
        int qtpares = 0;

        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");
        for(int i = 0; i < vet.length; i++){
            if(vet[i] % 2 == 0){
                System.out.print(vet[i] + " ");
                qtpares++;        
            }
            
        }
        System.out.printf("\n");
        System.out.printf("QUANTIDADE DE PARES = %d\n", qtpares);

        sc.close();
    }
}
