import java.util.*;
class Main{
  public static void main(String[] args)
  {
    Scanner newScan = new Scanner(System.in);
    
    int salaCobra =0, faca=0, rezar = 0;
    int opcao =0;
    int espada =0;
    int num1 = (int) ((Math.random() *3)+1);
    int num2 =0;
    int lobo =0;
    int resp2=0;
    int chanceLobo=0;
    int oasis =0;
    int explorar = 0;
    int ilusao =0;
    int feiticeira=0;
    int num3=0;
    String resp3="";
    int acertoSala3=0;
    int opcaoFinal=0;

    int resp1 = primeiraSala(num1);

    if(num1 == 1 && resp1 == 1)
    {
      System.out.println("Você tenta lutar contra a cobra com suas mãos nuas, a falta de informação sobre o animal te leva a fazer movimentos imprudentes e você é mordido e envenenado.");
      System.out.println("Aos poucos o veneno começa a fazer efeito e você sente suas forças se esvaindo, você então pode sentir o abraço da morte.");
      System.out.println("Fim de jogo!");
    }
    else if(num1 == 1 && resp1 == 2)
    {
      System.out.println("Com medo do que o animal seja peçonhento ou mortal, você decide sair da sala, evitando ao máximo chamar a atenção da cobra.");
      salaCobra = (int) (Math.random() * 2);
      if(salaCobra == 1)
      {
        System.out.println("Você consegue escapar da sala.");
      }
      else
      {
        System.out.println("Você não consegue ser silencioso o bastante e chama a atenção da cobra.\nSurpreso e em choque ao ver ela se movendo em sua direção, você não consegue reagir rápido o suficiente e é mordido e envenenado até a morte.");
        System.out.println("Você morreu, fim de jogo!");
      }
    }
    else if(num1 == 1 && resp1 == 3)
    {
      limpar();
      System.out.println("Abrindo sua mochila e vasculhando por possíveis materiais, você encontra uma faca pequena.");
      System.out.println("1.Equipar");
      System.out.println("2.Guardar");
      faca = newScan.nextInt();

      limpar();

      if(faca==1)
      {
        System.out.println("Você equipou a faca");
      }
      else if(faca ==2)
      {
        System.out.println("Você guardou a faca");
      }

      System.out.println();
      System.out.println("Atiçada pelos sons de você mexendo em suas coisas, o animal se aproxima ferozmente.");

      if(faca == 1)
      {
        System.out.println("Já esperando por isso, você se prepara para o bote.");
        System.out.println("Ela avança, e você acerta uma estocada certeira em sua cabeça, finalizando-a.");
        System.out.println("Orgulhoso de seu sucesso, você recupera sua faca e abre a próxima porta.");
      }
      else
      {
        System.out.println("Desajeitado enquanto tenta guardar suas coisas novamente, você não consegue reagir ao ataque e sente uma mordida na sua perna.");
        System.out.println("Assustado, você cai no chão. A cobra continua te atacando e você sente sua vida se esvaindo.....");
        System.out.println("Você morreu! Fim de jogo");
      }
    }
    else if(num1 == 1 && resp1 == 4)
    {
      rezar = (int) (Math.random()*1);
      limpar();

      if(rezar==0)
      {
        System.out.println("Enquanto você está rezando, você consegue ouvir alguns rastejos, a cobra está se afasando por algum milagre divino, possibilitando que você fuja.");
        System.out.println("Você sai da sala"); 
      }
      else
      {
        System.out.println("Enquanto você se ajoelha para rezar, você ouve a cobra se aproximando, sua respiração comeaça a ficar cada vez mais ofegante, e a cobra realiza um ataque com sucesso, picando seu pescoço e lhe deixando para morrer.");
      }
    }
    //--------------------------------------------------------------------
    else if(num1==2 && resp1==1)
    {
      limpar();
      goblin();
    }
    else if(num1==2 && resp1==2)
    {
      limpar();
      System.out.println("Estranhando a situação, você começa a analisar os arredores ainda melhor.");
      System.out.println("Aos poucos seus olhos se acostumam com a escuridão e você pode ver uma pequena silhueta a sua direita. Ainda está muito escuro, então você não consegue identificar o que exatamente pode ser.");
      System.out.println("O que deseja fazer?");
      System.out.println("1.Pegar as moedas");
      System.out.println("2.Sair da sala");
      opcao = newScan.nextInt();
      System.out.println();
      if(opcao==1)
      {
        limpar();
        goblin();
      }
      else if(opcao==2)
      {
        limpar();
        saidaGoblin();
      }
    }
    else if(num1==2 && resp1==3)
    {
      limpar();
      saidaGoblin();
    }
    //--------------------------------------------------------------------
    else if(num1==3&&resp1==1)
    {
      limpar();
      System.out.println("Você se aproxima e repara melhor na arma, é uma lâmina muito bem forjada, seu fio em perfeito estado e com algumas marcações estranhas no cabo.");
      System.out.println("O que deseja fazer?");
      System.out.println("1.Pegar a espada");
      System.out.println("2.Ignorar e ir para a próxima sala");
      espada = newScan.nextInt();
      //System.out.println();
      limpar();
      espada(espada);
      }
    else if(num1==3&&resp1==2)
    {
      limpar();
      System.out.println("Com uma estranha sensação de 'algo está errado', você decide analisar melhor o quarto, passa pelas paredes cautelosamente, pisa no chão em alguns lugares específicos esperando algum tipo de armadilha, se aproxima da espada o suficiente para analisá-la...");
      System.out.println("Mas nada acontece.");
      System.out.println("O que deseja fazer?");
      System.out.println("1.Pegar espada");
      System.out.println("2.Sair da sala");
      espada = newScan.nextInt();
      //System.out.println();
      limpar();
      espada(espada);
    }
    else if(num1==3&&resp1==3)
    {
     System.out.println("Não convencido pela sala em si, e receoso com o que possa acontecer caso se aproxime da lâmina, você sai da sala.");
    }
    System.out.println();
    //---------------------------------------con --------------------------
    if(num1 == 1 && resp1 == 2 && salaCobra == 1
      ||num1 == 1 && resp1 == 3 && faca == 1
      ||num1 == 1 && resp1 == 4 && rezar == 0
      ||num1 == 3
      ||num1==2 && resp1==3
      ||num1==2 && opcao==2)  
      { //--------------------------------------- VALIDADE DE MORTE --------------------------
        num2 = (int) (Math.random() * 2) + 1;
        //System.out.println(num2);
        chanceLobo = (int) (Math.random() * 4)+1;
        resp2 = segundaSala(num2);
        if(num2==1&&resp2==1)
        {
          limpar();
          if(espada==1)
          {
            System.out.println("Você prepara sua arma e parte para cima do lobo, apesar de não ser mais rápido, sua lâmina consegue cortar uma parte do tronco do animal.");
            System.out.println("Ainda mais raivoso do que antes, ele parte pra cima novamente, tentando morder seu rosto.");
            System.out.println("O que quer fazer?");
            System.out.println("1.Matar o Lobo");
            System.out.println("2.Nocautear o Lobo");
            lobo = newScan.nextInt();
            //System.out.println();
            limpar();
            if(lobo==1)
            {
              System.out.println("Sabendo de suas capacidades e temendo que ele não desista até que você morra, você decide matá-lo.");
              System.out.println("O lobo ataca ferozmente, você defende a mordida com sua espada e num movimento rápido, corta a cabeça do animal.");
            }
            else if(lobo==2)
            {
              System.out.println("Não sabendo nada sobre o animal, porém confiante de que pode vencer, você decide apenas deixá-lo inconsciente.");
              System.out.println("O lobo ataca, você defende a mordida com sua espada e aproveita o movimento para jogá-lo em direção à parede com força.");
              System.out.println("O baque é forte, e após alguns segundos, você percebe que ele não está mais se movimentando, ainda assim sua respiração está estável.");
            }

            System.out.println("Você derrotou lobo faminto!");
          }
          else
          {
            System.out.println("Surpreso, porém não acuado pelo ser lupino você decide partir para cima primeiro, o lobo não recua, e faz um avanço rápido, tentando morder seu braço.");
            System.out.println("Você consegue desviar por pouco, porém percebe que não vai conseguir ganhar apenas na força bruta.");
            lobo = salaLobo();
            limpar();
            finalLobo(lobo,chanceLobo);
          }
        }
        else if(num2==1&&resp2==2)
        {
          System.out.println("Você espera o Ataque, o lobo faminto vem em sua direção, mirando sua perna, você percebe as intenções dele e consegue se jogar para fora do ataque, se levantando logo em seguida e mantendo o preparo.");
          lobo = salaLobo();
          limpar();
          finalLobo(lobo,chanceLobo);
        }
        else if(num2==1&&resp2==3)
        {
          lobo = 2;
          limpar();
          finalLobo(lobo,chanceLobo); // ????
        }
        //------------------------ concluido --------------------------------------------

        if(num2 == 2 && resp2 == 1)
        { 
          limpar();
          descansar();
        } 
        else if(num2==2&&resp2==2)
        {
          limpar();
          System.out.println("Focado em seu objetivo, você tenta sair da sala, mas não acha nenhuma porta ou saída aparente como na sala anterior.");
          System.out.println("Você caminha por horas, porém sem muitos resultados.");
          System.out.println("O que deseja fazer?");
          System.out.println("1.Descansar");
          System.out.println("2.Continuar procurando");
          oasis = newScan.nextInt();
          limpar();
          if(oasis==1)
          {
            descansar();
          }
          else if(oasis==2){
            explorarOasis();
          }
        }
        else if(num2==2&&resp2==3)
        {
          limpar();
          System.out.println("Explorando mais a fundo o lugar, você percebe algumas coisas... A sala é muito maior do que a outra que você já passou, o sol está radiante, mesmo que o lugar seja fechado, e você tem a sensação que tudo aquilo é apenas sua mente lhe pregando peças...");
          System.out.println("O que deseja fazer?");
          System.out.println("1.Tentar entender mais do lugar");
          System.out.println("2.Tentar sair para a próxima sala");
          explorar = newScan.nextInt();
          limpar();
          if(explorar==1)
          {
            System.out.println();
            System.out.println("Você se senta para organizar seus pensamentos, nada está fazendo sentido, uma casa não poderia ter um óasis assim, o lugar é como se fosse uma ilusão...");
            System.out.println("Enquanto você está pensando, você escuta algo se aproximando... Olhando melhor, é uma Mulher");
            System.out.println("Seu rosto está completamente sujo, seus olhos sem vida e é possível notar diversas manchas de sangue nas roupas, mãos e rosto dela.");
            System.out.println("Ela nota que você está a observando e entra em choque, Você nota a ilusão se distorcendo um pouco.");
            System.out.println("O que quer fazer?");
            System.out.println("1.Derrotar a Ilusionista");
            System.out.println("2.Sair da Ilusão");
            ilusao = newScan.nextInt();
            limpar();
            if(ilusao==1&&espada==1)
            {
              System.out.println("Com sua espada em mãos você decide lutar contra a feiticeira, ela não parece forte, porém você não sabe os truques que ela guarda");
              System.out.println("Enquanto ela corre, você a persegue com facilidade e acerta um corte em sua perna, derrubando-a e saindo da ilusão, a porta está logo à sua frente.");
              System.out.println("O que fazer?");
              System.out.println("1.Finalizar ela");
              System.out.println("2.Sair da sala");
              feiticeira = newScan.nextInt();
              limpar();
              if(feiticeira==1)
              {
                System.out.println("Com um corte limpo, você mata a feiticeira.\n");
              }
              else if(feiticeira==2)
              {
                System.out.println("Vendo o rosto aterrorizado da mulher, você decide não matar ela, e sai em direção à próxima sala.\n");
              }
              System.out.println("Você venceu!\n");
            }
            else if(ilusao==1&&espada!=1)
            {
              System.out.println("Você pega a faca que estava em sua mochila e atira na ilusionista, derrubando-a no chão.");
              System.out.println("O que fazer?");
              System.out.println("1.Finalizar ela");
              System.out.println("2.Sair da sala");
              feiticeira = newScan.nextInt();
              limpar();
              if(feiticeira==1)
              {
                System.out.println("Com um corte limpo, você mata a feiticeira.\n");
              }
              else if(feiticeira==2)
              {
                System.out.println("Vendo o rosto aterrorizado da mulher, você decide não matar ela, e sai em direção à próxima sala.\n");
              }
              System.out.println("Você venceu!\n");
            }
            else if(ilusao==2)
            {
              limpar();
              explorarOasis();
            } 
        }
        else if(explorar==2)
        {
            limpar();
            explorarOasis();
          }
      }  
    }

    
    if(lobo == 2)
    {
      faca = 1;// concluido  
    }
    
    System.out.println();
    //-------------1234------------------------------------------------------
    
    if(num2 == 1 && lobo== 1 || num2 == 1 && lobo == 2||
    num2 == 1 && lobo == 3 && chanceLobo == 3 ||
    num2 == 2 && resp2 == 2 && oasis == 2 || num2 == 2 && resp2 == 3)
    {
      num3 = (int) (Math.random() * 3) + 1;
      resp3 =  terceiraSala(num3);
      limpar();
      if(num3 == 1 && resp3.equalsIgnoreCase("Relogio") 
      ||num3==2&&resp3.equalsIgnoreCase("Mercurio")
      ||num3==3&&resp3.equalsIgnoreCase("Mapa"))
      {
        acertoSala3();
        acertoSala3 = 1;
      }
      else
      {
        erroSala3();
      } 
    }
    //---------------------------------------------------------------------------
    System.out.println();
    //---------------------------------------------------------------------------
    if(acertoSala3==1)
    {
      System.out.println("O corredor para o próximo cômodo te dá calafrios, um tom acinzentado está sempre presente nessa curta jornada, e conforme você se aproxima da próxima porta, tons de vermelho sangue tomam o lugar em todas as paredes...");
      System.out.println("Você abre a próxima porta e encontra uma sala enorme, com diversos crânios espalhados pelo chão, uma ponte de cabeças levando ao centro, onde se pode ver um trono, e alguma coisa está sentada, esperando...\n");
      System.out.println("'Olha só, o humano tem algum potencial... Diga-me, o que busca nesse domínio?'\n");
      System.out.println("Uma criatura completamente vermelha, com asas escuras saindo de suas costas e um par de chifres, questiona sua determinação, independente do que isso seja, você sabe que qualquer decisão não será simples aqui...");
      System.out.println("O que quer fazer?");
      System.out.println("1.Lutar");
      System.out.println("2.Fugir");
      opcaoFinal = newScan.nextInt();
      limpar();
    }
    //---------------------------------------------------------------------------
    if(opcaoFinal == 1)
    {
      System.out.println("'Não é muito de falar, não é mesmo? Mas suas intenções estão claras.'\n");
      System.out.println("A criatura se levanta e se posiciona na sua frente com um olhar hostil");
      bossFight(espada,faca);
    }
    else if(opcaoFinal == 2)
    {
      System.out.println("Temendo a criatura, você tenta sair pela porta onde voltou, o demônio abre ela com magia e você corre, como se não houvesse amanhã...\n");
      System.out.println("Uma, duas, três portas, e então a última porta finalmente se abre...");
      System.out.println("Você volta à sala do demônio, que não parece muito feliz por você ter tentado fugir...");
      System.out.println("Ele voa rapidamente, e em um instante, sua cabeça está no chão...\n");
      System.out.println("\t\t\t\t\t'FRACO'\n");
      System.out.println("\t\t\t\t\tVOCÊ MORREU!\n\t\t\t\t\tFIM DE JOGO!");
    }
  }
  
