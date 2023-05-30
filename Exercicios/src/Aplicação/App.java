package Aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class App {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter department's name: ");
		String workerDepartment = scan.nextLine();
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String workerName = scan.nextLine();
		System.out.println("Level: ");
		String workerLevel = scan.nextLine();
		System.out.println("Base Salary: ");
		double workerBaseSalary = scan.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary,
				new Department(workerDepartment));
		System.out.println("How many contracts?");
		int n = scan.nextInt();
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Contrato #"+(i+1));
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(scan.next());
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			System.out.println("Duration: ");
			int duration = scan.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, duration);
			worker.addContract(contract);	
		}
		System.out.println("Enter month and year to calculate income(MM/YYYY) ");
		String monthYear = scan.next();
		int month = Integer.parseInt(monthYear.substring(0, 2));
		int year = Integer.parseInt(monthYear.substring(3));
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDepartment());
		System.out.println("Income for "+month+"/"+year+": "+String.format("%.2f", worker.Income(year, month)));

		scan.close();
	}
}
