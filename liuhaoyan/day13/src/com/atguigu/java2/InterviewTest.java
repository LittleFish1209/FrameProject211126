package com.atguigu.java2;

import org.junit.Test;

public class InterviewTest {
	@Test
	public void test3() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);//false
		
		//Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[],
		//保存了从-128~127范围的整数。如果我们使用自动装箱的方式，给Integer赋值的范围在
		//-128~127范围内时，可以直接使用数组中的元素，不用再去new。目的:提高效率
		
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);
		
		Integer x = 128;//装箱有范围
		Integer y = 128;
		System.out.println(x == y);
		
		Integer z = new Integer(999);
		System.out.println(z);//999
	}
}
