
/*
We create a class that extends Thread and override its run() method to define the task. 
Then, we make an object of this class and call start(), which automatically calls run() and 
begins the thread’s execution.
*/


class PaymentMethod extends Thread
{
	private String type;

	PaymentMethod(String type)
	{
		this.type = type;
	}

	public void run()
	{
		System.out.println("Payment is done by  using " + type + " In the thread of " + Thread.currentThread().getName());

	}



}

class MultiThreadingWithThreadClass
{
	public static void main(String[] args)
	{
		Thread t1 = new PaymentMethod("UPI");
		Thread t2 = new PaymentMethod("CASH");
		Thread t3 = new PaymentMethod("CARD");
		Thread t4 = new PaymentMethod("GPAY");

		t1.start();
		t2.start();
		t3.start();
		t4.start();


	}
}