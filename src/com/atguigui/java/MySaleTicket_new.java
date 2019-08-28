package com.atguigui.java;


import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 8、生产者消费者+等待+通知唤醒、调度、轮询
 * @author tianma
 *
 */
public class MySaleTicket_new {

	public static void main(String[] args) {

		new_ticket t = new new_ticket();

		FutureTask<Integer> tesk_1 = new FutureTask<>(() -> {
			for(int i = 0;i<30;i++){
				t.ticketSale();
			}
			return 250;

		});
		FutureTask<Integer> tesk_2 = new FutureTask<>(() -> {
			for(int i = 0;i<30;i++){
				t.ticketSale();
			}
			return 250;

		});
		FutureTask<Integer> tesk_3 = new FutureTask<>(() -> {
			for(int i = 0;i<30;i++){
				t.ticketSale();
			}
			return 250;

		});

		Thread t1 = new Thread(tesk_1, "AA");
		Thread t2 = new Thread(tesk_2, "BB");
		Thread t3 = new Thread(tesk_3, "CC");

		t1.start();
		t2.start();
		t3.start();
	}

}

class new_ticket {

	private int ticket = 100;

	ReentrantLock lock = new ReentrantLock();
	
	public void ticketSale() throws InterruptedException {
		Thread.currentThread().sleep(200);
		lock.lock();
		try {
			if(this.ticket <= 0){
				
				System.out.println("票已售完");
				
				return;
			}
				
			this.ticket--;
	
			System.out.println(Thread.currentThread().getName() + "卖出一张票，余票为：" + this.ticket);
				
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally{
			
			lock.unlock();
		}
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

}