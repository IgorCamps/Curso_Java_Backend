import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {
    public static void main(String[] args) {
                 Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        char[] sexo = new char[n];
        double[] altura = new double[n];
        double media = 0.0;

        double menor = 10.0, maior = 0.0;
        int numHomens = 0;
        for(int i=0; i<n; i++){
            System.out.printf("Altura da %do pessoa: ", i + 1);
            altura[i] = sc.nextDouble();

            System.out.printf("Genero da %do pessoa: ", i + 1);
            sexo[i] = sc.next().charAt(0);
            sc.nextLine();

            if(altura[i] > maior) {
                maior = altura[i];
            }
            if (altura[i] < menor){
                menor = altura[i]; 
            } 
            if(sexo[i] == 'M') {
                numHomens++;
            }else {
                media += altura[i];
            }
            
        }

        media /= altura.length - numHomens;
        System.out.println("Menor altura = " + menor);
        System.out.println("Maior altura = " + maior);
        System.out.printf("Media das alturas das mulheres = %.2f\n", media);
        System.out.println("Numero de homens = " + numHomens);

        sc.close();

    }
}
