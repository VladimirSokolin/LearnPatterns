public class CountingDuckFactory extends AbstractDuckFactory {
	
	public Quackable createHunterDuck(){
		return new CounterQuack ( new HunterDuck());
	}
	
	public Quackable createRedHeadDuck(){
		return new CounterQuack ( new RedHeadDuck());
	}
	
	public Quackable createWhiteDuck(){
		return new CounterQuack ( new WhiteDuck());
	}
	
	public Quackable createRubberDuck(){
		return new CounterQuack ( new RubberDuck());
	}
}

