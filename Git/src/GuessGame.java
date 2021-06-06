import java.util.Scanner;
import java.util.Random;
public class GuessGame {
    public static void main (String []args){
        Random numberForGuess=new Random();
        Scanner scanner = new Scanner (System.in);
        int checkNum = numberForGuess.nextInt (100);
        //    String name = scanner.nextLine();
        for (int i=0; i<=3; i++){
            System.out.println("Enter the name of the participant: ");
            String  name = scanner.nextLine();
        }
        int numOfGuess=0;
        while (numOfGuess != checkNum){
            for (int i=0; i<=3; i++){
                System.out.println("Enter the guess of the participant: ");
                numOfGuess = scanner.nextInt();
                if (numOfGuess > checkNum){
                    System.out.println("Your guess is bigger than the number");
                } else if (numOfGuess<checkNum){
                    System.out.println("Your guess is smaller than the number");
                }
            }

        }
        if (numOfGuess==checkNum){
            System.out.println("You are the winner!!");
        }
    }

}
