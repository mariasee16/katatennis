package game;

/**Score Values Enumeration */
public enum ScoreValues {
	lOVE(0,"0"),
	FIFTHEEN(1,"15"),
	THIRTHY(2,"30"),
	FORTY(3,"40"),
	ADVANTAGE(4,"40AV"),
	WIN(5,"WIN");
	
	private final int value;
	private String name ="";
	
	ScoreValues(final int val, String n){
		this.value = val;
		this.name = n;
	}
	
	public int getValue(){
		return value;
	}
	
	@Override
	public String toString(){
		return name;
	}

}
