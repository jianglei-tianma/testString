package com.atguigui.countbywordsthread;

import java.util.Map;

public class MyThread extends Thread{
	//word代表读取的字符串
	private String word;
	//map结构接受<单词，个数>
	public Map<String,Integer> map;
	//生成构造器，传入需要解析的字符串
	public MyThread(String word,Map<String,Integer> map) {
		this.word=word;
		this.map=map;
	}
	
	@Override
	public void run() {
		countword();
	}
	public void countword() {
		synchronized(map) {
			if(map.containsKey(word)) {
				int num = map.get(word);
				map.put(word, num+1);
			}else {
				map.put(word, 1);
			}
		}
	}
}
