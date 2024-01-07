public abstract class CoffeeDecorator extends Beverage{
	Beverage b;
	
	public abstract double cost();
	public String getDescription(){
		return b.getDescription();
	}
}