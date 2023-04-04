import java.util.Scanner;

import Game.Choices.MainChoice;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MainChoice mc = new MainChoice();

        /* 
        UI.clearScreen();
        UI.printMatch(sc); */

        UI.clearScreen();
        UI.startOfTheMatch(sc, mc);

        sc.close();
    }
}
