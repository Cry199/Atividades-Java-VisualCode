import java.util.Scanner;

import Game.Choices.MainChoice;

class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        MainChoice mainChoice = new MainChoice();
        boolean continuationOfTheGame = true;

        /* 
        UI.clearScreen();
        UI.printMatch(sc); */

        UI.clearScreen();
        UI.startOfTheMatch(mainChoice, sc, continuationOfTheGame);

        sc.close();
    }
}
