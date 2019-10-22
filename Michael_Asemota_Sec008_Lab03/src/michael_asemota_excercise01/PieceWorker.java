package michael_asemota_excercise01;

public class PieceWorker extends Employee {

	private double Wages;
	private int Pieces;
	
	public double getWages() {return Wages;}
	public int getPieces() {return Pieces;}

	public void setWages(double wages) {
		if (wages <= 0){
			System.out.print("The wage is too low\n");
		}
			else {
				Wages = wages;
			}
		}
	public void setPieces(int pieces) {
		if (pieces <= 0) {
			System.out.print("Pieces created cannot be less than 0\n");
		}
		else {
			Pieces = pieces;
		}
		
	}
	
	public PieceWorker(String lname, String fname, int empId, double wages, int pieces) {
		super(lname, fname, empId);
		setPieces(pieces);
		setWages(wages);
}
	
	@Override
	public double earnings() {
		double Pay = Pieces * Wages;
		return Pay;
	}
	@Override
	public String toString() {
		return String.format("%s\nNumber of Pieces: %s\n Wage per Piece: $%s\n" , 
				super.toString(), Pieces, Wages);
	}
}
