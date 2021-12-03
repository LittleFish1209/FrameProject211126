package com.atguigu.java1;

public class ObjectTest {
	public static void main(String[] args) {
		Order order = new Order();
		System.out.println(order.getClass().getSuperclass()); //getClass 获取这个创建这个对象的类
			
	}
	
}

class Order{
	
	
}