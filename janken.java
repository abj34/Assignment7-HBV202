import java.util.Scanner;

//Create a rock-paper-scissors game
public class janken {
    public static void main(String[] args) {
        //Ask user for choice
        System.out.println("Rock, Paper, Scissors?");
        String choice = "";
        Scanner input = new Scanner(System.in);
        choice = input.nextLine();

        //Computer chooses randomly between rock, paper, or scissors
        String[] choices = {"rock", "paper", "scissors"};
        String computerChoice = choices[(int) (Math.random() * choices.length)];

        //Print what computer picked
        System.out.println("Computer picked " + computerChoice);

        //Rock beats scissors
        if (choice.equals("rock") && computerChoice.equals("scissors")) {
            System.out.println("You win!");
        }
        
        //Paper beats rock
        else if (choice.equals("paper") && computerChoice.equals("rock")) {
            System.out.println("You win!");
        }
        //Scissors beats paper
        else if (choice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("You win!");
        }
        //There is a draw
        else if (choice.equals(computerChoice)) {
            System.out.println("It's a draw!");
        }
        //Computer wins
        else {
            System.out.println("Computer wins!");
        }
    }
}