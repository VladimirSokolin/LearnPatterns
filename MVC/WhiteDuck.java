class WhiteDuck implements Quackable {
	Observable observable;
	
	public WhiteDuck() {
		observable = new Observable(this);
	}
	
	public void quack(){
		System.out.println("white quack");
	}
	
	public void registerObserver(Observer observer){
		observable.registerObserver(observer);
	}
	
	
	public void notifyObservers(){
		observable.notifyObservers();
	}
}