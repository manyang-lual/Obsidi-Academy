package thread_examples;

public class RunnableThread implements Runnable{
	
	public void run() {
		System.out.println("Starting the thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * create an instance of the thread class that implements Runnable
		 * If the class implements the Runnable interface, the thread can be run by 
		 * passing an instance of the class to a Thread object's constructor 
		 * and then calling the thread's start() method:
		 * 
		 **/
		
		//Add that instance thread as parameter to the Thread creation
		RunnableThread myThread = new RunnableThread();
		Thread thread1 = new Thread(myThread);
		Thread thread2 = new Thread(myThread);
		thread1.start();
		thread2.run();
		
		System.out.println(thread1.getState());
		
		System.out.println(thread2.getClass());
		
		System.out.println("The main thread prints this");

	}

}
