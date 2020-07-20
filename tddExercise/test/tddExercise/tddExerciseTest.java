package tddExercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


import org.junit.jupiter.api.Test;




class tddExerciseTest {
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
												//ENUM TEST'S
	@Test
	public void checkSellTax() {
		//fail();
		double actual= TaxValues.TAX_RATE.getValues();
		double expected=0.1;
		assertEquals(actual,expected,0.01);
	}
	
	
	@Test
	public void checkImportedTax() {
		//fail();
		double actual= TaxValues.IMPORT_RATE.getValues();
		double expected=0.05;
		assertEquals(actual,expected,0.01);
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

													//ITEMS
	
	@Test
	public void checkIfItemNameIsCorrect() {
		Item item= new Item("burger", 10.0, false, false);
		String actual = item.getItemName();
		String expected= "burger";
		assertEquals(actual,expected);
	}
	
	@Test
	public void checkIfItemPriceIsCorrect() {
		Item item= new Item("burger", 10.0, false, false);
		double actual = item.getItemIprice();
		double expected= 10.0;
		assertEquals(actual,expected,0.01);		
	}
	
	@Test
	public void checkIfTaxableWorks() {
		Item item= new Item("burger", 10.0, true, true);
		boolean actual= item.taxable();
		assertEquals(actual,true);
	}
	@Test
	public void checkImportedWorks() {
		Item item= new Item("burger", 10.0, true, true);
		boolean actual= item.imported();
		assertEquals(actual,true);
	}
	
	@Test
	public void checkAddItemsToTransaction() {
		Transaction trans= new Transaction();
		Item item= new Item("burger", 10.0, true, true);
		trans.addItems(item);
		if(trans.toString().length()>=1) {
			assertTrue(true);
		}else {
			fail();
		}		
	}


	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
													//TAXVALUES
	@Test
	public void checkIfItemHasCorrectTaxes() {
		Item item= new Item("burger", 10.0, true, false);
		double salesTax=0.10;
		double expected=10*salesTax;
		double actual=item.getTax();
		assertEquals(actual,expected,0.01);
	}
	
	@Test
	public void checkIfItemHasCorrectPrice() {
		Item item= new Item("burger", 10.0, true, false);
		double expected= 11;
		double myItemTax=item.getTax();
		double actual=item.getItemIprice()+myItemTax;
		assertEquals(actual,expected,0.01);	
	}
	
	@Test
	public void checkIfSetTaxWorks() {
		Item item= new Item("burger", 10.0, true, true);
		double firstItemTax=item.setTax();
		assertEquals(firstItemTax,11.5,0.01);
	}
	
}




