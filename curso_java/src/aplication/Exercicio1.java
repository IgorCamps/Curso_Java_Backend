package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle retangulo = new Rectangle();
		
		
		System.out.println("Enter rectangle width and height:");
		retangulo.Width = sc.nextDouble();	
		retangulo.Height = sc.nextDouble();
		
		System.out.println(retangulo);
		
		
		
		sc.close();
	}

}
