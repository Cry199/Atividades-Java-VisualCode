package Game;

import java.util.Random;
import java.util.Scanner;

import Game.Rooms.Rooms;

public class Match 
{
    private int roomChoices;
    private int userResponse;

    Random gerador = new Random();
    Rooms room = new Rooms();

    public void game(Scanner sc)
    {
        randomNumberForRooms();

        userResponse = room.screenForFirstRoom(sc, roomChoices);

        
    }

    

    private void randomNumberForRooms()
    {
        roomChoices = gerador.nextInt(3) + 1;
    }
}
