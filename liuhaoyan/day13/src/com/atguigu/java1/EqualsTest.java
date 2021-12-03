package com.atguigu.java1;

import java.util.Date;

//4.��String Date File ��װ��ȶ���д��Object���е�equals������
//��д�Ժ�ȽϵĲ����������õĵ�ַ�Ƿ���ͬ�����ǱȽ���������ġ���ʵ�����ݡ��Ƿ���ͬ

//5.ͨ������£������Զ���������ʹ��equals()�Ļ���Ҳͨ���ǱȽ���������ġ�ʵ�����ݡ��Ƿ���ͬ
//����Ҫ��Object���е�equals��������������д


public class EqualsTest {

	public static void main(String[] args) {
		
		//������������
		int i = 10;
		int j = 10;
		double d = 10.0;
		System.out.println(i == j);  //true
		System.out.println(i == d);  //true  �����������͵Ļ���������
		
		boolean b = true;
		
		char c = 10; //char û�д����ţ������Ǹ���
		System.out.println(i == c);// true
		
		char c1= 'A';
		char c2= 65;
		System.out.println(c1 == c2);
		
		//��������:
		Customer cust1 = new Customer("Tom",21);
		Customer cust2 = new Customer("Tom",21);
		System.out.println(cust1 == cust2); //false ��Ϊ�Ƚ�����������ĵ�ֵַ
		
		String str1 = new String("atguigu");
		String str2 = new String("atguigu");
		System.out.println(str1 == str2); //false
		System.out.println("-----------------");
		System.out.println(cust1.equals(cust2));  //false  Object�����equals����(==) ��д��Ϊtrue
		System.out.println(str1.equals(str2));	//true   String�����equals����
		
		Date date1 = new Date(32432525324L);
		Date date2 = new Date(32432525324L);
		System.out.println(date1.equals(date2));//true ֱ�ӱȽ������Ƿ����
		
	}
	
}
