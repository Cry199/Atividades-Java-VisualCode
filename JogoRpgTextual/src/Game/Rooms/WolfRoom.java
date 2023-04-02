package Game.Rooms;

import java.util.Scanner;

public class WolfRoom 
{
  private int lobo;

  

  public static int salaLobo(Scanner sc,int lobo)
  {
    System.out.println("O que quer fazer?");
    System.out.println("1.Esperar e contra-atacar");
    System.out.println("2.Abrir Mochila");
    System.out.println("3.Tentar fugir");
    lobo = sc.nextInt();
    System.out.println();

    return lobo;
  }

  public static void finalLobo(Scanner sc, int lobo, int chance)
  {
    if(lobo == 1)
    {
      System.out.println("Você se prepara, e o lobo avança novamente, buscando rasgar seu pescoço, porém, já sabendo seu curso de ação, você consegue se esquivar e se posicionar em cima do lobo, usando seu peso para mantê-lo no chão.");
      System.out.println("Com ele preso, você decide:");
      System.out.println("1.Matar o lobo");
      System.out.println("2.Nocautear o lobo");
      int decisaoLobo = sc.nextInt();
      System.out.println();

      if(decisaoLobo==1)
      {
        System.out.println("Você então usa toda sua força em um golpe certeiro na cabeça do animal, diversas vezes, ele até tenta se defender e te arranhar, mas estava enfraquecido devido à fome, e você consegue finalizá-lo.");
      }
      else if(decisaoLobo==2)
      {
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
            
        }
      }
    }
}
