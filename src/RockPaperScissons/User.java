package RockPaperScissons;

import java.util.Scanner;

public class User {



    public User() {
        scanner = new Scanner(System.in);
    }

    public Move getMove(){
        String inputString = scanner.nextLine();
        inputString = inputString.toUpperCase();
        char c = inputString.charAt(0);
        if(c == 'R'|| c == 'P'|| c == 'S'){
            switch (c){
                case 'R':

                    return Move.ROCK;
                case 'P':

                    return Move.PAPER;
                case 'S':

                    return Move.SCISSORS;
            }

        }

        return getMove();
    }

    public boolean playAgain(){
        System.out.println("Хочете зіграти щераз?");
        String inputString = scanner.nextLine();
        inputString = inputString.toUpperCase();

        return inputString.charAt(0) == 'Y';
    }

    private Scanner scanner;


}
