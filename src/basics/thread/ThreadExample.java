/**
 * 
 */
package basics.thread;

/**
 * @author Aniruddha.Raje
 *
 */
// After starting a thread, it can never be started again.
// If you does so, an IllegalThreadStateException is thrown.
public class ThreadExample {

	public static void main(String[] args) {
		ExtendsThread ob1 = new ExtendsThread();
		ob1.start();

		ImplementsRunnable ob2 = new ImplementsRunnable();
		Thread t1 = new Thread(ob2);
		Thread t2 = new Thread(ob2);
		Thread t3 = new Thread(ob2);
		t1.start();
		// t1.start(); Not recomended, will cause IllegalThreadStateException
		t1.setName("Name : T1 : ");
		t2.setPriority(1);

		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		t3.setDaemon(true);
		t3.setName("Name : T3 : ");
		t3.start();
		
		t2.start();
		t2.setName("Name : T2 : ");
		t2.setPriority(9);
	}
}

class ExtendsThread extends Thread {
	public void run() {
		System.out.println("Thread extention method is running...\n");
	}
}

class ImplementsRunnable implements Runnable {
	public void run() {
		System.out.println("Implements => " + Thread.currentThread().getName());
		printNumbers();
	}
	
	//private synchronized void printNumbers() {
	private void printNumbers() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}