  public static void limpar()
  {
   System.out.print("\033[H\033[2J");
   System.out.flush();
  }
   // concluido 
  public static int primeiraSala(int num) /*  */
  {
    Scanner newScan = new Scanner(System.in);
    
    int fim = 0;
    if(num==1)
    {
      System.out.println("Você entra em uma sala escura... À sua frente é possível ouvir um 'SSSSSsssss' com um breve som de chocalhos. Logo você reconhece que se trata de uma cobra");
      System.out.println("O que deseja fazer?");
      System.out.println("1.Lutar");
      System.out.println("2.Correr");
      System.out.println("3.Abrir mochila");
      System.out.println("4.Rezar");
      fim = newScan.nextInt();
    }
    else if(num==2)
    {
      System.out.println("O centro da sala está bem iluminado, com tamanho destaque no centro, o resto da sala está um completo breu, é possível ver um pequeno punhado de moedas de ouro.");
      System.out.println("O que deseja fazer?");
      System.out.println("1.Pegar as moedas");
      System.out.println("2.Analisar os arredores");
      System.out.println("3.Sair da sala");
      fim = newScan.nextInt();
    }
    else if(num==3)
    {
      System.out.println("Ao entrar na sala você analisa seus arredores, um ambiente quadrado com paredes claras, um pouco sujas devidas ao tempo, porém muito bonitas ainda assim, o chão se mistura em um quadriculado preto e branco, e ao centro você vê uma espada fincada no chão.");
      System.out.println("O que deseja fazer?");
      System.out.println("1.Se aproximar");
      System.out.println("2.Analisar melhor os arredores");
      System.out.println("3.Sair da sala");
      fim = newScan.nextInt();
    }
    
    return fim;
  }
   // concluido 
  public static void goblin()
  {
    System.out.println("Feliz por encontrar um pouco de sorte finalmente, você caminha diretamente até elas.");
    System.out.println("Um...dois...três...cinco passos, aos poucos você vai se aproximando");
    System.out.println("Quando chega até as moedas, você se agacha para guardá-las.");
    System.out.println("Ao se abaixar, você sente uma coisa fria perfurando seu peito, sangue começa a subir até sua boca rapidamente. Olhando para o local, você vê uma faca enficanda a partir das suas costas.");
    System.out.println("Uma pequena risada é ouvida, e você cai no chão, sentindo a frieza de sua própria pele e uma poça vermelha crescendo.");
    System.out.println("Você foi atacado por um goblin e morreu!Fim de jogo!");
  }
   // concluido 
  public static void saidaGoblin()
  {
    System.out.println("Estranhando a situação, você decide sair da sala, perto da porta é possível ouvir um som de passos rápidos.");
    System.out.println("Aproveitando que já estava perto da porta, você sai da sala.");
  }
   // concluido 
  public static void espada(int espada)
  {
    if(espada==1)
    {
      System.out.println("Você tenta tirar a espada, fascinado pela beleza dela, e com um pouco de esforço você consegue removê-la do chão.\n");
      System.out.println("Você adquiriu: Espada leve\n"); 
      System.out.println("Sentindo confiante com sua lâmina, você segue para a próxima sala.");
    }
    else if(espada==2)
    {
      System.out.println("Com receio do que essas escrituras possam ser, você decide recuar e não tocar na espada.");
      System.out.println("Você saiu da sala.");
    }  
  }
   // concluido 
  public static int segundaSala(int num2)
  {
    Scanner newScan = new Scanner(System.in);
    int fim = 0;

    if(num2==1)
    {
      System.out.println("Ao entrar no novo cômodo, você logo repara na falta de cor do ambiente, as paredes e chão emanam energias negativas.");
      System.out.println("Você escuta a porta atrás de você se trancando, logo em seguida você consegue escutar um rosnado furioso vindo do centro.");
      System.out.println("Um lobo faminto está barrando seu caminho.");
      System.out.println("O que deseja fazer?");
      System.out.println("1.Atacar");
      System.out.println("2.Defender");
      System.out.println("3.Abrir Mochila");
      fim = newScan.nextInt();
    }
    else if(num2==2)
    {
      System.out.println("Ao entrar no novo cômodo, ele se assemelha a um óasis, tem diversas árvores com frutos chamativos e suculentos, um pequeno riacho cristalino, e uma sensação de paz toma conta do seu corpo.");
      System.out.println("O que você faz?");
      System.out.println("1.Descansar");
      System.out.println("2.Sair da sala");
      System.out.println("3.Explorar");
      fim = newScan.nextInt();
    }
    
    return fim;
  }
   // concluido 
  public static int salaLobo()
  {
    Scanner newScan = new Scanner(System.in);
    int lobo = 0;
    System.out.println("O que quer fazer?");
    System.out.println("1.Esperar e contra-atacar");
    System.out.println("2.Abrir Mochila");
    System.out.println("3.Tentar fugir");
    lobo = newScan.nextInt();
    System.out.println();
    return lobo;
  }
 // concluido 
  public static void finalLobo(int lobo, int chance){
    Scanner newScan = new Scanner(System.in);
    if(lobo==1)
    {
      System.out.println("Você se prepara, e o lobo avança novamente, buscando rasgar seu pescoço, porém, já sabendo seu curso de ação, você consegue se esquivar e se posicionar em cima do lobo, usando seu peso para mantê-lo no chão.");
      System.out.println("Com ele preso, você decide:");
      System.out.println("1.Matar o lobo");
      System.out.println("2.Nocautear o lobo");
      int decisaoLobo = newScan.nextInt();
      System.out.println();
      if(decisaoLobo==1){
        System.out.println("Você então usa toda sua força em um golpe certeiro na cabeça do animal, diversas vezes, ele até tenta se defender e te arranhar, mas estava enfraquecido devido à fome, e você consegue finalizá-lo.");
      }
      else if(decisaoLobo==2){
        System.out.println("Aproveitando da exaustão e fraqueza do animal, você facilmente consegue nocauteá-lo sem sofrer danos.");
      }
      System.out.println("Você venceu!");
    }
    else if(lobo==2)
    {
      System.out.println("Você decide abrir sua mochila e tira um punhado de roupas e sua faca, enrolando as roupas em seu braço pensando em amortecer um possível dano.\n");
      System.out.println("Você equipou: Defesa improvisada e faca!\n");
      System.out.println("O lobo então avança novamente, buscando atacar seu pescoço, você então defende com seu braço 'fortificado', aguentando um bom dano.");
      System.out.println("Aproveitando que o lobo estava preso mordendo suas roupas, você esfaqueia o lobo com a mão livre, jorrando sangue na sala.");
      System.out.println("Ele afrouxa a mordida, e você o acerta novamente, logo você percebe que ele não é mais um problema.");
      System.out.println("Você derrotou Lobo faminto!");
    }
    else if(lobo==3)
    {
      if(chance==3)
      {
        System.out.println("Com um desespero imenso, você corre até a próxima porta, e consegue fugir.");
      }
      else
      {
        System.out.println("Com um desespero imenso, você tenta correr até a próxima porta, porém o lobo morde sua perna no meio do caminho, você vê a poça de sangue se formando antes dele arrancar sua cabeça.....");
        System.out.println("Você morreu! Fim de jogo!");
      }
    } 
  }
 // concluido 
  public static void descansar(){ 
     System.out.println("Cansado de suas aventuras anteriores, e com um ambiente tão convidativo, você decide descansar um pouco.");
      System.out.println("Você se deita na costa de uma árvore, e tenta pegar no sono... lentamente tudo se escurece...");
      System.out.println(".\n.\n.\n.\n");
      System.out.println("De repente, você acorda num susto!");
      System.out.println("Você não consegue mais sentir seu corpo direito, todas as paredes se tornaram pretas com inscrições vermelhas, você não consegue ler absolutamente nada, mas o círculo com símbolos em volta não tem erro... É um ritual.");
      System.out.println("Sem conseguir mexer seu corpo, uma faca é fincada em seu peito, sua respiração começa a fica descompassada, e você sente o sangue saindo de seu corpo.");
      System.out.println("'Mais um sacrifício em nome do nosso Senhor!'");
      System.out.println("Você morreu! Fim de jogo!");
  }
  // concluido 
  public static void explorarOasis()
  {
    System.out.println("Você decide explorar a sala, e com um pouco de esforço consegue achar uma porta camuflada no meio de folhas e árvores, e decide sair da sala.");  
  }
  // concluido 
  
