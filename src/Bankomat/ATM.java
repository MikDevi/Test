package Bankomat;

import java.util.Scanner;

public class ATM {

    static Scanner scanner = new Scanner(System.in);

    public static void chooseOption(Account account){
        int option = scanner.nextInt();
        int cash;
        int pinCod = 0;
        switch (option){
            case 1:
                System.out.println("Скільки грошей ви хочете зняти?");
                cash = scanner.nextInt();
                System.out.println("На вашему рахунку залишилося " + (account.getBalans() - cash));
                break;
            case 2:
                System.out.println("Ваш баланс " + account.getBalans());
                break;
            case 3:
                System.out.println("Введіть новий пін-код");
                pinCod = scanner.nextInt();
                account.setPin(pinCod);
                System.out.println("Ваш новий пін-код " + account.getPin());
                break;
            case 4:
                System.out.println("Введіть сумму для введення на рахунок");
                cash = scanner.nextInt();
                account.setBalans(account.getBalans() + cash);
                System.out.println("На вашему рахунку " + (account.getBalans() + cash));
                break;
            case 5:
                System.out.println(account.getName());
                System.out.println(account.getBalans());
                System.out.println(account.getNumb());
                System.out.println(account.getPin());
                break;
            case 6:
                System.out.println("На все добре!");

        }



    }

    public static void main(String[] args) {
        System.out.println("Введіть номер та пін-код картки");
        int numb = scanner.nextInt();
        int pin = scanner.nextInt();
        start(numb, pin);
    }

    public static void start(int numb, int pin){
        for(Account account : Database.database){
             if(numb == (account.getNumb())) {
                 if (pin == (account.getPin())) {
                     menu();
                     chooseOption(account);
                 }
                 else {
                     System.out.println("Невірний пін-код");
                 }
             }
        }
    }

        public static void menu() {

            System.out.println("[1] Зняти грощі");
            System.out.println("[2] Подивитися баланс");
            System.out.println("[3] Змінити пін-код");
            System.out.println("[4] Попвнити рахунок");
            System.out.println("[5] Подивитися данні користувача");
            System.out.println("[6] Закінчити роботу");
        }
}
