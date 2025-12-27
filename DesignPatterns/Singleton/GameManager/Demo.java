package GameManager;

public class Demo {
    public static void main(String [] args){
        // Try to get the game manager from different places
        GameManager gm1 = GameManager.getInstance();
        gm1.startGame("Alice");

        System.out.println("Game state: " + gm1.getGameState());

        // Simulate another part of the code accessing the game
        GameManager gm2 = GameManager.getInstance();
        gm2.updateScore(100);
        gm2.updateScore(50);

        System.out.println("Game state: " + gm2.getGameState());

        // Another part of the code
        GameManager gm3 = GameManager.getInstance();
        gm3.nextLevel();
        gm3.updateScore(200);

        System.out.println("Game state: " + gm3.getGameState());

        // Verify they're all the same instance
        System.out.println("\nAre gm1 and gm2 the same? " + (gm1 == gm2));
        System.out.println("Are gm2 and gm3 the same? " + (gm2 == gm3));

        // Try starting a new game
        System.out.println("\n=== Starting new game ===");
        gm1.startGame("Bob");
        System.out.println("Game state: " + gm1.getGameState());
    }
}
