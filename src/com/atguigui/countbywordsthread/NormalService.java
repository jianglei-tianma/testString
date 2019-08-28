package com.atguigui.countbywordsthread;

import java.util.Map;

public class NormalService {
//	public Map show() throws Exception{
//		GroupMap gm = new GroupMap();
//		Map<String, Integer> mycount = gm.mycount();
//		return mycount;
//	}
	
	public static void main(String[] args) throws Exception {
		GroupMap gm = new GroupMap();

		Map<String, Integer> mycount = gm.mycount();
		System.out.println(mycount);
	}
}
