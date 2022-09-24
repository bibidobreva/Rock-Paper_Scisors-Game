import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSOR = "Scissors";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO ROCK, PAPER, SCISSORS");
        System.out.print("Chose [r]ock, [p]aper or [s]cissors:");

        String playerMove = scanner.nextLine();

        if(playerMove.equals("r")||playerMove.equals("rock")){
            playerMove=ROCK;
        } else if (playerMove.equals("p")||playerMove.equals("scissors")) {
            playerMove=PAPER;

        } else if (playerMove.equals("s")||playerMove.equals("paper")) {
            playerMove=SCISSOR;

        }
        else {
            System.out.println("Invalid input! Try again.");
            return;
        }
        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);




        String computerMove="";

        switch (computerRandomNumber) {
            case 0, 3 -> computerMove = ROCK;
            case 2 -> computerMove = PAPER;
            case 1 -> computerMove = SCISSOR;

        }
        System.out.println("The computer chose: "+computerMove);

        if(playerMove.equals(computerMove))
        {
            System.out.println("Draw!");
        } else if (playerMove.equals(ROCK)&& computerMove.equals(PAPER)) {
            System.out.println("You lose!");
        } else if (playerMove.equals(ROCK)&&computerMove.equals(SCISSOR)) {
            System.out.println("You win!");
        } else if (playerMove.equals(PAPER)&&computerMove.equals(ROCK)) {
            System.out.println("You win!");
        }else if(playerMove.equals(PAPER)&& computerMove.equals(SCISSOR)){
            System.out.println("You lose!");
        } else if (playerMove.equals(SCISSOR)&& computerMove.equals(ROCK)) {
            System.out.println("You lose!");
        } else if (playerMove.equals(SCISSOR)&&computerMove.equals(PAPER)) {
            System.out.println("You win!");
        }

        System.out.println("Thanks for playing!");

    }

}