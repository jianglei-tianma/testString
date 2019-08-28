package com.atguigui.java;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * �̲߳�����Դ��
 * ���ھ�+�����
 * @author tianma
 *
 */

class Ticket  //ʵ������+ʵ������
{
	private int number =30;
	
	private Lock lock = new ReentrantLock();//List list = new ArrayList();
	
	public  void sale() {
		lock.lock();
		try {
			if(number>0) {
				System.out.println(Thread.currentThread().getName()+"������:\t"+(number--)+"\t��ʣ��:"+number);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}

}

public class ThreadDemo01 {
	public static void main(String[] args) {
		
		final Ticket ticket = new Ticket();
		
		new Thread(() -> {for (int i = 1;i<=40;i++) {ticket.sale();}},"AA").start(); 
		new Thread(() -> {for (int i = 1;i<=40;i++) {ticket.sale();}},"BB").start(); 
		new Thread(() -> {for (int i = 1;i<=40;i++) {ticket.sale();}},"CC").start(); 
		
		/*
		 * new Thread(new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i <=40; i++) {
		 * 
		 * ticket.sale(); }
		 * 
		 * }
		 * 
		 * },"AA").start();
		 * 
		 * new Thread(new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i <=40; i++) {
		 * 
		 * ticket.sale(); }
		 * 
		 * }
		 * 
		 * },"BB").start();
		 * 
		 * new Thread(new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i <=40; i++) {
		 * 
		 * ticket.sale(); }
		 * 
		 * }
		 * 
		 * },"CC").start();
		 * 
		 * new Thread(new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i <=40; i++) {
		 * 
		 * ticket.sale(); }
		 * 
		 * }
		 * 
		 * },"DD").start();
		 */
	}
}
