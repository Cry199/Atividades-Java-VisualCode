package Game.Choices;

import java.util.Scanner;

import Game.Match;
import Game.EndOfTheGame.EndGame;

public class MainChoice 
{   
    private int roomChoices;
    private int userResponse;
    private int knife;
    private int option;

    EndGame endGame = new EndGame();

    public int getKnife()
    {
        return knife;
    }

    public int getOption()
    {
        return option;
    }

    public void choices(Scanner sc,int roomChoices, int userResponse)
    {
        if(roomChoices == 1)
        {
            firstChoice(sc, userResponse);
        }
        else if(roomChoices == 2)
        {
            secondChoice(sc, userResponse);
        }
        else if(roomChoices == 3)
        {

        }
    }

    private void firstChoice(Scanner sc, int userResponse)
    {
        if(userResponse == 1)
        {
           endGame.oneDeath(); 
        }
        else if(userResponse == 2)
        {
            System.out.println("Com medo do que o animal seja peçonhento ou mortal, você decide sair da sala, evitando ao máximo chamar a atenção da cobra.");

            if((int) (Math.random() * 2) == 1)
            {
              System.out.println("Você consegue escapar da sala.");
            }
            else
            {
                endGame.twoDeath();
            }
        }
        else if(userResponse == 3)
        {
            clearScreen();

            System.out.println("Abrindo sua mochila e vasculhando por possíveis materiais, você encontra uma faca pequena.");
            System.out.println("1.Equipar");
            System.out.println("2.Guardar");
            knife = sc.nextInt();

            clearScreen();

            if(knife == 1)
            {
                System.out.println("Você equipou a faca");
            }
            else if(knife == 2)
            {
                System.out.println("Você guardou a faca");
            }

            System.out.println();
            System.out.println("Atiçada pelos sons de você mexendo em suas coisas, o animal se aproxima ferozmente.");

            if(knife == 1)
            {
                System.out.println("Já esperando por isso, você se prepara para o bote.");
                System.out.println("Ela avança, e você acerta uma estocada certeira em sua cabeça, finalizando-a.");
                System.out.println("Orgulhoso de seu sucesso, você recupera sua faca e abre a próxima porta.");
            }
            else
            {
                endGame.threeDeath();
            }
        }
        else if(userResponse == 4)
        {
            clearScreen();

            if((int) (Math.random()*1) == 0)
            {
                System.out.println("Enquanto você está rezando, você consegue ouvir alguns rastejos, a cobra está se afasando por algum milagre divino, possibilitando que você fuja.");
                System.out.println("Você sai da sala"); 
            }
            else
            {
                endGame.fourDeath();
            }
        }
    }

    private void secondChoice(Scanner sc, int userResponse)
    {
        if(userResponse == 1)
        {
            clearScreen();
            goblin();
        }
        else if(userResponse == 2)
        {
            clearScreen();

            System.out.println("Estranhando a situação, você começa a analisar os arredores ainda melhor.");
            System.out.println("Aos poucos seus olhos se acostumam com a escuridão e você pode ver uma pequena silhueta a sua direita. Ainda está muito escuro, então você não consegue identificar o que exatamente pode ser.");
            System.out.println("O que deseja fazer?");
            System.out.println("1.Pegar as moedas");
            System.out.println("2.Sair da sala");
            option = sc.nextInt();

            System.out.println();
            if(option == 1)
            {
                clearScreen();
                endGame.goblin();
            }
            else if(option == 2)
            {
                clearScreen();
                saidaGoblin();
            }
        }
        else if(userResponse == 3)
        {
            clearScreen();
            saidaGoblin();
        }
    }

    private void clearScreen() 
    {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
