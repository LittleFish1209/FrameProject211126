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
		
		//对象的多态性:父类的引用指向子类的对象
		//左边父类，右边new一个子类对象，就是多态
		Person p2 = new Man();
		
		Person p3 = new Woman();
		
		//多态的使用:当调用子父类同名同参数的方法时，实际执行的时子类重写父类的方法 --虚拟方法调用
		p2.eat();
		p2.walk();
		
//		p2.earn();  //undefined  父类没有这个方法
		//无法这样声明的原因：我们声明的是person类型(16行), person类中没有这个方法
		//编译看左 运行向右
		System.out.println("************");
		
		p2.name = "Tom";
//		p2.isSmoking = true;
		//有了对象的多态性以后，内存中实际上时加载了子类特有的属性和方法
		//但是对象由于声明父类类型，导致编译时只能调用父类中声明的属性和方法
		//子类特有的属性和方法不能调用。
		
		//如何才能调用子类也有的属性和方法？
		//使用强制类型转换符
		Man m1=(Man)p2; //把声明为person的强制转换为Man
		m1.earn();
		m1.isSmoking = true;
		
		//使用强转时，可能出现ClassCastException
//		Woman w1 = (Woman)p2;
//		w1.goShopping();
		
		
		/*
		 * Woman w1 = (Woman)p2; w1.goShopping(); //编译过但运行出错
		 */		//不能子类之间强转
		/*
		 * instanceof关键字的使用
		 * 
		 * a instanceof A:判断对象a是否是类A的实例。如果是，返回true,如果不是，返回false
		 * 
		 * 使用情境：为了避免在向下转型时出现ClassCastException的异常，我们在转型前，先进行
		 * instanceof判断
		 */
		if(p2 instanceof Woman) {
			Woman w1 = (Woman)p2;
			w1.goShopping();
			System.out.println("*****Woman****");
		}
		//没有显示
		
		
		if(p2 instanceof Man) {
			Man m2 = (Man)p2;
			m2.earn();
			System.out.println("*****Man****");
		}
		if(p2 instanceof Person) {
			System.out.println("*********");
		}
		
		//练习
		//问题一：编译时通过，运行时不通过
//		Person p4 = new Woman();
//		Man m3 = (Man)p4;
		
//		Person p4 = new Person();
//		Man m4 = (Man)p4;
		//不能强转成子类
		
		//问题2：编译运行都通过
		Object obj = new Woman();
		Person p = (Person)obj;
		
		//问题3 编译不过
//		Man m5 = new Woman();
		
//		String str =  new Date();
		
//		Object o = new Date();
//		String str1 =(String)o;
		
		
		
		
	}
	
}
