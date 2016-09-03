/**
 * 
 */
package com.ligotrade.main;

import com.ligotrade.common.TradeContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ming.li
 *
 */
public class AppMain {
	
	private static final Logger logger = LoggerFactory.getLogger(AppMain.class);
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
