package entities;

import java.util.Random;

public class HospitalQueueManagement 
{
	private String[] queue;
	private int last = -2;
	private int next = -1;

	private String[] filas1 = new String[5];
	private int x = -1;

	public HospitalQueueManagement() {}
	
	public HospitalQueueManagement(String[] queue, int last, int next) {
		this.queue = queue;
		this.last = last;
		this.next = next;
	}

	public String[] getPassword(boolean preferential)
	{
		return queue;
	}
	
	public void next(int x)
	{
		if(x == 1)
		{
			fila();
		}

		if(x == 2)
		{
			preferencial();	

			next++;
			last++;
		}
	}

	public void drawBoard()
	{
		toFillIn();

		System.out.printf("|---------------------|\n");

		if(next != -1)
		{
			System.out.printf("| %s |\n", String.format("%-19s","Próximo: " + queue[next]));
		}
		else
		{
			System.out.printf("|         Null        |\n");
		}
		
		System.out.printf("|---------------------|\n");
		System.out.printf("|   Últimas senhas:   |\n");

		if(last > 1)
		{
			System.out.printf("| %s |\n", String.format("%-19s", queue[last] + ", " + queue[last - 1] + ", " + queue[last - 2]));
		}
		else if(last > 0)
		{
			System.out.printf("| %s |\n", String.format("%-19s", queue[last] + ", " + queue[last - 1]));
		}
		else if(last > -1)
		{
			System.out.printf("| %s |\n", String.format("%-19s", queue[last])); 
		}
		else
		{
			System.out.printf("|         Null        |\n");
		}

		System.out.printf("|---------------------|\n");
	}

	public void entireQueue()
	{
		for (int i = 0; i < queue.length; i++) 
		{
			System.out.print(queue[i] + " ");

			if((i + 1) % 3 == 0)
			{
				System.out.println();
			}
		}
	}
	
	private void fila()
	{	
		x++;

		if(x == filas1.length)
		{
			String[] filas2 = new String[filas1.length];
			
			filas2 = filas1;
			
			filas1 = new String[filas1.length * 2];

            for (int i = 0; i < filas2.length; i++)
            {
                filas1[i] = filas2[i];
            }     
		}
		filas1[x] = preferredTrueOrFalse();

		toFillIn();
	}
	
	private String preferredTrueOrFalse()
	{
		Random rd = new Random();
		return (rd.nextInt(900) + 100) + (rd.nextInt(4) == 1 ? "P" : "N");
	}

    private void preferencial() 
    {
		toFillIn();

        String[] queueTemp = new String[queue.length];
        int j = 0;
        for (int i = 0; i < queue.length; i++) 
        {
            if (queue[i].charAt(queue[i].length() - 1) == 'P') 
            {

                queueTemp[j] = queue[i];
                j++;
            }
        }
        for (int i = 0; i < queue.length; i++) 
        {
            if (queue[i].charAt(queue[i].length() - 1) == 'N') 
            {
                queueTemp[j] = queue[i];
                j++;
            }
        }
        
        queue = queueTemp;
    }

	private void toFillIn()
	{
		for (int i = 0; i < filas1.length; i++) 
        {
            if(filas1[i] == null)
            {
                filas1[i] = "0";
            }
        }

		queue = filas1;
	}

}