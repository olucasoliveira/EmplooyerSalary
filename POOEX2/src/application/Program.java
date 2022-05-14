package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.printf("Nome: ");
		employee.name = sc.nextLine();
		
		System.out.printf("\nSalário bruto: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.printf("\nImposto salario: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Nome: " + employee.name + ", Salario bruto: " + employee.netSalary());
		
		System.out.println("Qual a porcentagem para aumentar no salario ? : ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Dados atualizados: " + employee);
		
		sc.close();
	}

}
