class Starbuzz{
	public static void main(String[] args){
		new Starbuzz().go();
	}
	
	void go(){
		BlackCoffe cof = new BlackCoffe();
		Mocha moc = new Mocha(cof);
		Whip w = new Whip(moc);
		
		System.out.println(w.getDescription() + "\n cost: " + w.cost() + "$ dollars");
	}
}