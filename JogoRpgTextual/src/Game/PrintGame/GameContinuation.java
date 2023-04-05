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

    public void exploreOasis()
    {
        System.out.println("Você decide explorar a sala, e com um pouco de esforço consegue achar uma porta camuflada no meio de folhas e árvores, e decide sair da sala.");  
    }

    /* Parte do Lobo */
    public void wolfWithTheSword(int userResponse)
    {
        if(userResponse == 1)
        {
            System.out.println("Sabendo de suas capacidades e temendo que ele não desista até que você morra, você decide matá-lo.");
            System.out.println("O lobo ataca ferozmente, você defende a mordida com sua espada e num movimento rápido, corta a cabeça do animal.");
        }
        else if(userResponse == 2)
        {
            System.out.println("Não sabendo nada sobre o animal, porém confiante de que pode vencer, você decide apenas deixá-lo inconsciente.");
            System.out.println("O lobo ataca, você defende a mordida com sua espada e aproveita o movimento para jogá-lo em direção à parede com força.");
            System.out.println("O baque é forte, e após alguns segundos, você percebe que ele não está mais se movimentando, ainda assim sua respiração está estável.");
        }

        System.out.println("Você derrotou lobo faminto!");
    }

    public void wolfDeathWithKnife()
    {
        System.out.println("Você decide abrir sua mochila e tira um punhado de roupas e sua faca, enrolando as roupas em seu braço pensando em amortecer um possível dano.\n");
        System.out.println("Você equipou: Defesa improvisada e faca!\n");
        System.out.println("O lobo então avança novamente, buscando atacar seu pescoço, você então defende com seu braço 'fortificado', aguentando um bom dano.");
        System.out.println("Aproveitando que o lobo estava preso mordendo suas roupas, você esfaqueia o lobo com a mão livre, jorrando sangue na sala.");
        System.out.println("Ele afrouxa a mordida, e você o acerta novamente, logo você percebe que ele não é mais um problema.");
        System.out.println("Você derrotou Lobo faminto!");
    }

    public void courageInTheWolf(int userResponse)
    {
        System.out.println();

        if(userResponse == 1)
        {
            System.out.println("Você então usa toda sua força em um golpe certeiro na cabeça do animal, diversas vezes, ele até tenta se defender e te arranhar, mas estava enfraquecido devido à fome, e você consegue finalizá-lo.");
        }
        else if(userResponse == 2)
        {
            System.out.println("Aproveitando da exaustão e fraqueza do animal, você facilmente consegue nocauteá-lo sem sofrer danos.");
        }

        System.out.println("Você venceu!");
    }

    /* --------------  */

    public void deathOrMercyOfTheSorceress(int userResponse)
    {
        if(userResponse == 1)
        {
            System.out.println("Com um corte limpo, você mata a feiticeira.\n");
        }
        else if(userResponse == 2)
        {
            System.out.println("Vendo o rosto aterrorizado da mulher, você decide não matar ela, e sai em direção à próxima sala.\n");
        }

        System.out.println("Você venceu!\n");
    }
}
