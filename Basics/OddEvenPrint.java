
class OddEvenPrinter
{
	private int counter = 1;
	private final int max ;
	private final Object lock = new Object();


	OddEvenPrinter(int max)
	{
		this.max = max;

	}


	void printEven()
	{
		synchronized(lock)
		{
			while(counter <= max)
			{
				while(counter % 2 != 0 )
				{
					try
					{
						lock.wait();
					}
					catch(InterruptedException e){}
				}
			    System.out.println(Thread.currentThread().getName() + ": "+ counter);
				counter ++;
				lock.notifyAll();
			}
		}
	}

	void printOdd()
	{
		synchronized(lock)
		{
			while(counter <=  max)
			{
				while(counter % 2 == 0 )
				{
					try
					{
						lock.wait();
					}
					catch(InterruptedException e){}
				}
				System.out.println(Thread.currentThread().getName() + ": " + counter);
				counter ++;
				lock.notifyAll();

			}
		}
	}

	
}


class OddEvenPrint
{
	public static void main(String[] args)
	{
		OddEvenPrinter printer = new OddEvenPrinter(20);
		Thread oddPrinter = new Thread(printer :: printOdd, "Odd-Thread");
		Thread evenPrinter = new Thread(printer :: printEven, "Even-Thread");

		evenPrinter.start();
		oddPrinter.start();

		try {
            evenPrinter.join();
            oddPrinter.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

		System.out.println("Done BRO");
		

	}
}