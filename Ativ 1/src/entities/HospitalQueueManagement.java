package entities;

import java.util.Arrays;
import java.util.Random;

public class HospitalQueueManagement 
{
	private String[] queue;
	private int last;
	private int next;
	
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
	
	public void setQueue(String[] queue) {
		this.queue = queue;
	}

	public String[] getPassword(boolean preferential)
	{
		return queue;
	}
	
	public void next()
	{
       preferencial();

       
	}
	
	public void drawBoard()
	{
		for (String c : this.queue) 
        {
            System.out.println(c);
        }
	}
	
    String[] filas1 = new String[5];
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

        for (int i = 0; i < filas1.length; i++) 
        {
            if(filas1[i] == null)
            {
                filas1[i] = "0";
            }
        }
        
        filas1[x] = senhaAle(preferential);

        queue = filas1;
	}
	
	public String senhaAle(boolean preferential)
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

    protected void preferencial() 
    {
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

	@Override
	public String toString() {
		return " " + Arrays.toString(queue);
	}
}