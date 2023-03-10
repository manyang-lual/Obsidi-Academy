package thread_examples;

public class ThreadExample extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadExample thread1 = new ThreadExample();
		ThreadExample thread2 = new ThreadExample();
		
		thread1.start();
		thread2.start();
	}
	@Override
	public void run() {
		/*
		  	there are two ways to implement thread
			1.By extending the Thread class
			2.By implementing the Runnable interface
			we have to override the run method in thread class
		*/
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
