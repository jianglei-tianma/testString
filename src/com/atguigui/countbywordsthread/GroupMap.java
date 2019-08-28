package com.atguigui.countbywordsthread;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GroupMap {
	private ExecutorService pool;
	
	public Map<String,Integer> mycount() throws Exception{
		StringBuffer sb = new ReaderFileInfo().getContent();
		String[] words = sb.toString().split("[\\s|\\.|\\,|!]");
		System.out.println(Arrays.toString(words));
		
		HashMap<String,Integer> map = new HashMap<>();
		
		ExecutorService pool = Executors.newCachedThreadPool();
		for(int i=0;i<words.length;i++) {
			if(!words[i].trim().equals("")) {
				pool.execute(new MyThread(words[i].trim(), map));
				
			}
		}
		pool.shutdown();
		while(pool.isTerminated()) {
			
		}
		
		return map;
		
	}
	
}
