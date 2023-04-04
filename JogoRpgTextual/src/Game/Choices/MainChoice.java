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

    Random gerador = new Random();
    Rooms room = new Rooms();

    public MainChoice(){
        
    }

    /* First Randomness */
    public MainChoice(int knife, int option, int sword, int snakeRoom, int roomChoices, int userResponse)
    {
        this.knife = knife;
        this.option = option;
        this.sword = sword;
        this.snakeRoom = snakeRoom;
        this.roomChoices = roomChoices;
        this.userResponse = userResponse;
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

    public void start(Scanner sc, boolean continuationOfTheGame)
    {   
        randomNumberForRooms();

        this.userResponse = room.screenForFirstRoom(sc, roomChoices);

        choices(sc, continuationOfTheGame);

    }

    private void choices(Scanner sc, boolean continuationOfTheGame)
    {
        if(continuationOfTheGame == true)
        {
            FirstRandomness firstRandomness = new FirstRandomness(knife, option, sword, snakeRoom, roomChoices, userResponse);
            firstRandomness.randomness(sc, continuationOfTheGame);
        }

        System.out.println();

        if(continuationOfTheGame == true)
        {
            
        }

        System.out.println();

        if(continuationOfTheGame == true)
        {

        }
    }

    private void randomNumberForRooms()
    {
        roomChoices = gerador.nextInt(3) + 1;
    }
}
