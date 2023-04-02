package Game.Rooms;

public class ThirdRoom {
 
    public static String terceiraSala(int num3){
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

        public static void erroSala3(){
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
}
