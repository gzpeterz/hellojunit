package com.hc.hellojunit;

public class Calculator {
	// from  peter
	public static int result; // 静态变量，用于存储运行结果
	
	public void peter() {
		System.out.println("sadfas");
	}

	public void add(int n) {
		result = result + n;
	}

	public void substract(int n) {
		result = result - n; // Bug: 正确的应该是 result =result-n
	}

	public void multiply(int n) {
		result *= n;
	} // 此方法尚未写好
	// from u22

	public void divide(int n) {
		result = result / n;
	}

	public void square(int n) {
		result = n * n;
	}

	public void squareRoot(int n) {
		for (;;)
			; // Bug : 死循环
		// result = (int)Math.sqrt((double)n);
	}

	public void clear() { // 将结果清零
		result = 0;
	}

	public int getResult() {
		return result;
	}
}