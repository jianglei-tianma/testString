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
 * (参数) -> {方法体},如果只有一个形参，括号+声明类型可以省略，方法体只有一行也可以省略
 * 2、函数式接口才可以用lambada表达式，里面只有一个public abstract
 * 3、@FunctionalInterface函数式接口的注解
 * 4、default方法的新增，可以实现定义+实现
 * 5、static方法的新增，可以静态调用
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
