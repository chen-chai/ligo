/**
 * 
 */
package com.ligotrade.main;

import com.ligotrade.common.TradeContext;

/**
 * @author ming.li
 *
 */
public class AppMain {
	
	Logger
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TradeContext.getInstance();
		try {
			Thread.sleep(10000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
