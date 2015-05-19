package com.clearserve.codechallenge;

public class Test {
	public static void main(String[] args) {
		Terminal t1 = new Terminal();
		t1.scan("BBACDAAA");
		System.out.println("Fist terminal total: $" + t1.getTotalPrice());
		
		Terminal t2 = new Terminal();
		t2.scan("CCCCCCC");
		System.out.println("Second terminal total: $" + t2.getTotalPrice());
		
		Terminal t3 = new Terminal();
		t3.scan("ABCD");
		System.out.println("Third terminal total: $" + t3.getTotalPrice());
		
		Terminal t4 = new Terminal();
		t4.scan("CCCAACACACACA");
		// 6 As = (4 for $7 bundle + 2 at $2 each) = $11
		// 7 Cs = (6 for $6 bundle + 1 at $1.25) = $7.25
		// Total $18.25
		System.out.println("Fourth terminal total: $" + t4.getTotalPrice());
		
		Terminal t5 = new Terminal();
		t5.scan("AAAAAA");
		// 5 As = (4 As for $7 + 1 A at $2)
		// Total = $11
		System.out.println("Fifth terminal total: $" + t5.getTotalPrice());
	}
}
