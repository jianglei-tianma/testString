package com.atguigui.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {

		// 1��ʹ��Random�ഴ�����������
		Random r = new Random();
		// 2��ʹ��HashSet����
		Set<Integer> hs = new HashSet<Integer>();
		// 3�����HashSet��sizeС��10�Ͳ��ϴ洢

		while (hs.size() < 10) {
			int num = r.nextInt(20) + 1; // ����1~20�������
			if (num % 2 == 0) {
				hs.add(num); // ������ӵ�������
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
