import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int minutos = sc.nextInt();
        double conta = 50.0;

        if(minutos > 100){
            conta += (minutos - 100) * 2.0;
            System.out.printf("Valor a pagar R$%.2f", conta);

        }else  {
            System.out.println("Valor a pagar: R$50.00");
        }

        sc.close();
    }
}
