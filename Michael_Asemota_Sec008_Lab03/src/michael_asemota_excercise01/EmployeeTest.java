package michael_asemota_excercise01;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Commission Employee
		CommissionEmployee employee = new CommissionEmployee("Joseph","Dingle",10, 100000,0.1);
		
		//Base Plus Commission Employee
		BasePlusCommissionEmployee employee1 = new BasePlusCommissionEmployee("Michael","Jordan",11, 500, 50, 0.5);

		//Hourly Employee
		HourlyEmployee employee2 = new HourlyEmployee("Asemota","Michael",12, 30, 12);	
		
		//Salaried Employee
		SalariedEmployee employee3 = new SalariedEmployee("Hello","World",13, 4000);
		
		//Piece Worker
		PieceWorker employee4 = new PieceWorker("John","Jones",14, 25, 10);
			
		// Concrete classes are non abstract classes
		Employee[] employeeArray = new Employee[5];
		employeeArray[0] = employee;
		employeeArray[1] = employee1;
		employeeArray[2] = employee2;
		employeeArray[3] = employee3;
		employeeArray[4] = employee4;

		// use enhanced loop to display different employee information
		for(Employee emp : employeeArray) {
			System.out.println(emp);
			System.out.println("Earnings: $" + emp.earnings());
			System.out.println("------------------------------");

		}

	}

}
