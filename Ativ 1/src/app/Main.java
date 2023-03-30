package app;

import java.util.Scanner;

import entities.HospitalQueueManagement;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HospitalQueueManagement hQM = new HospitalQueueManagement();

		int n = 0, x= -1;

		hQM.setLast(-2);
		hQM.setNext(-1);
		do 
		{
			System.out.println("(1) Retirar nova senha.");
			System.out.println("(2) Próximo");
			System.out.println("(3) Exibir Quadro");
			System.out.println("(4) Filas inteira");
			System.out.println("(0) Sair");
			n = sc.nextInt();
			
            if(n == 1)
			{
				x++;
                System.out.println("A Senha e preferencial (y/n)"); 
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
			else if(n == 4 && x != -1)
			{
				hQM.entireQueue();
			}
		} 
		while (n != 0);

        sc.close();
	}

}