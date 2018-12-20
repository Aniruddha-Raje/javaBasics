/**
 * 
 */
package basics.thread;

/**
 * @author Aniruddha.Raje
 *
 */

//volatile is a field modifier,
//while synchronized modifies code blocks and methods.

public class SyncronizedExample {
	public static void main(String args[]) {
		final Table obj = new Table();

		Thread1 th1 = new Thread1(obj);
		Thread2 th2 = new Thread2(obj);
		th1.start();
		th2.start();

		Thread t1 = new Thread() {
			public void run() {
				obj.printTable(5);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				obj.printTable(100);
			}
		};

		t1.start();
		t2.start();
	}
}

class Table {

	synchronized void printTable(int n) {

		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);

			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class Thread1 extends Thread {
	Table t;

	Thread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class Thread2 extends Thread {
	Table t;

	Thread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}
