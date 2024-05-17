import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        numberGame();
    }

    public static void numberGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
       while(true){
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        System.out.println();
       
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Choose 1: Limitless  Attempts");
        System.out.println("Choice 2: Random number of Max Attempts between 1-10");
        System.out.println("Choice 3: Play in Random Number of rounds between 1-5 with 3 Guesses each");
        System.out.print("Make your choice: ");
        int choice =scanner.nextInt();
        System.out.println();
        
        

        switch(choice){
            case 1:
            while (true) {
                System.out.println("I've chosen a number between 1 and 100. Can you guess it?");
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                // Compare the guess with the secret number
                if (guess == secretNumber) {
                    System.out.println("Congratulations! You've guessed the correct number " + secretNumber + " in " + attempts + " attempts!");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println(" Smaller ! Try guessing higher.");
                } else {
                    System.out.println("Higher! Try guessing lower.");
                }
            }break;

            case 2:
                int maxAttempts=random.nextInt(10);
                System.out.println("You got "+maxAttempts+" attempts");
                if(maxAttempts==0){
                    break;
                }
            while (true) {
                System.out.println("I've chosen a number between 1 and 100. Can you guess it?");
                
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                
                attempts++;
                maxAttempts--;
                
                if(maxAttempts==0){
                    System.out.println("Number of Attempts Reached , You Lose!");
                    break;
                }

                // Compare the guess with the secret number
                if (guess == secretNumber) {
                    System.out.println("Congratulations! You've guessed the correct number " + secretNumber + " in " + attempts + " attempts!");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println(" Smaller ! Try guessing higher.");
                } else {
                    System.out.println("Higher! Try guessing lower.");
                }
            }break;
            case 3:
            while (true) {
                int Rounds=random.nextInt(5);
                System.out.println("You got "+Rounds+" Rounds");
                int maxGuess=3;
                System.out.println("I've chosen a number between 1 and 100. Can you guess it?");
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                maxGuess--;
                if(maxGuess==0){
                    Rounds--;
                }
                if(Rounds==0){
                    System.out.println("Number of rounds end, You loose!");
                }
                // Compare the guess with the secret number
                if (guess == secretNumber) {
                    System.out.println("Congratulations! You've guessed the correct number " + secretNumber + " in " + attempts + " attempts!");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println(" Smaller ! Try guessing higher.");
                } else {
                    System.out.println("Higher! Try guessing lower.");
                }
            }break;
            default:
            System.out.println("Invalid choice");
            }
        }
        System.exit(0);
    }
    
}
