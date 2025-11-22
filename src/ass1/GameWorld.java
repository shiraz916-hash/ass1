package ass1;

public class GameWorld {
	private String name;
	private Player players[];
	private Enemy enemies[];
	private int difficulty;
	
	public GameWorld() {
	    this.name = "Crystalpath";
	    this.difficulty = 1;
	    this.players = new Player[0];  
	    this.enemies = new Enemy[0];    
	}
	public GameWorld(String name, int difficulty) {
	    this.name = name;
	    this.difficulty = difficulty;
	    this.players = new Player[0];
	    this.enemies = new Enemy[0];
	}
	public void addPlayer(Player player) {
	    Player[] newArr = new Player[this.players.length + 1];

	    for (int i = 0; i < players.length; i++) {
	        newArr[i] = players[i];
	    }

	    newArr[newArr.length - 1] = player;

	    this.players = newArr;
	}
	public void printAllPlayers() {
	    for (int i = 0; i < players.length; i++) {
	        System.out.println(players[i]);
	        System.out.println();
	    }
	}
	public int getTotalValueOfWorld() {
	    int sum = 0;

	    for (int i = 0; i < players.length; i++) {
	        sum += players[i].calculateInventoryValue();
	    }

	    return sum;
	}

	@Override
	public String toString() {
	    return "World Name: " + name + "\n" +
	           "Difficulty: " + difficulty + "\n" +
	           "Number of Players: " + players.length + "\n" +
	           "Number of Enemies: " + enemies.length + "\n";
	}

	}

