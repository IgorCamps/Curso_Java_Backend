import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        double[] media = new double[n];

        for(int i=0; i<n; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);

            nome[i] = sc.nextLine();
            
            nota1[i] = sc.nextDouble();
           
            nota2[i] = sc.nextDouble();
            sc.nextLine();

            media[i] = nota1[i] + nota2[i];
        }

        System.out.println("Alunos Aprovados:");
        for(int i = 0; i < n; i++){
            if (media[i]/ 2 >= 6) {
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}
