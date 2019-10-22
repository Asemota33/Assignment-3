package michael_asemota_excercise02;

public class SalariedEmployee extends Employee{
	double weeklySalary;
	
	public double getSalary() {return weeklySalary;}

	public void setSalary(double sal) {
		if (sal < 0){
			System.out.print("The hourly rate is too low\n");
		}
			else {
				weeklySalary = sal;
			}
		}
	
	
	public SalariedEmployee(String lname, String fname, int empId, double sal) {
		super(lname, fname, empId);
		setSalary(sal);
}
	
	@Override
	public double getPaymentAmount() {
		return weeklySalary;
	}
	@Override
	public String toString() {
		return String.format("%s\nWeekly Salary: $%s\n" , 
				super.toString(), weeklySalary);
	}
}
