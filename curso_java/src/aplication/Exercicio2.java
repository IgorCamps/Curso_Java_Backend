package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee funcionario = new Employee();
		
		System.out.print("Name: ");
		funcionario.Name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		funcionario.GrossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		funcionario.Tax = sc.nextDouble();
				
		System.out.println("Employee: " + funcionario);
		
		System.out.println("Which percentage to increase salary?");
		double increase;
		increase = sc.nextDouble();
		funcionario.IncreaseSalary(increase);
		
		System.out.println("updated data: " + funcionario);
		
		
		sc.close();
	}

}
