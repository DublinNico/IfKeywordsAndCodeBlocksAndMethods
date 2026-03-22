public class MethodsPartTwo {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver,score, levelCompleted, bonus);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
        // Method - invoke or call
//        calculateScore(true, 800, 5, 100);
//        calculateScore(true, 10000, 8, 200);
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
                                        // usage means this method is being used now in use
                                        // 4 parameters
        int finalScore = score;

        if (gameOver) { // Same as (gameOver == true)
            finalScore += (levelCompleted * bonus); // += compound assignment operator
            finalScore += 1000; // variable store 1000 to final score
            System.out.println("Your final score was " + finalScore); // Outputs final score + 1000
        }


    }
}