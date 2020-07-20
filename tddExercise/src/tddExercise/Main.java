package tddExercise;

public class Main {
	public static void main(String[] args) {
		
		Transaction trans1= new Transaction();
		Item item1= new Item("harry pbook", 12.49, false, false);
		Item item2= new Item("music cd", 14.99, true, false);
		Item item3= new Item("chocolate bar", 0.85, false, false);
		trans1.addItems(item1);
		trans1.addItems(item2);
		trans1.addItems(item3);
		trans1.totalPrice();
		
		System.out.println("///////////////////////////");
		
		Transaction trans2= new Transaction();
		Item item4= new Item("imported chocolate", 10.00, false,true);
		Item item5= new Item("imported perfume", 47.50, true, true);
		trans2.addItems(item4);
		trans2.addItems(item5);		
		trans2.totalPrice();
		
		System.out.println("///////////////////////////");
		Transaction trans3= new Transaction();
		Item item6= new Item("imported perfume", 27.99, true,true);
		Item item7= new Item("perfume", 18.99, true, false);
		Item item8= new Item("headache pills", 9.75, false, false);
		Item item9= new Item("imported chocolates", 11.25,false, true);
		trans3.addItems(item6);
		trans3.addItems(item7);	
		trans3.addItems(item8);
		trans3.addItems(item9);	
		trans3.totalPrice();
		
		
	}
}