package app;

import java.util.Scanner;

import entities.HospitalQueueManagement;

public class Main 
{
	public static void main(String[] args) 
	{	
		clearScreen();

		Scanner sc = new Scanner(System.in);
		HospitalQueueManagement hQM = new HospitalQueueManagement();

		int n = 0;
		do 
		{
			System.out.println("\n");
			System.out.println("(1) Retirar nova senha.");
			System.out.println("(2) Próximo");
			System.out.println("(3) Exibir Quadro");
			System.out.println("(4) Filas inteira");
			System.out.println("(0) Sair");
			n = sc.nextInt();

			System.out.println("\n");
			clearScreen();
            if(n == 1)
			{
				hQM.next(n);
			}
			else if(n == 2)
			{
                hQM.next(n);
			}
			else if(n == 3)
			{
				System.out.println("\n");
				hQM.drawBoard();
			}
			else if(n == 4)
			{
				System.out.println("\n");
				hQM.entireQueue();
			}
		} 
		while (n != 0);

        sc.close();
	}

	public static void clearScreen() 
    {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

}