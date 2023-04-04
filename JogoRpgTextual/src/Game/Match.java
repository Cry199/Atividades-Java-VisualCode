package Game;

import java.util.Random;
import java.util.Scanner;

import Game.Choices.MainChoice;
import Game.Rooms.Rooms;

public class Match 
{
    private int roomChoices;
    private int userResponse;

    Random gerador = new Random();
    Rooms room = new Rooms();
    MainChoice mainChoice = new MainChoice(roomChoices, userResponse);

    public Match(int roomChoices, int userResponse) 
    {
        this.roomChoices = roomChoices;
        this.userResponse = userResponse;
    }

    protected int getRoomChoices()
    {
        return roomChoices;
    }

    protected int getUserResponse()
    {
        return userResponse;
    }

    public void game(Scanner sc)
    {
        randomNumberForRooms();

        userResponse = room.screenForFirstRoom(sc, roomChoices);

        mainChoice.choices(sc);
    }
    

    private void randomNumberForRooms()
    {
        roomChoices = gerador.nextInt(3) + 1;
    }
}
