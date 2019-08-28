package com.atguigui.java;

public class StringByNumber {
	// 输入整数后，逆序输出为字符串，通过递归实现
	public static String reverse(int a) {
		if (a < 0)
			return "";
		if (a < 10) 
			return Integer.toString(a);
		
		int last = a - (a / 10) * 10;// 取得这个整数的最后一位
		return Integer.toString(last) + reverse(a / 10);// 递归输出最后一位和前面的倒序数字
	}

	public static void main(String[] args) {

		int x = 123023040;
		String rev = reverse(x);
		System.out.println(rev);
		System.out.println(reverse(123));
	}
}
