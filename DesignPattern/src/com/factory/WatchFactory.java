package com.factory;

public class WatchFactory {
	
	private Watch watch;
	
	public static Watch getWatch(String category) {
		
		Watch watch = null;
		
		switch(category)
		{
		case "Ladies" :
			watch = new LadiesWatch();
			break;
		case "Kids" :
			watch = new KidsWatch();
			break;
		case "Gents" :
			watch = new GentsWatch();
			break;
			default:
				System.out.println("sorry dont manufature the watch you require");
		}
		return watch;
	}

}
