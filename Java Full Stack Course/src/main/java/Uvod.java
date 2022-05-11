import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class Uvod {
	
	
	public static boolean isPrime(int num) {
		int temp;
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if(temp == 0) {
				isPrime = false;
				break;
			}
			
		}
		
		
		return isPrime;
	}

	

	public static void main(String[] args) {

		//System.out.println(isPrime(4));
		
		
	/*	Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				lock1.lock();
				System.out.println("Inside thread1 on lock1");
				lock2.lock();
				System.out.println("Inside thread2 on lock2");
				lock2.unlock();
				lock1.unlock();
				
			}
		});
		
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				lock2.lock();
				System.out.println("Inside thread2 on lock1");
				lock1.lock();
				System.out.println("Inside thread2 on lock2");
				lock2.unlock();
				lock1.unlock();
			}
		});
		
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Inside main method");
		*/
		
		
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	
		
	}
	

}
