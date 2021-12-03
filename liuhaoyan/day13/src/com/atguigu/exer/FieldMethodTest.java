package com.atguigu.exer;

/*��ϰ��
1.��������д�˸��෽��������ζ�������ﶨ��ķ���  ���׸����˸������ͬ��������
ϵͳ�����ܰѸ���ķ���ת�Ƶ�������

Base b = s; //��̬��
Base b = new Sub(); 

���뿴�����п���
���Կ��󣬷������ң�

2.����ʵ�������򲻴������������󣬼�ʹ�����ﶨ�����븸����ȫ��ͬ��ʵ��������
���ʵ��������Ȼ   �����ܸ��Ǹ����ж����ʵ������
*/
class Base{
	int count = 10;
	
	public void display() {
		System.out.println(this.count);
	}
}
class Sub extends Base{
	int count = 20;
	
	public void display() {
		System.out.println(this.count);
	}
}

public class FieldMethodTest {
	public static void main(String[] args) {
	Sub s = new Sub();
	System.out.println(s.count); //20 �������������Ҳ������Ҹ��� �����������ڴ��ַ��
	s.display();//20
	
	//==:�����������������������Ƚϵ������������������ͱ����ĵ�ֵַ�Ƿ���ͬ
	Base b = s; //��̬��
	System.out.println(b == s); //true ����ͬʱָ���˶ѿռ��еĶ���
	System.out.println(b.count); //10
	b.display(); //10
}
}
