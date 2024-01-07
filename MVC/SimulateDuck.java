import java.util.ArrayList;
import java.util.Iterator;

class SimulateDuck{
	
	Observable observable;
	
	public static void main(String[] args){
		SimulateDuck simulateDuck = new SimulateDuck();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulateDuck.simulate(duckFactory);
		
	}
	
	void simulate(AbstractDuckFactory duckFactory){
		
		

		Quackable redHeadDuck = duckFactory.createRedHeadDuck();
		Quackable whiteDuck = duckFactory.createWhiteDuck();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable hunterDuck = duckFactory.createHunterDuck();
		Quackable goose = new GooseAdapter(new WhiteGoose());
		
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(redHeadDuck);
		flockOfDucks.add(whiteDuck);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(goose);
		
		observable = new Observable(redHeadDuck);
		
		Flock flockOfMallards = new Flock();
		
		Quackable mallardOne = duckFactory.createHunterDuck();
		Quackable mallardTwo = duckFactory.createHunterDuck();
		Quackable mallardThree = duckFactory.createHunterDuck();
		Quackable mallardFour = duckFactory.createHunterDuck();
		
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck Simulator: whole Flock Simulation");
		
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		simulate(flockOfDucks);
		
		System.out.println("counter: " + CounterQuack.getQuacks());
		
	}

	void simulate(Quackable duck){
		duck.quack();
	}
	
}