package com.atguigu.java;

import java.util.Date;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earn();
		
		//����Ķ�̬��:���������ָ������Ķ���
		//��߸��࣬�ұ�newһ��������󣬾��Ƕ�̬
		Person p2 = new Man();
		
		Person p3 = new Woman();
		
		//��̬��ʹ��:�������Ӹ���ͬ��ͬ�����ķ���ʱ��ʵ��ִ�е�ʱ������д����ķ��� --���ⷽ������
		p2.eat();
		p2.walk();
		
//		p2.earn();  //undefined  ����û���������
		//�޷�����������ԭ��������������person����(16��), person����û���������
		//���뿴�� ��������
		System.out.println("************");
		
		p2.name = "Tom";
//		p2.isSmoking = true;
		//���˶���Ķ�̬���Ժ��ڴ���ʵ����ʱ�������������е����Ժͷ���
		//���Ƕ������������������ͣ����±���ʱֻ�ܵ��ø��������������Ժͷ���
		//�������е����Ժͷ������ܵ��á�
		
		//��β��ܵ�������Ҳ�е����Ժͷ�����
		//ʹ��ǿ������ת����
		Man m1=(Man)p2; //������Ϊperson��ǿ��ת��ΪMan
		m1.earn();
		m1.isSmoking = true;
		
		//ʹ��ǿתʱ�����ܳ���ClassCastException
//		Woman w1 = (Woman)p2;
//		w1.goShopping();
		
		
		/*
		 * Woman w1 = (Woman)p2; w1.goShopping(); //����������г���
		 */		//��������֮��ǿת
		/*
		 * instanceof�ؼ��ֵ�ʹ��
		 * 
		 * a instanceof A:�ж϶���a�Ƿ�����A��ʵ��������ǣ�����true,������ǣ�����false
		 * 
		 * ʹ���龳��Ϊ�˱���������ת��ʱ����ClassCastException���쳣��������ת��ǰ���Ƚ���
		 * instanceof�ж�
		 */
		if(p2 instanceof Woman) {
			Woman w1 = (Woman)p2;
			w1.goShopping();
			System.out.println("*****Woman****");
		}
		//û����ʾ
		
		
		if(p2 instanceof Man) {
			Man m2 = (Man)p2;
			m2.earn();
			System.out.println("*****Man****");
		}
		if(p2 instanceof Person) {
			System.out.println("*********");
		}
		
		//��ϰ
		//����һ������ʱͨ��������ʱ��ͨ��
//		Person p4 = new Woman();
//		Man m3 = (Man)p4;
		
//		Person p4 = new Person();
//		Man m4 = (Man)p4;
		//����ǿת������
		
		//����2���������ж�ͨ��
		Object obj = new Woman();
		Person p = (Person)obj;
		
		//����3 ���벻��
//		Man m5 = new Woman();
		
//		String str =  new Date();
		
//		Object o = new Date();
//		String str1 =(String)o;
		
		
		
		
	}
	
}
