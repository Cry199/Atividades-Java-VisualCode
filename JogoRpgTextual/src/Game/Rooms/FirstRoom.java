package Game.Rooms;

import java.util.Scanner;

import Game.EndOfTheGame.EndGame;

public class FirstRoom 
{
  public void firstRoom()
  {
    if(num1==1&&resp1==1)
    {
      System.out.println("Você tenta lutar contra a cobra com suas mãos nuas, a falta de informação sobre o animal te leva a fazer movimentos imprudentes e você é mordido e envenenado.");
      System.out.println("Aos poucos o veneno começa a fazer efeito e você sente suas forças se esvaindo, você então pode sentir o abraço da morte.");
      System.out.println("Fim de jogo!");
    }
    else if(num1==1&&resp1==2)
    {
      System.out.println("Com medo do que o animal seja peçonhento ou mortal, você decide sair da sala, evitando ao máximo chamar a atenção da cobra.");
      salaCobra = (int) (Math.random() *2);
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
    else if(num1==1&&resp1==3)
    {
      limpar();
      System.out.println("Abrindo sua mochila e vasculhando por possíveis materiais, você encontra uma faca pequena.");
      System.out.println("1.Equipar");
      System.out.println("2.Guardar");
      faca = newScan.nextInt();
      //System.out.println();
      limpar();
      if(faca==1){
        System.out.println("Você equipou a faca");
        
      }
      else if(faca ==2){
        System.out.println("Você guardou a faca");
      }
      System.out.println();
    System.out.println("Atiçada pelos sons de você mexendo em suas coisas, o animal se aproxima ferozmente.");
      if(faca==1){
        System.out.println("Já esperando por isso, você se prepara para o bote.");
        System.out.println("Ela avança, e você acerta uma estocada certeira em sua cabeça, finalizando-a.");
        System.out.println("Orgulhoso de seu sucesso, você recupera sua faca e abre a próxima porta.");
      }
      else{
        System.out.println("Desajeitado enquanto tenta guardar suas coisas novamente, você não consegue reagir ao ataque e sente uma mordida na sua perna.");
        System.out.println("Assustado, você cai no chão. A cobra continua te atacando e você sente sua vida se esvaindo.....");
        System.out.println("Você morreu! Fim de jogo");
      }
      
      
    }
    else if(num1==1&&resp1==4)
    {
      int rezar = (int) (Math.random() * 1);
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
  }

  public static int firstRoom(int num)
  {
    Scanner sc = new Scanner(System.in);
    int fim = 0;

    if(num == 1)
    {
      System.out.println("Você entra em uma sala escura... À sua frente é possível ouvir um 'SSSSSsssss' com um breve som de chocalhos. Logo você reconhece que se trata de uma cobra");
      System.out.println("O que deseja fazer?");
      System.out.println("1.Lutar");
      System.out.println("2.Correr");
      System.out.println("3.Abrir mochila");
      System.out.println("4.Rezar");
      fim = sc.nextInt();
    }
    else if(num == 2)
    {
      System.out.println("O centro da sala está bem iluminado, com tamanho destaque no centro, o resto da sala está um completo breu, é possível ver um pequeno punhado de moedas de ouro.");
      System.out.println("O que deseja fazer?");
      System.out.println("1.Pegar as moedas");
      System.out.println("2.Analisar os arredores");
      System.out.println("3.Sair da sala");
      fim = sc.nextInt();
    }
    else if(num == 3)
    {
      System.out.println("Ao entrar na sala você analisa seus arredores, um ambiente quadrado com paredes claras, um pouco sujas devidas ao tempo, porém muito bonitas ainda assim, o chão se mistura em um quadriculado preto e branco, e ao centro você vê uma espada fincada no chão.");
      System.out.println("O que deseja fazer?");
      System.out.println("1.Se aproximar");
      System.out.println("2.Analisar melhor os arredores");
      System.out.println("3.Sair da sala");
      fim = sc.nextInt();
    }
        
    return fim;
  }


}
