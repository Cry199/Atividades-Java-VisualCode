package Game.Choices;

import Game.PrintGame.EndGame;
import Game.PrintGame.GameContinuation;

class SecondRandomness extends MainChoice
{
    EndGame endGame = new EndGame();
    GameContinuation gameContinuation = new GameContinuation();

    

    

    private void clearScreen() 
    {
      System.out.print("\033[H\033[2J");
      System.out.flush();
  	}
}
