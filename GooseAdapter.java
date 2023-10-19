class GooseAdapter implements Quackable {
	WhiteGoose whiteGoose;
	
	GooseAdapter(WhiteGoose whiteGoose){
		this.whiteGoose = whiteGoose;
	}
	
	public void quack(){
		whiteGoose.hook();
	}
}