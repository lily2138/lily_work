package thread.step1.test;

import thread.step1.ComeThread;
import thread.step1.GoThread;

public class GoComeThreadTest {

	public static void main(String[] args) {
		//1. Thread ����....
		GoThread go = new GoThread("Go");
		ComeThread come = new ComeThread("Come");
		
		//2. start�� ȣ��....
		go.start(); //Runnable ---> run(); --->run(){}
		come.start(); //Runnable ---> run(); --->run(){}

	}

}
