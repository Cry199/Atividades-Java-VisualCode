package entities;

import java.util.Random;

public class HospitalQueueManagement 
{
	private String[] queue;
	private int last;
	private int next;

	String[] filas1 = new String[5];
	
	public HospitalQueueManagement() {}
	
	public HospitalQueueManagement(String[] queue, int last, int next) {
		this.queue = queue;
		this.last = last;
		this.next = next;
	}
	
	public int getLast() {
		return last;
	}
    
	public void setLast(int last) {
		this.last = last;
	}

	public int getNext() {
		return next;
	}
	public void setNext(int next) {
		this.next = next;
	}
	
	public void setQueue(String[] queue) 
	{
		this.queue = queue;
	}

	public String[] getPassword(boolean preferential)
	{
		return queue;
	}
	
	public void next()
	{	
		preferencial();

		next++;
		last++;
	}
	
	public void drawBoard()
	{

		System.out.printf("|---------------------|\n");
		System.out.printf("| %s |\n", String.format("%-19s","Próximo: " + queue[next]));
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
		for (String s: queue) 
		{
			System.out.println(s);
		}
	}
	
	public void fila(int x, boolean preferential)
	{	
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
		filas1[x] = senhaAle(preferential);

		toFillIn();
	}
	
	private String senhaAle(boolean preferential)
	{
		Random gerador = new Random();
		int n = gerador.nextInt(900) + 100;
		
		if(preferential == true)
		{
			return n + "P";
		}
		else
		{
			return n + "N";
		}
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