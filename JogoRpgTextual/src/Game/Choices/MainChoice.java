package Game.Choices;

import java.util.Random;
import java.util.Scanner;

import Game.Rooms.Rooms;

public class MainChoice
{
    private int knife;
    private int option;
    private int sword;
    private int snakeRoom;
    private int roomChoices;
    private int userResponse;
    private boolean continuationOfTheGame;
    private int randomEnemies;

    Random gerador = new Random();
    Rooms room = new Rooms();

    /* Main */
    public MainChoice(){}

    /* First Randomness */
    protected MainChoice(int knife, int option, int sword, int snakeRoom, int roomChoices, int userResponse, boolean continuationOfTheGame)
    {
        this.knife = knife;
        this.option = option;
        this.sword = sword;
        this.snakeRoom = snakeRoom;
        this.roomChoices = roomChoices;
        this.userResponse = userResponse;
        this.continuationOfTheGame = continuationOfTheGame;
    }

    /* Second Randomness */
    protected MainChoice(int knife, int option, int sword, int snakeRoom, int userResponse, boolean continuationOfTheGame, int randomEnemies)
    {
        this.knife = knife;
        this.option = option;
        this.sword = sword;
        this.snakeRoom = snakeRoom;
        this.userResponse = userResponse;
        this.continuationOfTheGame = continuationOfTheGame;
        this.randomEnemies = randomEnemies;
    }

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

    protected void setOption(int option)
    {
        this.option = option;
    }

    protected int getOption()
    {
        return option;
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

    public void start(Scanner sc, boolean continuationOfTheGame)
    {   
        randomNumberForRooms();

        this.userResponse = room.screenForFirstRoom(sc, roomChoices);

        FirstRandomness firstRandomness = new FirstRandomness(knife, option, sword, snakeRoom, roomChoices, userResponse, continuationOfTheGame);
        firstRandomness.randomness(sc);

        System.out.println();

        randomNumberForEnemies();

        this.userResponse = room.screenForSecondRoom(sc, randomEnemies);

        if(continuationOfTheGame == false)
        {
            
        }

        System.out.println();

        if(continuationOfTheGame == false)
        {

        }
    }

    private void randomNumberForRooms()
    {
        roomChoices = gerador.nextInt(3) + 1;
    }

    private void randomNumberForEnemies()
    {
        randomEnemies = gerador.nextInt(2) + 1;
    }
}
