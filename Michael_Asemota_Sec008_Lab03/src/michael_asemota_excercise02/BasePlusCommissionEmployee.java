package michael_asemota_excercise02;

//relationship is setup between the following classes by use of extends
public class BasePlusCommissionEmployee extends CommissionEmployee{

		double baseSalary;

		public double getBaseSalary() {return baseSalary;}
		
		public void setBaseSalary(double baseSalary) {
			if(baseSalary > 200)
				this.baseSalary = baseSalary;
			else
				this.baseSalary = 200;
		}
//		
		public BasePlusCommissionEmployee(String lname, String fname, int empId, double groSale, double comRate, double bSal) {
//			
			super(lname, fname, empId, groSale, comRate);
			setBaseSalary(bSal);
	}
		
			
		@Override
		public double getPaymentAmount() {
			double commission = super.getPaymentAmount() + baseSalary;
			return commission;
		}
		
		
		public String toString() {
			return String.format("%s \nBase Salary: %.2f", super.toString(), baseSalary);
		}

	}



