package com.atguigui.java;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 1����ʽһ���̳�Thread��ķ�ʽ
 * 2����ʽ����ʵ��Runnable�ӿڵķ�ʽ
 * 3����ʽ����ʵ��Callable�ӿ�
 * 4����ʽ�ģ�ʹ���̳߳�executor
 * @author tianma
 *
 */

/*
 * class MyThread implements Runnable{
 * 
 * @Override public void run() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */

class MyThread2 implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("*********come in call");
		return 200;
	}
	
}

public class ThreadDemo02 {
	
	public static void main(String[] args) {
		
		//FutureTask ft = new FutureTask(new MyThread());
		//new Thread(ft,"XXX").start();
		
		
	}
}
