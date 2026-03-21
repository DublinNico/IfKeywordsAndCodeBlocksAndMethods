public class Methods {
    public static void main(String[] args) {
        // Method statements form the method body/codeBlock
        // void returns no data from the method
        // Accessible to outside world - Public
        // Static - called directly using the class name

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        // Method
        // Will jump to calculateScore then back to here and continue on precessing below
        // First it will define the lines of variables above 8-13
        calculateScore(true, 800, levelCompleted, bonus);
        // adding arguments. Variable names instead ov values allowed.

        score = 10000;
        levelCompleted = 8; 
        bonus = 200;
        // remove data type so no longer declaration statements
        // and make them assignment statements

        finalScore = score;

        if (gameOver) { // Same as (gameOver == true)
            finalScore += (levelCompleted * bonus); // += compound assignment operator
            System.out.println("Your final score was " + finalScore);
        }
    }

    // New method, has to be outside method above but within class body
    // Call or invoke a method
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { // usage means this method is being used now
        // Method parameters in the declaration - data type, followed by parameter name
        // Parameter/arguments interchangeable names
        // Boolean needs to go first
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int finalScore = score;

        if (gameOver) { // Same as (gameOver == true)
            finalScore += (levelCompleted * bonus); // += compound assignment operator
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}