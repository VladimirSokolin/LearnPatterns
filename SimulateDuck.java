class SimulateDuck{
	public static void main(String[] args){
		SimulateDuck simulateDuck = new SimulateDuck();
		simulateDuck.simulate();
		
	}
	
	void simulate(){
		Quackable redHeadDuck = new CounterQuack(new RedHeadDuck());
		Quackable whiteDuck = new CounterQuack(new WhiteDuck());
		Quackable rubberDuck = new CounterQuack(new RubberDuck());
		Quackable hunterDuck = new CounterQuack(new HunterDuck());
		Quackable goose = new GooseAdapter(new WhiteGoose());
		
		simulate(redHeadDuck);
		simulate(whiteDuck);
		simulate(rubberDuck);
		simulate(hunterDuck);
		simulate(goose);
		
		System.out.println("counter: " + CounterQuack.getQuacks());
		
	}
	
	void simulate(Quackable duck){
		duck.quack();
	}
	
}