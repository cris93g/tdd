package tddExercise;
//methods that will be used in our project
public interface ItemInterface {
	public String getItemName();
	public void setItemName(String name);
	public double getItemIprice();
	public void setPrice(double value);
	public boolean taxable();
	public boolean imported();
}
