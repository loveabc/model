package com.imooc.model;

public class Test {
	public static void main(String[] args) {
		Single_Hungery s1 = Single_Hungery.getInstance();
		Single_Hungery s2 = Single_Hungery.getInstance();
		System.out.println(s1 == s2);
		Single_Lazy s3 = Single_Lazy.getInstance();
		Single_Lazy s4 = Single_Lazy.getInstance();
		System.out.println(s3 == s4);
	}
}
