package com.atguigu.java2;

import org.junit.Test;

/*��װ���ʹ��:
	1.java�ṩ��8�ֻ����������ݶ�Ӧ�İ�װ�࣬ʹ�û����������͵ı��������������

	2.���յģ������������ͣ���װ�࣬String����֮����໥ת��
	
	
*/

public class WrapperTest {

	@Test
	public void test5() {
		String str1 = "123";
	//	int num1 = (int)str1;
	//	Integer in1 =(Integer)str1;
		//���ܻᱨNumberFormatException
		int num2 = Integer.parseInt(str1);
		System.out.println(num2); //123 ֱ�Ӱ��������ȥ��
		
		String str2 ="true";
		boolean b1 = Boolean.parseBoolean(str2);
		System.out.println(b1);
	}
	
	//�����������ͣ���װ��--->String���ͣ�����String���ص�valueOf(Xxx xxx)
	@Test
	public void test4() {
		
		int num1 = 10;
		//��ʽ1:��������
		String str1 = num1 + "";
		//��ʽ2:����String��valueOf(Xxx xxx)
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);//"12.3"
		
		Double d1 = new Double(12.4);
		String str3 = String.valueOf(d1);
		System.out.println(str2);//12.3
		System.out.println(str3);//12.4
	}
	
	
	
	
	
	//jdk5.0�Զ�װ�����Զ�����
	@Test
	public void test3() {
		int num1 = 10;
		//������������-->��װ��Ķ���
		method(num1);//Object obj = num1;
		
		//�Զ�װ�䣺
		int num2=10;
		Integer in1 = num2;//�Զ�װ��
		
		boolean b1 = true;
		Boolean b2 = b1;//�Զ�װ��
		
		//�Զ�����:��װ��--->������������
		System.out.println(in1.toString());
		
		int num3 = in1;
		
		
	}
	
	public void method(Object obj) {
		System.out.println(obj);
	}
	
	//��װ��--->������������:��װ���xxxValue����
	
	@Test
	public void test2() {
		Integer in1 = 12;
		int i1 = in1.intValue(); //ת��Ϊ������������
		System.out.println(i1+1);//13
		
		Float f1 = 12.3f;
		float f2 = f1.floatValue();
		System.out.println(f2 + 1);//13.3
	}
	
	
	//������������--->��װ��,���ð�װ��Ĺ�����
	@Test
	public void test1() {
		int num1 = 10;
		
//		Integer in1=new Integer(num1);
		Integer in1 = Integer.valueOf(num1);
		System.out.println(in1);
		
		Integer in2 = new Integer("123");
//		Integer in2 =  10;
		System.out.println(in2.toString());
		
//		Float f1 = new Float(12.3f);
		Float f1 = 12.3f;
		Float f2 = new Float("12.3");
		System.out.println(f1);
		System.out.println(f2);
		
		Boolean b1 = true;
		Boolean b2 = new Boolean("true");
		System.out.println(b2);//false
		Boolean b3 = new Boolean("true123");
		System.out.println(b3);//false
		
		Order order = new Order();
		System.out.println(order.isMale);//false  û�и���ֵ��ΪĬ��ֵ
		System.out.println(order.isFemale);//null
		
	}
	
}

class Order{
	boolean isMale;
	Boolean isFemale; //�Ǹ���
}


