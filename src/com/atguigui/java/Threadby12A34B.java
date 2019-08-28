package com.atguigui.java;

class Print{
    private int flag = 1;  // �߳�ͨ�ű��
    private int count = 1;
    // ��ӡ�����߳�
    public synchronized void printNum(){
        while(flag!=1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(2*count-1);  // ���Ϊ1��ӡ����
        System.out.print(2*count);
        flag = 2;
        notify();
    }
    // ��ӡ��ĸ�߳�
    public synchronized void printChar(){
        while(flag!=2){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print((char )(count-1+'A'));   // ���Ϊ2��ӡ��ĸ
        flag = 1;
        count++;   
        notify();
    }
}

public class Threadby12A34B {
    public static void main(String[] args) {
       Print print = new Print();
       //�����߳���ִ��
       new Thread(()-> {
           for(int i = 0;i < 26;i++){
               print.printNum();
           }
       }).start();
        new Thread(()-> {
            for(int i = 0;i < 26;i++){
                print.printChar();
            }
        }).start();
    }
}

