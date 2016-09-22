package com.imooc.model;

/*
 * 单例模式练习
 * 单例中包含"懒汉"和"饿汉"两种模式
 * 懒汉模式在第一次获取实例时创建对象,线程不安全,需要使用同步
 * 饿汉模式是在类加载时创建对象,线程安全
 */
//饿汉模式
public class Single_Hungery {
	// 1.先将构造方法私有化,防止外部类通过new获取类实例
	private Single_Hungery() {

	}

	// 2.创建类实例,在类加载时该对象就会被创建
	private static Single_Hungery single = new Single_Hungery();

	// 3.给外面提供一个可以获得此类实例的方法,此方法需要属于这个类而不是属于对象
	public static Single_Hungery getInstance() {
		return single;
	}
}
