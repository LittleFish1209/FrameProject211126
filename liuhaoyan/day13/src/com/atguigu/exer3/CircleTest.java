package com.atguigu.exer3;

public class CircleTest {
	public static void main(String[] args) {
	
	Circle circle1 = new Circle(2.3);
	Circle circle2 = new Circle(2.3,"white",2.0);	
	
	System.out.println("��ɫ�Ƿ����: " + circle1.getColor().equals(circle2.getColor()));
	
	System.out.println("�뾶�Ƿ����: "+ (circle1.getRadius()==circle2.getRadius()));
	System.out.println("�뾶�Ƿ����: "+ circle1.equals(circle2));
	
	System.out.println(circle1);
	System.out.println(circle2.toString());
	
	
	}
}
