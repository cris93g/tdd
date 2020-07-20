package tddExercise;
//common constants in our project
public enum TaxValues {
	TAX_RATE(.10),
	IMPORT_RATE(.05);
	
	private final double tvalue;
	
	TaxValues(double tvalue){
		this.tvalue=tvalue;
	}
	
	public double getValues() {
		return this.tvalue;
	}
}
