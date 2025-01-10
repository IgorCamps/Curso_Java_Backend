package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Transation;

public class contaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter account number: ");
		String accountNumber = sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.print("is there na initial deposit (y/n)? ");
		char deposit = sc.nextLine().charAt(0);	
		
		
		
		Transation conta = new Transation(name, accountNumber, deposit);
		
		if(deposit!= 'n') {
			System.out.print("Enter initial deposit value: ");
			double depositAccount = sc.nextDouble();
			conta.setDepositAccount(depositAccount);
		}
		
		System.out.println(conta.getName());
		
		System.out.println("Account data: ");
		System.out.println(conta.toString());
		
		System.out.print("Enter a deposit value: ");
		double depositAccount = sc.nextDouble();
		
		conta.setDepositAccount(depositAccount);
		
		System.out.print("Update account data: ");
		System.out.println(conta.toString());
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		
		conta.setWitdrawAccount(withdraw);
		
		System.out.println("Account account data: ");
		System.out.println(conta.toString());
		
		sc.close();

	}

}
