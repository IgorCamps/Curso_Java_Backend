package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        // String x;
        // x = sc.next();
        // System.out.println("Você digitou: " + x);

        // int y;
        // y = sc.nextInt();
        // System.out.println("Você digitou: " + y);

        // double z;
        // z = sc.nextDouble();
        // System.out.println("Você digitou: " + z);

        // char c;
        // c = sc.next().charAt(0);
        // System.out.println("Você digitou: " + c);

        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        sc.close();
    }
}
