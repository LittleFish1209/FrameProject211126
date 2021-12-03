package com.atguigu.java1;

import java.util.Date;

//1.Object类中toString()的使用

//2.Object类的toString getClass().getName() + '@' + Integer.toHexString(hashCode())

//3.String Date File 包装类等都重写了Object类中的toString()方法
//使得在调用对象的toString()时，返回“实体内容”

//4.可在自定义类重写toString()方法

public class ToStringTest {
	public static void main(String[] args) {

		Customer cust1 = new Customer("Tom",21);
		System.out.println(cust1.toString());
		System.out.println(cust1);
		
		String str = new String("MM");
		System.out.println(str);//MM
		
		Date date = new Date(4564564564543L);
		System.out.println(date.toString());//Fri Aug 24 23:36:04 JST 2114
		
	}
}
