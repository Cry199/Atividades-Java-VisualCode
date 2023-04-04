package Game.PrintGame;

public class GameContinuation 
{
    public void goblinExit()
    {
        System.out.println("Estranhando a situação, você decide sair da sala, perto da porta é possível ouvir um som de passos rápidos.");
        System.out.println("Aproveitando que já estava perto da porta, você sai da sala.");
    } 

    public void choiceOfSword(int sword)
    {
        if(sword != 1)
        {
        System.out.println("Você tenta tirar a espada, fascinado pela beleza dela, e com um pouco de esforço você consegue removê-la do chão.\n");
        System.out.println("Você adquiriu: Espada leve\n"); 
        System.out.println("Sentindo confiante com sua lâmina, você segue para a próxima sala.");
        }
        else
        {
        System.out.println("Com receio do que essas escrituras possam ser, você decide recuar e não tocar na espada.");
        System.out.println("Você saiu da sala.");
        }  
    }
}
