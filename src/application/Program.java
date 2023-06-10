package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos contribuintes voc� vai digitar? ");
		n = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.printf("Digite os dados do %do contribuinte:\n", i+1);
			System.out.print("Renda anual com sal�rio: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com presta��o de servi�o: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalTax = sc.nextDouble();
			System.out.print("Gastos m�dicos: ");
			double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educationSpending = sc.nextDouble();
			TaxPayer person = new TaxPayer(salaryIncome, servicesIncome, capitalTax, healthSpending, educationSpending);
			list.add(person);
		}
		
		for (int i=0; i<list.size(); i++) {
			System.out.println();
			System.out.printf("Resumo do %do contribuinte:\n", i+1);
			System.out.print(list.get(i));
		}
		
		sc.close();
	}
}



















