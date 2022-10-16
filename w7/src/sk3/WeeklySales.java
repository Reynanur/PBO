package sk3;

import java.util.Scanner;

public class WeeklySales {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System .out.println("How many sales person? ");
		
		int size = scan.nextInt();
		Salesperson[] salesStaff = new Salesperson[size];
		
		for(int i=0; i<size; i++) {
			System.out.print("\nFirst name [" + i + "] : ");
			String firstName = scan.next();
			System.out.print("\nLast name [" + i + "] : ");
			String lastName = scan.next();
			System.out.print("\nTotal sales [" + i + "] : ");
			int totalSales = scan.nextInt();
			
			salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
		}
	
		Sorting.selectionSort(salesStaff);
		
		System.out.println("\nRanking of Sales for the Week\n");
		
		for(Salesperson s : salesStaff)
			System.out.println(s);
		scan.close();
	}
}
