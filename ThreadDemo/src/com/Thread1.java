package com;

public class Thread1 implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<6;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}

}