  public static String terceiraSala(int num3)
  {
    Scanner newScan = new Scanner(System.in);
    String fim = "";
    System.out.println("Ao entrar no novo cômodo, o ambiente está mais sereno, você não vê inimigos, no centro é possível ver algo como uma tela de computador com uma mensagem:");
    if(num3==1){
      System.out.println("Você se depara com um pequeno enigma:");
      System.out.println("Eu posso ser o Sol, eu posso ser areia, eu posso ser um pássaro, o que eu sou?");
      System.out.println("Insira sua resposta:");
     fim = newScan.next();
    }
    else if(num3==2){
      System.out.println("Você se depara com um pequeno enigma:");
      System.out.println("Eu posso ser um Deus, um planeta, e medir o calor. O que eu sou?");
      System.out.println("Insira sua resposta:");
     fim = newScan.next();
    }
    else if(num3==3){
      System.out.println("Você se depara com um pequeno enigma:");
      System.out.println("Eu tenho lagos sem água, montanhas sem pedra e cidades sem prédios. O que eu sou?");
      System.out.println("Insira sua resposta:");
     fim = newScan.next();
    }
    return fim;
  }

  public static void erroSala3()
  {
    System.out.println("O estranho mecanismo recebe sua resposta e analisa por alguns segundos...");
    System.out.println(".\n.\n.\n.\n.\n.");
    System.out.println("Resposta INCORRETA");
    System.out.println("Então de todas as paredes e do teto, você pode ver lâminas se formando magicamente como espinhos. Você não tem como desviar");
    System.out.println("Sem tempo para reagir, as lâminas são lançadas a uma velocidade absurda em você.");
    System.out.println("Você morreu! Fim de jogo!");
  }

