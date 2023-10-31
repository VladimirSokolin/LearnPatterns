class SimulateDuck{
	public static void main(String[] args){
		SimulateDuck simulateDuck = new SimulateDuck();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulateDuck.simulate(duckFactory);
		
	}
	
	void simulate(AbstractDuckFactory duckFactory){
<<<<<<< HEAD
=======
		Quackable redHeadDuck = duckFactory.createRedHeadDuck();
		Quackable whiteDuck = duckFactory.createWhiteDuck();
		Quackable rubberDuck = duckFactory.createRubberDuck();
>>>>>>> origin/main
		Quackable hunterDuck = duckFactory.createHunterDuck();
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