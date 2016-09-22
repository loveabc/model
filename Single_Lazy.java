package com.imooc.model;

/*
 * 单例模式之懒汉模式
 */
public class Single_Lazy {

	private Single_Lazy() {

	}

	private static Single_Lazy single;
	static Object obj = new Object();

	public static Single_Lazy getInstance() {
		if (single == null) {
			synchronized (obj) {
				if (single == null) {
					single = new Single_Lazy();
				}
			}
		}
		return single;
	}
}
