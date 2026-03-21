public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

       int finalScore = score;

       if (gameOver) { // Same as (gameOver == true)
           finalScore += (levelCompleted * bonus); // += compound assignment operator
                                                   // finalScore = finalScore + (levelCompleted * bonus)
           System.out.println("Your final score was " + finalScore);
       }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        // remove data type so no longer declaration statements
        // and make them assignment statements

        finalScore = score;

        if (gameOver) { // Same as (gameOver == true)
            finalScore += (levelCompleted * bonus); // += compound assignment operator
            // finalScore = finalScore + (levelCompleted * bonus)
            System.out.println("Your final score was " + finalScore);
        }
    }
}