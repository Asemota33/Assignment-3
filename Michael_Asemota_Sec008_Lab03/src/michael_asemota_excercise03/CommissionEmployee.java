package michael_asemota_excercise03;

public class CommissionEmployee extends Employee {


	double grossSales;
	double commissionRate;
	
	public double getGrossSales() {return grossSales;}
	public double getcomissionRate() {return commissionRate;}
	
	public void setCommissionRate(double commRate) {
		if (commRate < 0.1 || commRate > 1 ){
			System.out.println("The Commission rate is out of range\n");
			commissionRate = 0.1;
		}
			else {
				commissionRate = commRate;
			}
		}
	public void setGrossSales(double groSale) {
		if (groSale <= 0) {
			System.out.print("Your gross sales cannot be 0 or negative\n");
		}
		else {
			grossSales = groSale;
		}
		
	}

	public CommissionEmployee(String lname, String fname, int empId, double groSale, double comRate) {
		super(lname, fname, empId); // calls super class constructor
		setCommissionRate(comRate);
		setGrossSales(groSale);
}
	

	@Override
	public double earnings() {
		double commission = commissionRate * grossSales;
		return commission;
	}
	@Override
		public String toString() {
			return String.format("%s%nGross Sales: $%.2f%nCommission Rate: %.2f%n", 
					super.toString(), grossSales, commissionRate);
		}
	}


