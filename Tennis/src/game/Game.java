package game;

import java.util.Random;

/**Tennis Game*/
public class Game {

	/** Players */
	private Player one;
	private Player two;
	
	/**
	 * Constructor
	 * 
	 * @param player 1's name
	 * @param player 2's name
	 */
	public Game(String name1, String name2) {
		this.one = new Player(name1);
		this.two = new Player(name2);
	}
	
	/** Random boolean generation*/
	public boolean serves() {
	    Random random = new Random();
	    return random.nextBoolean();
	}
	
	private void play() {
		while(!endGame()){
			if(serves()) updateScores(one, two);//The first player win the 
			else updateScores(two, one);
			showScores();
		}
	}

	/**
	 * Tennis rules
	 * 
	 * @param set winner Player 
	 * @param set looser Player
	 */
	public void updateScores(Player winner, Player looser) {
		if(looser.getScores() <3 && winner.getScores() == 3)//No advantages 
			winner.setScore(winner.getScores() + 2);
		else if(looser.getScores() == 4 && winner.getScores() == 3)//Looser got the advantage -> loose it! 
			looser.setScore(looser.getScores() - 1);
		else winner.setScore(winner.getScores() + 1); //Normal scoring ;)
		System.out.println(winner.getName() + " scores!");//yeah man ^^
	}
	
	/**Print Scores*/
	public void showScores() {
		System.out.println(one.getName() + " " + one.convertedScore() + ":" + two.convertedScore() + " " + two.getName());
	} 
		
	/**End Game*/	
	private boolean endGame() {
		if(one.win()) {
			System.out.println(one.getName() + " WINS!");
			return true;
		}
		if(two.win()) {
			System.out.println(two.getName() + " WINS!");
			return true;
		} 
		return false;
	}

	/**Main */
	public static void main(String[] args) {
		Game set = new Game("Tsonga","TwoStars");
		System.out.println("Start game!");
		set.play();
	}

}
