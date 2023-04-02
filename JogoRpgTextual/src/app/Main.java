

import java.util.Scanner;

import Game.Match;

class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Match match = new Match();

        UI.clearScreen();
        UI.printMatch(sc, match);

        

        sc.close();
    }
}
