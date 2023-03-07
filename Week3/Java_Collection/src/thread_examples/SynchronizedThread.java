package thread_examples;

class SynchronizedThread {

	public void printTable(int n){//synchronized method  
		synchronized(this) {
			for(int i=1;i<=5;i++){  
			     System.out.println(n*i);  
			     try{  
			      Thread.sleep(400);  
			     }catch(Exception e){System.out.println(e);}  
			  } 
		} 
	  
	}
	public static void main(String args[]){  
		SynchronizedThread obj = new SynchronizedThread();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
	}  
}
//Thread 1 that is going to run the synchronized method
class MyThread1 extends Thread{  
	SynchronizedThread  t;  
	MyThread1(SynchronizedThread t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(5);  
	}
}  

//Thread2 that is going to run the method
class MyThread2 extends Thread{  
	SynchronizedThread  t;  
	MyThread2(SynchronizedThread t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}
}  