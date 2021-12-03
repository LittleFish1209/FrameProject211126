package com.atguigu.exer2;

public class OrderTest {
	public static void main(String[] args) {
	Order order1 = new Order(1001,"AA");
	Order order2 = new Order(1001,"BB");
	
	System.out.println(order1.equals(order2)); //false
	
	Order order3 = new Order(1001,"BB");
	System.out.println(order2.equals(order3)); //true
}

	
	
}

class Order{
	private int orderId;
	private String orderName;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Order) {
			Order order = (Order)obj;  //���һ����ʵ�Ķ������е����� ����ת�� ��ת������
			
			return this.orderId == order.orderId && this.orderName.equals(order.orderName);
		}
		return false;
	}
}