public class MarioPlayers extends Items {
    //More than one player may play the same game
    //we have to create different Mario characters that have their own statistics

    private String username;
    private int lives;
    private int totalPoints;
    private int level;

    //constructor 1 - new player
    public MarioPlayers (String username) {
        super(); //player always starts (0,0)
        this.username = username;
        //you cannot start from the middle of the game as a new player so everything is preset
        this.lives = 10;
        this.totalPoints = 0;
        this.level = 0;

    }

    //constructor 2 - saved player in file that we can import to bring in statistics but position always 0 at start
    public MarioPlayers(String username, int lives, int totalPoints, int level) {
        super(); //player always starts (0,0)
        this.username = username;
        this.lives = lives;
        this.totalPoints = totalPoints;
        this.level = level;

    }

    @Override
    public String toString() {
        return ("Username: " + username + "\n" + super.toString() +
                "\nLives: " + lives + "\nPoints: " + totalPoints + "\nLevel: " + level);
    }
}
