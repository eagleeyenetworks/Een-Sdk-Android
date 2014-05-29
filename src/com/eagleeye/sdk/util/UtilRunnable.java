package com.eagleeye.sdk.util;

public class UtilRunnable {
	
	public static void runIfNotNull(Runnable runnable) {
		if(runnable != null) {
			runnable.run();}
	}
}
