import java.util.Scanner;

public class mais_velho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[n];
        int[] idade = new int[n];

        int mais_velho = 0, indice = 0;

        for(int i=0; i<nome.length; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
           
            System.out.print("idade: ");
            idade[i] = sc.nextInt();

            sc.nextLine();
            
            if(idade[i] > mais_velho){
                mais_velho = idade[i];
                indice = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nome[indice]);

        sc.close();
    }
}
