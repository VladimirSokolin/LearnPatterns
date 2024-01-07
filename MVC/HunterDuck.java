class HunterDuck implements Quackable {
	Observable observable;
	
	public HunterDuck() {
		observable = new Observable(this);
	}
	
	public void quack(){
		System.out.println("hunter feee");
		notifyObservers();
	}
	
	public void registerObserver(Observer observer){
		observable.registerObserver(observer);
	}
	
	public void notifyObservers(){
		observable.notifyObservers();
	}
}