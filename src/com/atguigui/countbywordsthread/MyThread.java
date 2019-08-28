package com.atguigui.countbywordsthread;

import java.util.Map;

public class MyThread extends Thread{
	//word�����ȡ���ַ���
	private String word;
	//map�ṹ����<���ʣ�����>
	public Map<String,Integer> map;
	//���ɹ�������������Ҫ�������ַ���
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
