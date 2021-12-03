package com.atguigu.java1;

public class Customer {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Customer() {
		super();
	}
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//�Զ����ɵ�equals()  �ÿ�����ɹ�������get set�ķ�����������
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	//�ֶ�ʵ��equals()
	//��д��ԭ��:�Ƚ����������ʵ�����ݣ���name��age���Ƿ���ͬ
	/*
	 * @Override public boolean equals(Object obj) { if(this == obj) { return true;
	 * }
	 * 
	 * if(obj instanceof Customer) { Customer cust = (Customer)obj;
	 * //�Ƚ����������ÿ�������Ƿ���ͬ if(this.age == cust.age && this.name.equals(cust.name)) {
	 * return true; }else { return false; }
	 * 
	 * //�� //return this.age == cust.age && this.name.equals(cust.name); } return
	 * false; }
	 */
	
//	@Override
//	public String toString() {
//		return "Customer[name = " + name + ",age=" + age +"]";
//	}
//	
	
	//Ҳ�ɿ�ݽ��Զ�����
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