  public static void acertoSala3(){
     System.out.println("O estranho mecanismo recebe sua resposta e analisa por alguns segundos...");
    System.out.println(".\n.\n.\n.\n.\n.");
    System.out.println("Resposta CORRETA");
    System.out.println("A tela pisca em verde e você pode ver uma das paredes descendo lentamente, revelando uma nova passagem.");
    System.out.println("Você passou da sala do enigma!");
  }
  
  public static void bossFight(int espada, int faca)
  {
    Scanner newScan = new Scanner(System.in);

    int hpBoss = 25;
    int hpUsuario = 15;
    int adaga = faca;
    int dano  = 0;
    int contadorFala1=1;
    int contadorFala2=1;

    if(espada==1)
    {
      dano = 3;
    }
    else if(adaga==1)
    {
      dano =2;
    }
    else
    {
      dano = 1;
    }

    int ataqueDemonio =0;
    int opcaoLuta =0;

    System.out.println("Você inicia uma batalha contra ele, se prepare");
    do
    {
      System.out.println("Seu HP:"+hpUsuario+"/15");
      System.out.println("Hp Boss:"+hpBoss+"/25");
      System.out.println("O que deseja fazer?");
      System.out.println("1.Atacar");
      System.out.println("2.Defender");
      System.out.println("3.Esquivar");
      opcaoLuta = newScan.nextInt();
      limpar();
      if(opcaoLuta==1&&espada==1){
        int ataque = (int) ((Math.random() *4));
        if(ataque==2){
          hpBoss = hpBoss - dano;
          System.out.println("Você acerta! O demonio possui agora "+hpBoss+ " de vida");
          
        }
        else{
          System.out.println("Voce errou, aguarde a proxima chance\n");
        }
      }
      else if(opcaoLuta==1&&faca==1){
          int ataque = (int) ((Math.random() *3));
        if(ataque==2){
          hpBoss = hpBoss - dano;
          System.out.println("Você acerta! O demonio possui agora "+hpBoss+ " de vida\n");
         
          
        }
        else{
          System.out.println("Voce errou, aguarde a proxima chance\n");
        }
        }
        else if(opcaoLuta==1&&espada!=1&&faca!=1){
          int ataque = (int) ((Math.random() *2));
        if(ataque==0){
          hpBoss = hpBoss - dano;
          System.out.println("Você acerta! O demonio possui agora "+hpBoss+ " de vida\n");
          
        }
        else{
          System.out.println("Voce errou, aguarde a proxima chance\n");
        }
        }
    else if(opcaoLuta==2){
      System.out.println("Voce se posiciona para uma defesa ao ataque do inimigo!\n");
    }
    else if(opcaoLuta==3){
      System.out.println("Voce resolve esperar o ataque do oponente e realizar uma esquiva!\n");
      }
  
    //DEMONIO TURNO
    System.out.println("VEZ DO DEMONIO");
  System.out.println("O DEMONIO REALIZA UM ATAQUE");
  if(opcaoLuta==1){
    ataqueDemonio = (int) ((Math.random()*3));
    if(ataqueDemonio==0){
      System.out.println("O DEMONIO REALIZA O ATAQUE COM SUCESSO\n");
      hpUsuario = hpUsuario - 2;
      System.out.println("Você perde 2 de HP!\n");
    }
    else {
      System.out.println("O DEMONIO ERROU O ATAQUE DELE, VOCE TEM NOVAMENTE SUA CHANCE");
    }
  }
    else if(opcaoLuta==2&&espada!=1){
     ataqueDemonio = (int) (Math.random()*3);
     if(ataqueDemonio==0){
       System.out.println("O DEMÔNIO ACERTA!\nMas você já esperava por isso e recebe 1 de dano!\n");
       hpUsuario = hpUsuario-1;
     }
  else{
    System.out.println("O demônio erra!");
  }
    
 }
    else if(opcaoLuta==2&&espada==1){
      ataqueDemonio = (int) (Math.random()*2);
      if(ataqueDemonio==1){
      System.out.println("Você defende o golpe e contra ataca com um corte limpo!\n");
        System.out.println("Ele recebe 2 de dano!");
      hpBoss = hpBoss - 2;
      }
      else{
        System.out.println("O DEMONIO ERROU O ATAQUE DELE, VOCE TEM NOVAMENTE SUA CHANCE");
      }
      
    }
else if(opcaoLuta==3){
  ataqueDemonio= (int) (Math.random()*5);
  if(ataqueDemonio==4){
    System.out.println("Mesmo com seu preparo, ELE ACERTA! Como estava preparando para desviar e não defender, você recebe 3 de dano!");
    hpUsuario = hpUsuario-3;
  }
  else{
    System.out.println("Ele tenta te acertar, mas você esquiva com sucesso!");
  }
}    
 if(espada==1&&hpBoss==16||faca==1&&hpBoss==15||faca!=1&&espada!=1&&hpBoss==15){
   do{
   System.out.println("\n'Você realmente tem potencial! ME ENTRETENHA MAIS!'\n");
     contadorFala1 = 0;
   }while(contadorFala1==1);
 }
  if(espada==1&&hpBoss==7||faca==1&&hpBoss==8||faca!=1&&espada!=1&&hpBoss==10){
    do{
   System.out.println("\n'AINDA NÃO TERMINAMOS AQUI!'\n");
      contadorFala2=0;
    }while(contadorFala2==1);
 }

}while(hpBoss>0&&hpUsuario>0);
    
    if(hpUsuario>0){
      System.out.println("Você finaliza o demônio, tirando sua vida... Analisando melhor a sala, você encontra no fundo dela há uma outra passagem.");
      System.out.println("Você entra, e encontra a sala de tesouros do Demônio, riquezas das mais diversas, armaduras de ouro, espadas de prata, utensílios de prata, barras de ouro, entre outros diversas jóias e pertences valiosos...\n");
      System.out.println("Feliz com sua conquista, você pega o máximo de tesouros possíveis e volta para casa...");
      System.out.println("\t\t\t\t\tVOCÊ VENCEU!\n\t\t\t\t OBRIGADO POR JOGAR!");
    }
     else if(hpBoss>0){
       System.out.println("O Demônio olha para você com um ar de superioridade...\n");
       System.out.println("'Você lutou bem, humano, mas sua ingenuidade e arrogância foram maiores que você...''");
       System.out.println("\t\t\t\t\tVOCÊ MORREU!\n\t\t\t\t\tFIM DE JOGO!");
     }
  }
  } 
