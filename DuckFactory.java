public class DuckFactory extends AbstractDuckFactory {
	public Quackable createHunterDuck(){
		return new HunterDuck();
	}
	
	public Quackable createRedHeadDuck(){
		return new RedHeadDuck();
	}
	
	public Quackable createWhiteDuck(){
		return new WhiteDuck();
	}
	
	public Quackable createRubberDuck(){
		return new RubberDuck();
	}
}