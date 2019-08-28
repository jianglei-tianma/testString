package com.atguigui.java;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 1、方式一：继承Thread类的方式
 * 2、方式二：实现Runnable接口的方式
 * 3、方式三：实现Callable接口
 * 4、方式四：使用线程池executor
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
