package com.java;

public class StringTester {

	public static void main(String[] args) {
		String S1="RAJ";//Object created on SCP area
		String S2="RAJ";//S2 is refering S1 object 
		String S3="kaj";
		String S4=new String(S1);//new Object is created on Heap area so different object Reference is there on S4

		System.out.println(".equals Method Content comparison");
		System.out.println(S1.equals(S2));//true
		System.out.println(S2.equals(S3));//false always
		System.out.println(S4.equals(S1));//true
		
		System.out.println("== operator reference comparison");
		System.out.println(S1==S2);//true
		System.out.println(S2.equals(S3));//false always
		System.out.println(S4==S1);//false


	}

}
