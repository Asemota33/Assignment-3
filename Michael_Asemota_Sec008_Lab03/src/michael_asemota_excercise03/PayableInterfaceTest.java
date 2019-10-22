package michael_asemota_excercise03;

// Employees polymorphically.

public class PayableInterfaceTest {
	public static void main(String[] args) {

		Payable[] payableObjects = new Payable[] { new Invoice("01234", "seat", 2, 375.00),
				new Invoice("56789", "tire", 4, 79.95), 
				new SalariedEmployee("John", "Smith", 001, 800.00),
				new CommissionEmployee("Lisa", "Barnes", 002, 1200.00, 0.10),
				new BasePlusCommissionEmployee("John", "Doe", 003, 5000, 0.1, 200),
				new HourlyEmployee("Hello", "World", 004, 22.00, 14) };

		System.out.println("Invoices and Employees processed polymorphically:");

		for (Payable currentPayable : payableObjects) {
			
			System.out.printf("%n%s %npayment due: $%,.2f%n", currentPayable.toString(), 
					currentPayable.getPaymentAmount());
		}

		System.out.println("\nEmployees who receive a raise:");
		System.out.println("---------------------------------");

		for (Payable currentPayable : payableObjects) {
			if (currentPayable instanceof BasePlusCommissionEmployee) {
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable;

				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				System.out.printf("%n%s %npayment due: $%,.2f%n", employee.toString(), 
						employee.getPaymentAmount());
				System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
			}
			else if (currentPayable instanceof HourlyEmployee) {
				HourlyEmployee employee1 = (HourlyEmployee) currentPayable;
				employee1.setHourlyRate(2 + employee1.getHourlyRate());
				System.out.printf("%n%s %npayment due: $%,.2f%n", employee1.toString(), 
						employee1.getPaymentAmount());
				System.out.printf("new hourly rate with $2 increase is: $%,.2f%n", employee1.getHourlyRate());

			}
			else {
				System.out.printf("%n%s %npayment due: $%,.2f%n", currentPayable.toString(), 
						currentPayable.getPaymentAmount());
			}

		}
	}
}
