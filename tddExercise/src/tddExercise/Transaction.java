package tddExercise;

import java.util.ArrayList;


public class Transaction {
	Item item;
	private double startValue=0;
	private double taxes=0;
	private ArrayList<Item> itemList= new ArrayList<Item>();
	//adds items to the array list
	public void addItems(Item item) {
		this.itemList.add(item);
	}
	//prints to the console total price with taxes
	public void totalPrice() {
		itemList.forEach((item)->{
			startValue+=item.getItemIprice()+item.getTax();
			taxes+=item.getTax();
			System.out.printf("%s price %f %n", item.getItemName(),item.getItemIprice()+item.getTax());
		});
		System.out.printf("Sales Taxes: %f Total: %f %n",taxes,startValue);
	}
	
}
