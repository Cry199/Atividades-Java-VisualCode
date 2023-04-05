package Game.Choices;

import java.util.Random;
import java.util.Scanner;

import Game.PrintGame.EndGame;
import Game.PrintGame.GameContinuation;

class SecondRandomness extends MainChoice
{
  Random gerador = new Random();
  EndGame endGame = new EndGame();
  GameContinuation gameContinuation = new GameContinuation();

  public SecondRandomness(int knife, int option, int sword, int snakeRoom, int userResponse, boolean continuationOfTheGame, int randomEnemies)
  {
    super(knife, option, sword, snakeRoom, userResponse, continuationOfTheGame, randomEnemies);
  }
  
  protected void randomness(Scanner sc)
  {
      if(super.getRoomChoices() == 1)
      {
        firstChoice(sc);
      }
      else if(super.getRoomChoices() == 2)
      {
        secondChoice(sc);
      }
  }

  private void firstChoice(Scanner sc)
  {
    clearScreen();

    if(super.getSword() == 1)
    {
      System.out.println("Você prepara sua arma e parte para cima do lobo, apesar de não ser mais rápido, sua lâmina consegue cortar uma parte do tronco do animal.");
      System.out.println("Ainda mais raivoso do que antes, ele parte pra cima novamente, tentando morder seu rosto.");
      System.out.println("O que quer fazer?");
      System.out.println("1.Matar o Lobo");
      System.out.println("2.Nocautear o Lobo");

      
    }
  }

  private void secondChoice(Scanner sc)
  {

  }

  private void clearScreen() 
  {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
