package com.atguigu.java1;

import java.util.Date;

//1.Object����toString()��ʹ��

//2.Object���toString getClass().getName() + '@' + Integer.toHexString(hashCode())

//3.String Date File ��װ��ȶ���д��Object���е�toString()����
//ʹ���ڵ��ö����toString()ʱ�����ء�ʵ�����ݡ�

//4.�����Զ�������дtoString()����

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
