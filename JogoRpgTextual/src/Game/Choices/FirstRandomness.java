package Game.Choices;

import java.util.Scanner;

import Game.PrintGame.EndGame;
import Game.PrintGame.GameContinuation;

public class FirstRandomness extends MainChoice 
{
    EndGame endGame = new EndGame();
    GameContinuation gameContinuation = new GameContinuation();

    public FirstRandomness(int knife, int option, int sword, int snakeRoom, int roomChoices, int userResponse, boolean continuationOfTheGame)
    {
        super(knife, option, sword, snakeRoom, roomChoices, userResponse, continuationOfTheGame);
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
        else if(super.getRoomChoices() == 3)
        {
            thirdChoice(sc);
        }
    }

    private void firstChoice(Scanner sc)
    {
        if(super.getUserResponse() == 1)
        {
           endGame.oneDeath(); 
        }
        else if(super.getUserResponse() == 2)
        {
            System.out.println("Com medo do que o animal seja peçonhento ou mortal, você decide sair da sala, evitando ao máximo chamar a atenção da cobra.");

            super.setSnakeRoom((int) (Math.random() * 2));
            if(super.getSnakeRoom() == 1)
            {
              System.out.println("Você consegue escapar da sala.");
            }
            else
            {
                endGame.twoDeath();
                super.setContinuationOfTheGame(true);
            }
        }
        else if(super.getUserResponse() == 3)
        {
            clearScreen();

            System.out.println("Abrindo sua mochila e vasculhando por possíveis materiais, você encontra uma faca pequena.");
            System.out.println("1.Equipar");
            System.out.println("2.Guardar");
            super.setKnife(sc.nextInt());

            clearScreen();

            if(super.getKnife() == 1)
            {
                System.out.println("Você equipou a faca");
            }
            else if(super.getKnife() == 2)
            {
                System.out.println("Você guardou a faca");
            }

            System.out.println();
            System.out.println("Atiçada pelos sons de você mexendo em suas coisas, o animal se aproxima ferozmente.");

            if(super.getKnife() == 1)
            {
                System.out.println("Já esperando por isso, você se prepara para o bote.");
                System.out.println("Ela avança, e você acerta uma estocada certeira em sua cabeça, finalizando-a.");
                System.out.println("Orgulhoso de seu sucesso, você recupera sua faca e abre a próxima porta.");
            }
            else
            {
                endGame.threeDeath();
                super.setContinuationOfTheGame(true);
            }
        }
        else if(super.getUserResponse() == 4)
        {
            clearScreen();

            if((int) (Math.random() * 1) == 0)
            {
                System.out.println("Enquanto você está rezando, você consegue ouvir alguns rastejos, a cobra está se afasando por algum milagre divino, possibilitando que você fuja.");
                System.out.println("Você sai da sala"); 
            }
            else
            {
                endGame.fourDeath();
                super.setContinuationOfTheGame(true);
            }
        }
    }

    private void secondChoice(Scanner sc)
    {
        if(super.getUserResponse() == 1)
        {
            clearScreen();
            endGame.deathGoblin();
        }
        else if(super.getUserResponse() == 2)
        {
            clearScreen();

            System.out.println("Estranhando a situação, você começa a analisar os arredores ainda melhor.");
            System.out.println("Aos poucos seus olhos se acostumam com a escuridão e você pode ver uma pequena silhueta a sua direita. Ainda está muito escuro, então você não consegue identificar o que exatamente pode ser.");
            System.out.println("O que deseja fazer?");
            System.out.println("1.Pegar as moedas");
            System.out.println("2.Sair da sala");
            super.setOption(sc.nextInt());

            System.out.println();
            if(super.getOption() == 1)
            {
                clearScreen();
                endGame.deathGoblin();
                super.setContinuationOfTheGame(true);
            }
            else if(super.getOption() == 2)
            {
                clearScreen();
                gameContinuation.goblinExit();
            }
        }
        else if(super.getUserResponse() == 3)
        {
            clearScreen();
            gameContinuation.goblinExit();
        }
    }

    private void thirdChoice(Scanner sc)
    {
        clearScreen();

        if(super.getUserResponse() == 1)
        {
            System.out.println("Você se aproxima e repara melhor na arma, é uma lâmina muito bem forjada, seu fio em perfeito estado e com algumas marcações estranhas no cabo.");
            System.out.println("O que deseja fazer?");
            System.out.println("1.Pegar a espada");
            System.out.println("2.Ignorar e ir para a próxima sala");
            super.setSword(sc.nextInt());

            clearScreen();

            gameContinuation.choiceOfSword(super.getSword());
        }
        else if(super.getUserResponse() == 2)
        {
            System.out.println("Com uma estranha sensação de 'algo está errado', você decide analisar melhor o quarto, passa pelas paredes cautelosamente, pisa no chão em alguns lugares específicos esperando algum tipo de armadilha, se aproxima da espada o suficiente para analisá-la...");
            System.out.println("Mas nada acontece.");
            System.out.println("O que deseja fazer?");
            System.out.println("1.Pegar espada");
            System.out.println("2.Sair da sala");
            super.setSword(sc.nextInt());

            clearScreen();

            gameContinuation.choiceOfSword(super.getSword());
        }
        else if(super.getUserResponse() == 3)
        {
            System.out.println("Não convencido pela sala em si, e receoso com o que possa acontecer caso se aproxime da lâmina, você sai da sala.");
        }
    }

    private void clearScreen() 
    {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
