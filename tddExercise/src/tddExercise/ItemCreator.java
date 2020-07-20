package tddExercise;
//abstract class pulls methods from interface
public abstract class ItemCreator implements ItemInterface {

	private String name;
	private double value;
	private boolean taxable,isImported;
	
	public ItemCreator(String name,double value,boolean taxable,boolean isImported) {
		this.name=name;
		this.value=value;
		this.taxable=taxable;
		this.isImported=isImported;
	}
	
	//sets the taxes by pulling from get tax and adding it to initial value
	public double setTax() {
		double fullPrice=getTax();
		return fullPrice+value;
	}
	//gets taxes depending which boolean is true or false than rounds 
	public double getTax() {
		if(taxable==true && isImported==false) {
			double tax=value * TaxValues.TAX_RATE.getValues();
			double initialTax=Math.round(tax * 100.0)/100.0;
			double taxAfterRounding=Math.ceil(initialTax*20)/20;
			return taxAfterRounding;
		}
		if(taxable==true && isImported==true){
			double mainTax=value * TaxValues.TAX_RATE.getValues();
			double impTax=value * TaxValues.IMPORT_RATE.getValues();
			double tax= mainTax+impTax;
			double initialTax=Math.round(tax * 100.0)/100.0;
			double taxAfterRounding=Math.ceil(initialTax*20)/20;
			return taxAfterRounding;
		}
		if(taxable==false && isImported==true){
			double tax=value * TaxValues.IMPORT_RATE.getValues();
			double initialTax= Math.round(tax * 100.0)/100.0;
			double taxAfterRounding=Math.ceil(initialTax*20)/20;
			return taxAfterRounding;
		}
			return 0;
	}
	
	
	@Override
	public String getItemName() {
		return this.name;
	}

	@Override
	public void setItemName(String name) {
		this.name=name;
		
	}

	@Override
	public double getItemIprice() {
		return this.value;
	}

	@Override
	public void setPrice(double value) {
		this.value=value;
		
	}

	@Override
	public boolean taxable() {
		return this.taxable;
	}

	@Override
	public boolean imported() {
		return this.isImported;
	}

	
}
