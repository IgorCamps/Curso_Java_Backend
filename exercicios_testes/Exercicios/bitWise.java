package Exercicios;
import java.util.Scanner;

public class bitWise {
    public static void main(String[] args) {
        // int a = 80;
        // int b = 32;
        // System.out.println(a & b);
        Scanner sc = new Scanner(System.in);

        int mask = 0b100000;
        int n = sc.nextInt();

        if ( (n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false!");
        }
        
        sc.close();
    }
}
