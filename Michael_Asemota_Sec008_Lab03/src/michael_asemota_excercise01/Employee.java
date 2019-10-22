package michael_asemota_excercise01;

//This class cannot be instantiated
//Can also have non abstract method as well
// Only abstract classes can have abstract methods
public abstract class Employee {

	int employeeId;
	String firstName;
	String lastName;
	
	public int getEmployeeId() {return employeeId;}
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	

	public Employee(String lname, String fname, int empId) {
		if (fname == null || fname == "") {
			System.out.print("Please enter a valid first name\n");
		}
		else {
			firstName = fname;
		}
		if (lname == null || lname == "") {
			System.out.print("Please enter a valid last name\n");
		}
		else {
			lastName = lname;
		}
		if (empId > 0) {
			employeeId = empId;
		}
		else {
			System.out.print("Please enter a valid employee ID");
		}
}
	
	public abstract double earnings(); //this is a abstract method
	
	public String toString() {
		return String.format("%nEmployee ID: %d%nFirst Name: %s%nLast Name: %s%n", employeeId, firstName, lastName);
	}
}



