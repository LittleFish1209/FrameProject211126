package com.atguigu.java1;

import java.util.Date;

//4.像String Date File 包装类等都重写了Object类中的equals方法，
//重写以后比较的不是两个引用的地址是否相同，而是比较两个对象的“是实体内容”是否相同

//5.通常情况下，我们自定义的类如果使用equals()的话，也通常是比较两个对象的“实体内容”是否相同
//就需要对Object类中的equals（）方法进行重写


public class EqualsTest {

	public static void main(String[] args) {
		
		//基本数据类型
		int i = 10;
		int j = 10;
		double d = 10.0;
		System.out.println(i == j);  //true
		System.out.println(i == d);  //true  基本数据类型的话不管类型
		
		boolean b = true;
		
		char c = 10; //char 没有带引号，所以是个数
		System.out.println(i == c);// true
		
		char c1= 'A';
		char c2= 65;
		System.out.println(c1 == c2);
		
		//引用类型:
		Customer cust1 = new Customer("Tom",21);
		Customer cust2 = new Customer("Tom",21);
		System.out.println(cust1 == cust2); //false 因为比较是两个对象的地址值
		
		String str1 = new String("atguigu");
		String str2 = new String("atguigu");
		System.out.println(str1 == str2); //false
		System.out.println("-----------------");
		System.out.println(cust1.equals(cust2));  //false  Object里面的equals方法(==) 重写后为true
		System.out.println(str1.equals(str2));	//true   String里面的equals方法
		
		Date date1 = new Date(32432525324L);
		Date date2 = new Date(32432525324L);
		System.out.println(date1.equals(date2));//true 直接比较内容是否相等
		
	}
	
}
