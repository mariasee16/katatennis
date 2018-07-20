package game;

/**Tennis Player*/
public class Player {

	/** Player's name */
	private String name;
	
	/** Player's score */
	private int score = 0;//Initial Value
		
	/**
	 * Constructor
	 * 
	 * @param name
	 */
	public Player(String aName) {
		this.name = aName;
	}
	
	/** WIN state */
	public boolean win() {
		if(this.score == 5) return true;
		return false;
	}
	
	/** Converted score */
	public String convertedScore(){
		for (ScoreValues s : ScoreValues.values()) {
				if(this.score == s.getValue()){
					return s.toString();
				}
			}
		return null;
	}
	
	/** Set Score
	 *  
	 * @param aScore
	 */
	public void setScore(int aScore) {
		this.score = aScore;
	}	
	
	/** Get player's name */
	public String getName() {
		return this.name;
	}
	
	/** Get player's score */
	public int getScores() {
		return this.score;
	}
	

}
