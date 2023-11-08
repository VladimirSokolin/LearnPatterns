public class CounterQuack implements Quackable {
	Quackable duck;
	static int countQuack;
	
	Observable observable;
	
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
	
	public void registerObserver(Observer observer){
		duck.registerObserver(observer);
	}
	
	public void notifyObservers(){
		duck.notifyObservers();
	}
}