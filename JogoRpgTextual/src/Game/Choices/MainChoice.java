package Game.Choices;

import java.util.Random;
import java.util.Scanner;

import Game.Rooms.Rooms;

public class MainChoice
{
    private int knife;
    private int sword;
    private int snakeRoom;
    private int roomChoices;
    private int userResponse;
    private boolean continuationOfTheGame;
    private int randomEnemies;
    private String riddleAnswer;

    private Random gerador = new Random();
    private Rooms room = new Rooms();

    /* Main */
    public MainChoice(){}

    /* First Randomness */
    protected MainChoice(int knife, int sword, int snakeRoom, int roomChoices, int userResponse, boolean continuationOfTheGame)
    {
        this.knife = knife;
        this.sword = sword;
        this.snakeRoom = snakeRoom;
        this.roomChoices = roomChoices;
        this.userResponse = userResponse;
        this.continuationOfTheGame = continuationOfTheGame;
    }

    /* Second Randomness */
    protected MainChoice(int knife, int sword, int snakeRoom, int userResponse, boolean continuationOfTheGame, int randomEnemies)
    {
        this.knife = knife;
        this.sword = sword;
        this.snakeRoom = snakeRoom;
        this.userResponse = userResponse;
        this.continuationOfTheGame = continuationOfTheGame;
        this.randomEnemies = randomEnemies;
    }

    /* Riddle Randomness */
    protected MainChoice(String riddleAnswer, int userResponse, int roomChoices, boolean continuationOfTheGame)
    {
        this.riddleAnswer = riddleAnswer;
        this.userResponse = userResponse;
        this.roomChoices = roomChoices;
        this.continuationOfTheGame = continuationOfTheGame;
    }

    /* The Last Choice */
    protected MainChoice(int knife, int sword, int userResponse)
    {
        this.knife = knife;
        this.sword = sword;
        this.userResponse = userResponse;
    }

    /* Get & Set */
    protected void setKnife(int knife)
    {
        this.knife = knife;
    }

    protected int getKnife()
    {
        return knife;
    }

    protected void setSword(int sword)
    {
        this.sword = sword;
    }

    protected int getSword()
    {
        return sword;
    }

    protected void setSnakeRoom(int snakeRoom)
    {
        this.snakeRoom = snakeRoom;
    }

    protected int getSnakeRoom()
    {
        return snakeRoom;
    }

    protected int getRoomChoices()
    {
        return roomChoices;
    }

    protected void setRiddleAnswer(String riddleAnswer)
    {
        this.riddleAnswer = riddleAnswer;
    }

    protected String getRiddleAnswer()
    {
        return riddleAnswer;
    }

    protected void setUserResponse(int userResponse)
    {
        this.userResponse = userResponse;
    }

    protected int getUserResponse()
    {
        return userResponse;
    }

    protected int getRandomEnemies()
    {
        return randomEnemies;
    }

    protected void setContinuationOfTheGame(boolean continuationOfTheGame)
    {
        this.continuationOfTheGame = continuationOfTheGame;
    }

    protected boolean getContinuationOfTheGame()
    {
        return continuationOfTheGame;
    }
    /* -------------- */

    /* Inicio da Partida */
    public void start(Scanner sc)
    {   
        partOne(sc); // Um Parte

        System.out.println();

        partTwo(sc); // Dois Parte

        System.out.println();

        partThree(sc); // Três Parte

        System.out.println();

        finalPart(sc); // Ultima Parte
    }

    private void partOne(Scanner sc)
    {
        randomNumberForRooms(); // Numero Aleatorio para escolha de sala

        this.userResponse = room.screenForFirstRoom(sc, roomChoices); // Primeira Sala 

        FirstRandomness firstRandomness = new FirstRandomness(knife, sword, snakeRoom, roomChoices, userResponse, continuationOfTheGame);
        firstRandomness.randomness(sc);

        this.knife = firstRandomness.getKnife();
        this.sword = firstRandomness.getSword();
        this.continuationOfTheGame = firstRandomness.getContinuationOfTheGame();
    }

    private void partTwo(Scanner sc)
    {
        if(getContinuationOfTheGame() == false) // Validação da Morte
        {
            randomNumberForEnemies(); // Numero Aleatorio para escolha de sala

            this.userResponse = room.screenForSecondRoom(sc, randomEnemies); // Segunda Sala 

            SecondRandomness secondRandomness = new SecondRandomness(knife, sword, snakeRoom, userResponse, continuationOfTheGame, randomEnemies);
            secondRandomness.randomness(sc);

            this.knife = secondRandomness.getKnife();
            this.continuationOfTheGame = secondRandomness.getContinuationOfTheGame();
        } 
    }

    private void partThree(Scanner sc)
    {
        if(getContinuationOfTheGame() == false) // Validação da Morte
        {
            randomNumberForEnemies(); // Numero Aleatorio para escolha de sala

            this.riddleAnswer = room.riddleScreen(sc, roomChoices);  // Riddle Sala 

            RiddleOfRandomness riddleOfRandomness = new RiddleOfRandomness(riddleAnswer, userResponse, roomChoices, continuationOfTheGame);
            riddleOfRandomness.validateRiddleHit();
            
            this.continuationOfTheGame = riddleOfRandomness.getContinuationOfTheGame();
        }
    }

    private void finalPart(Scanner sc)
    {
        if(continuationOfTheGame == false) // Validação da Morte
        {
            TheLastChoice theLastChoice = new TheLastChoice(knife, sword, userResponse);
            theLastChoice.finalChoice(sc); // Boss Sala 

            this.continuationOfTheGame = theLastChoice.getContinuationOfTheGame();
        }
    }

    /* Numero Aleatorio para escolha de sala e inimigo */
    private void randomNumberForRooms()
    {
        roomChoices = gerador.nextInt(3) + 1;
    }

    private void randomNumberForEnemies()
    {
        randomEnemies = gerador.nextInt(2) + 1;
    }
}
