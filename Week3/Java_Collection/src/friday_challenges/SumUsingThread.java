package friday_challenges;

public class SumUsingThread implements Runnable {
	double a, b, sum=0;
	
	public SumUsingThread(double a, double b) {
		this.a=a;
		this.b=b;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public double add(double a, double b) {
		
		synchronized(this) {
			for(double i=a; i<=b; i++) {
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumUsingThread sum1 = new SumUsingThread(1,50);
		SumUsingThread sum2 = new SumUsingThread(51,100);
		
		Thread thread1 = new Thread(sum1);
		Thread thread2 = new Thread(sum2);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
