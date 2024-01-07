public class Mocha extends CoffeeDecorator {
	public Mocha(Beverage b){
		this.b = b;
	}
	
	public double cost(){
		return b.cost() + 0.23;
	}
	
	public String getDescription(){
		return b.getDescription() + ", mocha";
	}
}