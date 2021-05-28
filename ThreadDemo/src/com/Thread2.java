package com;

	public class Thread2 implements Runnable
	{

		@Override
		public void run() {
			for(int i=6;i<11;i++)
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
			
		}

	}



