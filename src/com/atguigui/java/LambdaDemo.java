package com.atguigui.java;

import java.util.Arrays;
import java.util.List;
@FunctionalInterface
interface MyFoo{
	public void print(int x);
	
	default int add(int x,int y) {
		return x + y;
	}
	
	public static void print2() {
		System.out.println("hello 3306");
	}
}
/**
 * (����) -> {������},���ֻ��һ���βΣ�����+�������Ϳ���ʡ�ԣ�������ֻ��һ��Ҳ����ʡ��
 * 2������ʽ�ӿڲſ�����lambada���ʽ������ֻ��һ��public abstract
 * 3��@FunctionalInterface����ʽ�ӿڵ�ע��
 * 4��default����������������ʵ�ֶ���+ʵ��
 * 5��static���������������Ծ�̬����
 * @author tianma
 *
 */
public class LambdaDemo {
	
	public static void main(String[] args) {
		/*
		 * List<Integer> list = Arrays.asList(1,2,3,4,5);
		 * list.forEach(System.out::println);
		 */
		
		MyFoo test = new MyFoo() {

			@Override
			public void print(int x) {
				// TODO Auto-generated method stub
				System.out.println("*********:"+x);
			}
		
		};
		test.print(333);
		
		//test = (int a) -> {System.out.println("*********:"+a);};
		//test = a -> {System.out.println("*********:"+a);};
		test = (a) -> {System.out.println("*********:"+a);};
		test.print(5);
	}
}
