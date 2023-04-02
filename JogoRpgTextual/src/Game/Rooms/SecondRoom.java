package Game.Rooms;

public class SecondRoom {
    
    public static int segundaSala(int num2){
        Scanner newScan = new Scanner(System.in);
        int fim = 0;
        if(num2==1){
          System.out.println("Ao entrar no novo cômodo, você logo repara na falta de cor do ambiente, as paredes e chão emanam energias negativas.");
             System.out.println("Você escuta a porta atrás de você se trancando, logo em seguida você consegue escutar um rosnado furioso vindo do centro.");
          System.out.println("Um lobo faminto está barrando seu caminho.");
          System.out.println("O que deseja fazer?");
          System.out.println("1.Atacar");
          System.out.println("2.Defender");
          System.out.println("3.Abrir Mochila");
          fim = newScan.nextInt();
        }
        else if(num2==2){
          System.out.println("Ao entrar no novo cômodo, ele se assemelha a um óasis, tem diversas árvores com frutos chamativos e suculentos, um pequeno riacho cristalino, e uma sensação de paz toma conta do seu corpo.");
          System.out.println("O que você faz?");
          System.out.println("1.Descansar");
          System.out.println("2.Sair da sala");
          System.out.println("3.Explorar");
          fim = newScan.nextInt();
        }
        
        return fim;
      }
}
