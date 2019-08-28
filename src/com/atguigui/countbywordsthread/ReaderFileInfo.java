package com.atguigui.countbywordsthread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URLDecoder;

public class ReaderFileInfo {
	
	public StringBuffer getContent() throws Exception{
		
		StringBuffer sb = new StringBuffer();
		//获取需要的文件路径
		String path = URLDecoder.decode(ReaderFileInfo.class.getResource("/eng.txt").getPath(), "UTF-8");
		BufferedReader br = new BufferedReader(new FileReader(path));
		//进行文件读取
		String tmp = "";
		while((tmp=br.readLine())!=null) {
			sb.append(""+tmp);
		}
		br.close();
		return sb;
	}
}
