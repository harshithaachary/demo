package com.factory;

public class WatchTestingMain {

	public static void main(String[] args) {
		String category = "Kids";

		Watch watch = WatchFactory.getWatch(category);
		watch.getWatchInfo();
		category = "Ladies";

		watch = WatchFactory.getWatch(category);

		watch.getWatchInfo();
		category = "Gents";

		watch = WatchFactory.getWatch(category);

		watch.getWatchInfo();

	}

}
