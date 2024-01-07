class GooseAdapter implements Quackable {
	WhiteGoose whiteGoose;
	Observable observable;
	
	GooseAdapter(WhiteGoose whiteGoose){
		this.whiteGoose = whiteGoose;
		observable = new Observable(this);
	}
	
	public void quack(){
		whiteGoose.hook();
		notifyObservers();
	}
	
	public void registerObserver(Observer observer){
		observable.registerObserver(observer);
	}
	
	public void notifyObservers(){
		observable.notifyObservers();
	}
}