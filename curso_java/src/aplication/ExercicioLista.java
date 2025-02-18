package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ExercicioLista {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        // PARTE 1 - Lendo os dados:

        System.out.print("Quantos funcionarios serao registrados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Funcionario #" + i + ": ");
            
            System.out.print("Id: ");
            int id = sc.nextInt();

            while (hasId(list, id)) {
                System.out.print("Id sendo usado. Tente novamente!");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Funcionario(id, name, salary));      
        }

        // PARTE 2 - Atualizando salario a partir do Id do funcionario:

        System.out.println();
        System.out.print("Entre com o id do funcionario que recebera aumento: ");
        int id = sc.nextInt();
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.println("Este id nao existe");
        }else{
            System.out.print("Informe a porcentagem: ");
            double percentage = sc.nextDouble();
            emp.IncreaseSalary(percentage);
        }

        // PARTE 3 - Imprimindo os dados:

        System.out.println();
		System.out.println("Lista de funcionarios:");
		for (Funcionario obj : list) {
			System.out.println(obj);
		}


        sc.close();
    }

    public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
