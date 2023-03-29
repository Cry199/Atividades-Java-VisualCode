
import java.util.Scanner;

import entities.HospitalQueueManagement;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HospitalQueueManagement hQM = new HospitalQueueManagement();

		int n = 0, x= -1;
		do 
		{
			System.out.println("(1) Retirar nova senha.");
			System.out.println("(2) Próximo");
			System.out.println("(3) Exibir Quadro");
			System.out.println("(0) Sair");
			n = sc.nextInt();
			
            if(n == 1)
			{
				x++;
                /* System.out.println("A Senha e P"); */
                Boolean p = sc.nextBoolean();

				hQM.fila(x , p);
			}
			else if(n == 2)
			{
                hQM.next();
			}
			else if(n == 3)
			{
				hQM.drawBoard();
			}
			
		} while (n != 0);

        sc.close();
	}

}