package com.atguigui.java;

public class StringByNumber {
	// �����������������Ϊ�ַ�����ͨ���ݹ�ʵ��
	public static String reverse(int a) {
		if (a < 0)
			return "";
		if (a < 10) 
			return Integer.toString(a);
		
		int last = a - (a / 10) * 10;// ȡ��������������һλ
		return Integer.toString(last) + reverse(a / 10);// �ݹ�������һλ��ǰ��ĵ�������
	}

	public static void main(String[] args) {

		int x = 123023040;
		String rev = reverse(x);
		System.out.println(rev);
		System.out.println(reverse(123));
	}
}
