package michael_asemota_excercise02;

public class HourlyEmployee extends Employee{


		double hoursWorked;
		double hourlyRate;
		
		public double getHoursWorked() {return hoursWorked;}
		public double getHourlyRate() {return hourlyRate;}

		public void setHourlyRate(double hRate) {
			if (hRate < 14){
				System.out.print("The hourly rate is too low\n");
				hourlyRate = 14;
			}
				else {
					hourlyRate = hRate;
				}
			}
		public void setHoursWorked(double hWorked) {
			if (hWorked <= 0) {
				System.out.print("Your hours worked a week cannot be 0 or negative\n");
			}
			else {
				hoursWorked = hWorked;
			}
			
		}
		
		public HourlyEmployee(String lname, String fname, int empId, double hRate, double hWorked) {
			super(lname, fname, empId);
			setHourlyRate(hRate);
			setHoursWorked(hWorked);
	}
		
		@Override
		public double getPaymentAmount() {
			double Pay = hourlyRate * hoursWorked;
			return Pay;
		}
		@Override
		public String toString() {
			return String.format("%s\nHours Worked %s\nHourly Rate: $%s\n" , 
					super.toString(), hoursWorked, hourlyRate);
		}

	}


