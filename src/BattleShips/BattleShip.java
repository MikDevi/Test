package BattleShips;

import java.util.Scanner;

public class BattleShip {

    static String player1;
    static String player2;
    static int [] [] battleField1 = new int [10] [10];
    static int [] [] battleField2 = new int [10] [10];
    static int [] [] monitor1 = new int[10] [10];
    static int [] [] monitor2 = new int[10] [10];
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){
        placeShips(player1, battleField1);
        //enterNames();
    }

    public static void makeTurn(String player, int monitor [] [], int battleField [] []){
        while (true){
            System.out.println(player + "make your turn");
            System.out.println(" 0 1 2 3 4 5 6 7 8 9");
            for (int i = 0; i < monitor.length; i++) {
                System.out.println(i + "" );
                for (int j = 0; j < monitor[i].length; j++) {
                    if(monitor [j] [i] == 0){
                        System.out.println("~ ");
                    } else if (monitor [j] [i] == 1) {
                        System.out.println(". ");
                    }
                    else {
                        System.out.println("* ");
                    }
                }
            }
        }
    }

    public static void drawField(int [] [] battleField) {
        System.out.println(" 0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < battleField.length; i++){
            System.out.println(i + " ");
            for (int j = 0; j < battleField[i].length; j++) {
                if (battleField [j] [i] == 0){
                    System.out.println("~ ");
                }
                else {
                    System.out.println("X ");
                }
            }

        }
    }

    public static void placeShips(String player, int [] [] battleField) {
        int dec = 4;
        while (dec >= 1){
            System.out.println(player + " Please place your " + dec + "~deck ship");
            drawField(battleField);
            System.out.println("Please enter OX coordinate");
            int x = scanner.nextInt();
            System.out.println("Please enter OY coordinate");
            int y = scanner.nextInt();
            System.out.println("Please choose your direction");
            System.out.println("1.Vertical");
            System.out.println("2.Horizontal");
            int direction = scanner.nextInt();
            battleField [x] [y] = 1;
            for (int i = 0; i < dec; i++) {
                if (direction == 1) {
                    battleField[x][y + 1] = 1;
                }
                else {
                    battleField [x + 1] [y] = 1;
                }
                }
            dec--;


        }

    }





}
