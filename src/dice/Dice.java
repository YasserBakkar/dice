package dice;
/**
 * @190315091
 * @author Yaser Beker
 */
public class Dice {

    public static void main(String[] args) {

        Game game = new Game();
        game.round(100); //Calling from round method in Game class 
        
        System.out.println("\nThe game is over.");
        if (game.playerAScore >= game.playerBScore) {
            System.out.println("The winner is player A");
        }else if (game.playerAScore == game.playerBScore) {
             System.out.println("The winner is player A And player B");
        }
        else {
            System.out.println("The winner is player B");
        }

        System.out.println("\nHow many rounds of game played?");
        System.out.println("Rounds played: " + game.round);

        System.out.println("\nTotal Score per player:");
        System.out.println("Player A score: " + game.playerAScore);
        System.out.println("Player B score: " + game.playerBScore);
    }
}