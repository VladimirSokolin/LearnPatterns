public class CounterQuack implements Quackable {
	Quackable duck;
	static int countQuack;
	
	CounterQuack(Quackable duck){
		this.duck = duck;
	}
	
	public void quack(){
		duck.quack();
		countQuack++;
	}
	
	static int getQuacks(){
		return countQuack;
	}
}