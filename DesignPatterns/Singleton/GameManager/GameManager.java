package GameManager;

public class GameManager {
    private static GameManager instance;
    private String playerName;
    private int score;
    private int level;


    private GameManager(){
    }

    public static GameManager getInstance(){
        if (instance == null){
            instance = new GameManager();
        }
        return instance;
    }

    public void startGame(String name){
        this.playerName = name;
        this.score = 0;
        this.level = 1;
    }

    public void updateScore(int points){
        this.score = this.score + points;
    }

    public void nextLevel(){
        this.level = this.level + 1;
    }

    public String getGameState(){
        return "Player: " + this.playerName + ", Score: " + this.score + ", Level: " + this.level;
    }
}
