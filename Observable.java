import java.util.ArrayList;
import java.util.Iterator;

class Observable implements QuackObservable {
	ArrayList<Observer> observers  = new ArrayList<Observer>();
	QuackObservable duck;
	
	public Observable(QuackObservable duck){
		this.duck = duck;
	}
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	public void notifyObservers(){
		
		for(Observer o : observers){
			o.update(duck);
		}
	}
}