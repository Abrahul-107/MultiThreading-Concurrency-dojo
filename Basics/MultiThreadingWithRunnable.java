/*
Best Use Cases for Thread and Runnable
Use extends Thread: if your class does not extend any other class.
Use implements Runnable: if your class already extends another class 
(preferred because Java doesn’t support multiple inheritance).
*/



class PaymentMethod implements Runnable
{
	private String type;

	PaymentMethod(String type)
	{
		this.type = type;
	}

	public void run()
	{
		System.out.println("Payment is done via --- " + type +" Method and the thead is " + Thread.currentThread().getName());
	}

}

class MultiThreadingWithRunnable
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new PaymentMethod("UPI"));
		Thread t2 = new Thread(new PaymentMethod("CASH"));
		Thread t3 = new Thread(new PaymentMethod("CARD"));

		t1.start();
		t2.start();
		t3.start();
	}
}