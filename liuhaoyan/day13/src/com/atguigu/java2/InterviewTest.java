package com.atguigu.java2;

import org.junit.Test;

public class InterviewTest {
	@Test
	public void test3() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);//false
		
		//Integer�ڲ�������IntegerCache�ṹ��IntegerCache�ж�����Integer[],
		//�����˴�-128~127��Χ���������������ʹ���Զ�װ��ķ�ʽ����Integer��ֵ�ķ�Χ��
		//-128~127��Χ��ʱ������ֱ��ʹ�������е�Ԫ�أ�������ȥnew��Ŀ��:���Ч��
		
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);
		
		Integer x = 128;//װ���з�Χ
		Integer y = 128;
		System.out.println(x == y);
		
		Integer z = new Integer(999);
		System.out.println(z);//999
	}
}
