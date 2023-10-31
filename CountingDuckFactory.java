public class CountingDuckFactory extends AbstractDuckFactory {
	
	public Quackable createWhiteDuck(){
		return new CounterQuack (new WhiteDuck());
	}
	
	public Quackable createHunterDuck() {
		return new CounterQuack (new HunterDuck());
	}
}
	