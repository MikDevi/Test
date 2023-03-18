package RockPaperScissons;

public class Game {
    private User user;

    private Computer comp;

    int userScore;
    int compScore;
    int countOfGamese;


    public void StartGame(){
        System.out.println("Гра почалася!");
        Move userMove = user.getMove();
        Move compMove = comp.move();
        System.out.println(userMove);
        System.out.println(compMove);
        int compareMoves = userMove.compareMoves(compMove);
        switch (compareMoves){
            case 1 :
                System.out.println("Перемога користувача");
                userScore ++;
                break;
            case -1 :
                System.out.println("Перемога компютера");
                compScore ++;
                break;
            case 0 :
                System.out.println("Нічія");
                break;
        }
        countOfGamese ++;

        if(user.playAgain()){
            StartGame();
        }
        else{
            printGameStats();

        }

    }



    public Game() {
        user = new User();
        comp = new Computer();
        userScore = 0;
        compScore = 0;
        countOfGamese = 0;

    }
    private void printGameStats() {
        int wins = userScore;
        int losses = compScore;
        int ties = countOfGamese - userScore - compScore;
        double percentageWon = (wins + ((double) ties) / 2) / countOfGamese;

// Вивід лінії
        System.out.print("+");
        printDashes(68);
        System.out.println("+");

// Вивід заголовків таблиці
        System.out.printf("| %6s | %6s | %6s | %12s | %14s |\n",
                "WINS", "LOSSES", "TIES", "GAMES PLAYED", "PERCENTAGE WON");

// Вивід лінії
        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");

// Вивід значень
        System.out.printf("| %6d | %6d | %6d | %12d | %13.2f%% |\n",
                wins, losses, ties, countOfGamese, percentageWon * 100);

// Вивід лінії
        System.out.print("+");
        printDashes(68);
        System.out.println("+");
    }
    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }



    public static void main(String[] args) {
        Game game = new Game();
        game.StartGame();

    }
}
