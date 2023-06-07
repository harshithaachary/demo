package com.single;

import java.util.concurrent.Callable;

public class CallableTask implements Callable {
	
	@Override
	public Object call()
	{
		MySingleton obj = MySingleton.getSingletonObject();
		return obj;
	}

}
