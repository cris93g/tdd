package tddExercise;

//pulls the data from abstract class to make it easier to create an item;
public class Item extends ItemCreator {
	public Item(String name, double value, boolean taxable, boolean isImported) {
		super(name, value, taxable, isImported);
	}
}
