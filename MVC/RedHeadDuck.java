class RedHeadDuck implements Quackable{
	Observable observable;
	
	public RedHeadDuck() {
		observable = new Observable(this);
	}
	
	
	public void quack(){
		System.out.println("red quack");
		notifyObservers();
	}
	
	
	public void registerObserver(Observer observer){
		observable.registerObserver(observer);
	}
	
	
	public void notifyObservers(){
		observable.notifyObservers();
	}
}