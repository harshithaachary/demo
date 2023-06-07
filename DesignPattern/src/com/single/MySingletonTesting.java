package com.single;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MySingletonTesting {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

	FutureTask[] ft = new FutureTask[10];
	
	for(int i=0;i<10;i++) {
		CallableTask ct = new CallableTask();
		ft[i] = new FutureTask(ct);
		
		Thread t= new Thread(ft[i]);
		t.start();
	}
	for(int i=0; i<10;i++)
	{
		MySingleton obj = (MySingleton)ft[i].get();
		obj.display();
	}
	
	
	}

}
