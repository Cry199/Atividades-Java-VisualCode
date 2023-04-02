package Game;

import java.util.Random;

public class Match 
{
    private int roomChoices;

    Random gerador = new Random();
    
    public void start()
    {
        roomChoices = randomNumberForRooms();

        if(roomChoices == 1)
        {
            
        }
        else if (roomChoices == 2)
        {

        }
        else if (roomChoices == 3)
        {

        }
    }

    private int randomNumberForRooms()
    {
        return roomChoices = gerador.nextInt(3) + 1;
    }
}
