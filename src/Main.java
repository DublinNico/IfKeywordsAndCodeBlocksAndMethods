public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("Your score was less than 5000"); // Not executed - False
        } else {
            System.out.println("Got here"); // Executed - Condition False
        }

        if (score <= 5000) {
            System.out.println("Your score was less then or equal to 5000"); // Executed - True
        } else {
            System.out.println("Got here"); // Not Executed - Condition True
        }

        if(score < 5000 && score > 1000) { // && logical AND
            System.out.println("Your score was less than 5000 but greater than 1000");
            // Code in block will only execute if the condition is true
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
            // Code in block will execute if firstCondition is false
            // and secondCondition is True
       } else {
            System.out.println("Got here");
            // Code in block will execute if all conditions above are False
            // No limit of else conditions
            // Else Block must be last but is optional
        }
    }


}