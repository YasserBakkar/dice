package dice;
/**
 * @190315091
 * @author Yaser Beker
 */
public class Game {
    
    public int playerAScore = 0; //Player A Score
    public int playerBScore = 0; //Player B Score
    public int round; 

    
    //The function that performs operations and tests conditions
    void round(int maximumScore) {
        System.out.println("*** Roll the die for round " + round + " ***");

        int playerARoll = (int) ((Math.random() * 6) + 1); 

        int playerBRoll = (int) ((Math.random() * 6) + 1);

        System.out.println("player A has " + playerARoll + " and player B has " + playerBRoll);

        if (playerARoll == playerBRoll) {
            playerAScore += playerARoll;
            playerBScore += playerBRoll;
        } else if (playerARoll > playerBRoll) {
            playerAScore += playerARoll;
            playerBScore += playerBRoll;
        } else {
            playerBScore += playerBRoll;
            playerAScore += playerARoll;
        }
        if (playerAScore % 10 == 0 && playerBScore % 10 == 0) {
            playerAScore += 2;
            playerBScore += 2;
        }
        if (isPrime(playerAScore) && isPrime(playerBScore) ) {
            playerAScore += -1 ;
            playerBScore += -1 ;
        }
        if (playerAScore >= maximumScore || playerBScore >= maximumScore) {
            return;
        }
        round++;
        round(maximumScore);
    }
    //To find out if the Score is prime or not
    public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}