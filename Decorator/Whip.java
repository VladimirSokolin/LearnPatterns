public class Whip extends CoffeeDecorator {
	public Whip(Beverage b){
		this.b = b;
	}
	
	public double cost(){
		return b.cost() + 0.49;
	}
	
	public String getDescription(){
		return b.getDescription() + ", whip";
	}
}