public class MethodsWithReturnType {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next highScore is " +
        calculateScore(gameOver, score, levelCompleted, bonus));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // A return statement returns control to the invoker of a method
        // To return a value back from a method - declared int
        int finalScore = score;

        if (gameOver) { // Same as (gameOver == true)
            finalScore += (levelCompleted * bonus); // += compound assignment operator
            finalScore += 1000; // variable store 1000 to final score

        }
        return finalScore;
    }
}