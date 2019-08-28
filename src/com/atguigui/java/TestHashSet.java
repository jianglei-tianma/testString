package com.atguigui.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {

		// 1、使用Random类创建随机数对象
		Random r = new Random();
		// 2、使用HashSet集合
		Set<Integer> hs = new HashSet<Integer>();
		// 3、如果HashSet的size小于10就不断存储

		while (hs.size() < 10) {
			int num = r.nextInt(20) + 1; // 产生1~20的随机数
			if (num % 2 == 0) {
				hs.add(num); // 将其添加到集合中
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		if(hs.containsAll(list)) {
			hs.removeAll(list);
		}
		
	    for (Integer i : hs) {
		  System.out.println(i);
	  
	    }
		 

	}
}
