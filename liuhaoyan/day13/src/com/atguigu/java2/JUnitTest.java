package com.atguigu.java2;

import java.util.Date;

import org.junit.Test;

/*
 	Java�е�Junit��Ԫ����
	
	@��main�������Ե����𣺿���һ����һ���ֵĲ�
	
	����:
	1.ѡ�е�ǰ���� - �Ҽ�ѡ��:build path - add libraries - JUnit 4
	2.����Java�࣬���е�Ԫ���ԡ�
		��ʱ��Java��Ҫ��: 1.������public�� 2.�ṩ�������޲ι�����
	3.������������Ԫ���Է�����
		��ʱ�ĵ�Ԫ���Է���:������Ȩ����public,û�з���ֵ,û���β�
		
	4.�˵�Ԫ���Է�������Ҫ����ע��:@Test,������import org.junit.Test;
	
	5.�����õ�Ԫ���Է����Ժ󣬾Ϳ����ڷ������ڲ�����صĴ���
	6.д������Ժ����˫����Ԫ���Է��������Ҽ���run as - JUnit Test
	
	˵����
	1.���ִ�н��û���κ��쳣������
	2.���ִ�н�������쳣������
	
*/
public class JUnitTest {
	
	int num = 10;
	
	@Test
	public void testEquals() {
		String s1 = "MM";
		String s2 = "MM";
		System.out.println(s1.equals(s2));
		//ClassCastException���쳣
//		Object obj = new String("GG");
//		Date date =(Date)obj;
		
	System.out.println(num);
	show();
	}
	
	public void show() {
		num = 20;
		System.out.println("show()..");
	}
	
	
}
