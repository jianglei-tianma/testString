package com.atguigui.java;

class Print{
    private int flag = 1;  // 线程通信标记
    private int count = 1;
    // 打印数字线程
    public synchronized void printNum(){
        while(flag!=1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(2*count-1);  // 标记为1打印数字
        System.out.print(2*count);
        flag = 2;
        notify();
    }
    // 打印字母线程
    public synchronized void printChar(){
        while(flag!=2){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print((char )(count-1+'A'));   // 标记为2打印字母
        flag = 1;
        count++;   
        notify();
    }
}

public class Threadby12A34B {
    public static void main(String[] args) {
       Print print = new Print();
       //数字线程先执行
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

